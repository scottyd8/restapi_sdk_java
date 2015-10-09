//
//

package SNET.Core;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Dictionary;

public final class ConnectionManager
{
	private volatile static ConnectionManager connectionManager = null;
   private ConnectionManager(){
	   super();
   }
   
    public static ConnectionManager getInstance() throws Exception {
    	if(ConnectionManager.connectionManager == null){
    		ConnectionManager.connectionManager = new ConnectionManager();
    	}
        return ConnectionManager.connectionManager;
    }

    public HttpURLConnection getConnection(Dictionary<String, String> config, String url) throws Exception {
    	HttpURLConnection httpWebRequest = null;
            httpWebRequest = (HttpURLConnection)new URL(url).openConnection();
            httpWebRequest.setConnectTimeout(Integer.parseInt(config.get("connectionTimeout").toString()));

        return httpWebRequest;
    }

}


