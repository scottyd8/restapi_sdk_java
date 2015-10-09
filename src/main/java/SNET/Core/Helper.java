//
//

package SNET.Core;


import java.net.URI;
import java.util.Dictionary;
import java.util.Enumeration;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.StringUtils;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;


public abstract class Helper   
{
    public static String configureAndExecute(APIContext apiContext, HttpMethodEnum httpMethod, String resource, String payload) throws Exception {
        if (apiContext == null)
            throw new Exception("APIContext object is null");
         
        Dictionary<String, String> config = apiContext.getConfig();
        String resourcePath = resource;
        Dictionary<String, String> httpHeaders = apiContext.getHTTPHeaders();
        String requestId = apiContext.getRequestId();
        IAPICallPreHandler iApiCallPreHandler = Helper.createIAPICallPreHandler(config, httpHeaders, requestId, payload);
        return Helper.configureAndExecute(config, iApiCallPreHandler, httpMethod, resourcePath);
    }

    private static IAPICallPreHandler createIAPICallPreHandler(Dictionary<String, String> config, Dictionary<String, String> headersMap, String requestId, String payLoad) throws Exception {
        return (IAPICallPreHandler)new RestApiCallPreHandler(config, headersMap,requestId,payLoad);
    }

    private static String configureAndExecute(Dictionary<String, String> config, IAPICallPreHandler apiCallPreHandler, HttpMethodEnum httpMethod, String resourcePath) throws Exception {
    	Dictionary<String, String> headerMap = apiCallPreHandler.getHeaderMap();
    	URI baseUri = new URI(apiCallPreHandler.getEndpoint()+resourcePath);
    	
    	//ConnectionManager instance = ConnectionManager.getInstance();
    	//instance.getConnection(config, baseUri.toString());
    	ClientConfig clientConfig = new ClientConfig();
    	clientConfig.property(ClientProperties.SUPPRESS_HTTP_COMPLIANCE_VALIDATION, true);
    	Client  client = ClientBuilder.newClient(clientConfig);
    	System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    	Invocation.Builder builder = client.target(baseUri).request();
    	setHttpHeaders(headerMap, builder);
    	Response response = null;
        try
        {
        	if(HttpMethodEnum.GET.equals(httpMethod)){
        		response = builder.get();
        	}
        	else{
        		response = builder.method(httpMethod.toString(), Entity.json(apiCallPreHandler.getPayload()));
        	}
            return response.readEntity(String.class);
        }
        catch (Exception ex)
        {
        	ex.printStackTrace();
        	if(response != null){
        		if(response.getStatus() != 200){
        	        System.out.println(response.getStatusInfo().getReasonPhrase());
        		}
        	}
            throw ex;
        }
    
    }
    
    private static void setHttpHeaders(Dictionary<String, String> headerMap, Builder builder){
    	if (headerMap != null && StringUtils.isNotBlank(headerMap.get("Content-Type")))
        {
    		builder.header("Content-Type", headerMap.get("Content-Type"));
            headerMap.remove("Content-Type");
        }
        else
        	builder.header("Content-Type", "application/json");
        if (headerMap.get("User-Agent") != null)
        {
        	builder.header("User-Agent", headerMap.get("User-Agent"));
            headerMap.remove("User-Agent");
        }
         
        Enumeration<String> keys = headerMap.keys();
        while (keys.hasMoreElements())
        {
        	String key = keys.nextElement();
        	builder.header(key, headerMap.get(key));
        }
    }

	/*
	 * private static void setHttpHeaders(Dictionary<String, String> headerMap,
	 * HttpURLConnection connection) throws Exception { if (headerMap != null &&
	 * StringUtils.isNotBlank(headerMap.get("Content-Type"))) {
	 * connection.setRequestProperty("Content-Type",
	 * headerMap.get("Content-Type")); headerMap.remove("Content-Type"); } else
	 * connection.setRequestProperty("Content-Type", "application/json"); if
	 * (headerMap.get("User-Agent") != null) {
	 * connection.setRequestProperty("User-Agent", headerMap.get("User-Agent"));
	 * headerMap.remove("User-Agent"); }
	 * 
	 * Enumeration<String> keys = headerMap.keys(); while
	 * (keys.hasMoreElements()) { String key = keys.nextElement();
	 * connection.setRequestProperty(key, headerMap.get(key)); } }
	 * 
	 * private static HttpURLConnection
	 * createHttpWebRequestConnection(Dictionary<String, String> config,
	 * HttpMethodEnum httpMethod, URI result, ConnectionManager instance) throws
	 * Exception { HttpURLConnection con = (HttpURLConnection)
	 * result.toURL().openConnection();
	 * con.setRequestMethod(httpMethod.toString()); con.setUseCaches(false);
	 * con.setDoInput(true); con.setDoOutput(true); return con; }
	 */
}


