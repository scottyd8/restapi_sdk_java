//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;

public class TransactionUpdateRequest  extends SecureNetRequest 
{
    private int referenceTransactionId;
    public int getReferenceTransactionId() {
        return referenceTransactionId;
    }

    public void setReferenceTransactionId(int value) {
        referenceTransactionId = value;
    }

    private String dutyAmount = new String();
    public String getDutyAmount() {
        return dutyAmount;
    }

    public void setDutyAmount(String value) {
        dutyAmount = value;
    }

    public String getUri() throws Exception {
        return String.format("api/transactions/%d", getReferenceTransactionId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.PUT;
    }

}


