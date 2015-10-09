//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SecureNetRestApiSDK.Api.Requests.SecureNetRequest;
import SNET.Core.HttpMethodEnum;

public class BatchRetrieveRequest  extends SecureNetRequest 
{
    private int id  ;
    public int getId() {
        return id;
    }

    public void setId(int value) {
        id = value;
    }

    public String getUri() throws Exception {
        return String.format("api/batches/%d", getId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.GET;
    }

}


