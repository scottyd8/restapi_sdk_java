//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SecureNetRestApiSDK.Api.Requests.SecureNetRequest;
import SNET.Core.HttpMethodEnum;

public class BatchCurrentRequest  extends SecureNetRequest 
{
    public String getUri() throws Exception {
        return "api/batches/Current";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.GET;
    }

}


