//
//

package SNET.Core;


import java.util.Dictionary;
import java.util.Hashtable;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;

public class APIContext
{
    private String requestId = new String();
    private Dictionary<String, String> dynamicConfig = new Hashtable<String, String>();
    private Dictionary<String, String> httpHeaders = new Hashtable<String, String>();
    public String getRequestId() throws Exception {
        String str = (String)null;
        if (StringUtils.isNotBlank(this.requestId))
            this.requestId = UUID.randomUUID().toString();
         
        str = this.requestId;
        return str;
    }

    public Dictionary<String, String> getConfig() throws Exception {
        return this.dynamicConfig;
    }

    public void setConfig(Dictionary<String, String> value) throws Exception {
        this.dynamicConfig = value;
    }

    public Dictionary<String, String> getHTTPHeaders() throws Exception {
        return this.httpHeaders;
    }

    public void setHTTPHeaders(Dictionary<String, String> value) throws Exception {
        this.httpHeaders = value;
    }

    public APIContext() throws Exception {
    }

}


