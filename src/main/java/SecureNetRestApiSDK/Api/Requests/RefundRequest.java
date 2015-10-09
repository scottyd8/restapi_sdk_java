//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;

public class RefundRequest  extends SecureNetRequest 
{
    private int transactionId;
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int value) {
        transactionId = value;
    }

    public String getUri() throws Exception {
        return "api/Payments/Refund";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}


