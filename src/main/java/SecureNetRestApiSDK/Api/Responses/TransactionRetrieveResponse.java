//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import java.util.ArrayList;
import java.util.List;

import SecureNetRestApiSDK.Api.Models.Transaction;

public class TransactionRetrieveResponse  extends SecureNetResponse 
{
    private List<Transaction> transactions = new ArrayList<Transaction>();
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> value) {
        transactions = value;
    }

}


