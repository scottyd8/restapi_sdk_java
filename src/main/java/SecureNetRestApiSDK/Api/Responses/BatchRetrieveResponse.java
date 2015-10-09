//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import java.util.ArrayList;
import java.util.List;

import SecureNetRestApiSDK.Api.Models.Transaction;

public class BatchRetrieveResponse  extends SecureNetResponse 
{
    private String batchId = new String();
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String value) {
        batchId = value;
    }

    private List<Transaction> transactions = new ArrayList<Transaction>();
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> value) {
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


