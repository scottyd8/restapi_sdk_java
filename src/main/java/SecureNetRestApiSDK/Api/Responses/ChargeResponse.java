//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Models.Transaction;
import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class ChargeResponse  extends SecureNetResponse 
{
    private Transaction transaction;
    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction value) {
        transaction = value;
    }

}


