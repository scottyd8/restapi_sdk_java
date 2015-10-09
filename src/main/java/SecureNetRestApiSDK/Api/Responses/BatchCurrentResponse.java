//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class BatchCurrentResponse  extends SecureNetResponse 
{
    private String batchId = new String();
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String value) {
        batchId = value;
    }

    private Object transactions = new Object();
    public Object getTransactions() {
        return transactions;
    }

    public void setTransactions(Object value) {
        transactions = value;
    }

    private int batchCount;
    public int getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(int value) {
        batchCount = value;
    }

}


