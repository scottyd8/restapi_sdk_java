//
//

package SNET.Core;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

import com.google.gson.Gson;

public class RestApiCallPreHandler implements IAPICallPreHandler {
	private String requestId;
	private Dictionary<String, String> config;
	private Dictionary<String, String> headersMap;
	private String payload;

	public String getRequestId() throws Exception {
		return this.requestId;
	}

	public void setRequestId(String value) {
		this.requestId = value;
	}

	public String getPayload() {
		return this.payload;
	}
	
	public void setPayload(String value){
		this.payload = value;
	}


	public RestApiCallPreHandler(Dictionary<String, String> config,
			Dictionary<String, String> headersMap,String requestId, String payload) throws Exception {
		this.config = config;
		this.headersMap = headersMap == null ? new Hashtable<String, String>()
				: headersMap;
		this.requestId = requestId;
		this.payload = payload;
	}

	public Dictionary<String, String> getHeaderMap() throws Exception {
		return this.getProcessedHeadersMap();
	}

	public String getEndpoint() throws Exception {
		return this.getProcessedEndPoint();
	}

	protected Dictionary<String, String> getProcessedHeadersMap()
			throws Exception {
		Dictionary<String, String> dictionaryMap = new Hashtable<String, String>();
		if (!StringUtils.isBlank(this.getSecureNetId())
				&& !StringUtils.isBlank(this.getSecureKey()))
			dictionaryMap.put(
					"Authorization",
					"Basic "
							+ this.encodeToBase64(this.getSecureNetId(),
									this.getSecureKey()));

		if (!StringUtils.isBlank(this.getRequestId()))
			dictionaryMap.put("SecureNet-Request-Id", this.getRequestId());

		Dictionary<String, String> dictionaryMapAgent = this
				.formUserAgentHeader(this.getDeveloperId(),
						this.getDeveloperId());
		if (dictionaryMapAgent != null && dictionaryMapAgent.size() > 0) {
			Enumeration<String> keys = dictionaryMapAgent.keys();
			while (keys.hasMoreElements()) {
				String currentKey = keys.nextElement();
				dictionaryMap.put(currentKey,
						dictionaryMapAgent.get(currentKey));
			}
		}

		if (this.headersMap != null && this.headersMap.size() > 0) {
			Enumeration<String> keys = this.headersMap.keys();
			while (keys.hasMoreElements()) {
				String currentKey = keys.nextElement();
				dictionaryMap.put(currentKey, this.headersMap.get(currentKey));
			}
		}

		return dictionaryMap;
	}

	protected String getProcessedEndPoint() throws Exception {
		String str = (String) null;
		if (StringUtils.isNotBlank(this.config.get("endpoint")))
			str = this.config.get("endpoint");
		else if (StringUtils.isNotBlank(this.config.get("mode"))) {
			String _dummyScrutVar0 = this.config.get("mode");
			if (_dummyScrutVar0.equals("live")) {
				str = "https://gwapi.demo.securenet.com/";
			} else if (_dummyScrutVar0.equals("sandbox")) {
				str = "https://gwapi.demo.securenet.com/";
			}

		}

		if (!str.endsWith("/"))
			str = str + "/";

		return str;
	}

	protected Dictionary<String, String> formUserAgentHeader(
			String developerId, String versionId) throws Exception {
		return new UserAgentHeader(developerId, versionId).getHeader();
	}

	private String getSecureNetId() throws Exception {
		if (StringUtils.isBlank(this.config.get("secureNetId")))
			return (String) null;
		else
			return this.config.get("secureNetId");
	}

	private String getSecureKey() throws Exception {
		if (StringUtils.isBlank(this.config.get("secureKey")))
			return (String) null;
		else
			return this.config.get("secureKey");
	}

	private String getDeveloperId() throws Exception {
		if (StringUtils.isBlank(this.config.get("developerId")))
			return (String) null;
		else
			return this.config.get("developerId");
	}

	private String getVersionId() {
		if (StringUtils.isBlank(this.config.get("versionid")))
			return (String) null;
		else
			return this.config.get("versionid");
	}

	private String encodeToBase64(String secureNetId, String secureKey)
			throws Exception {
		try {
			return new Base64().encodeToString((secureNetId + ":" + secureKey)
					.getBytes());
		} catch (Exception ex) {
			throw ex;
		}

	}

}
