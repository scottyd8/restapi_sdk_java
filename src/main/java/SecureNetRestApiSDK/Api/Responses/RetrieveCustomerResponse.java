//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Models.VaultCustomer;
import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class RetrieveCustomerResponse  extends SecureNetResponse 
{
    private VaultCustomer vaultCustomer;
    private String customerId;
    
    public VaultCustomer getVaultCustomer() {
        return vaultCustomer;
    }

    public void setVaultCustomer(VaultCustomer value) {
        vaultCustomer = value;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

}


