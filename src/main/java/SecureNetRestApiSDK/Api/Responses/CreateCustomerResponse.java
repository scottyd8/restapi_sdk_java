//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Models.VaultCustomer;
import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class CreateCustomerResponse  extends SecureNetResponse 
{
    private VaultCustomer vaultCustomer;
    public VaultCustomer getVaultCustomer() {
        return vaultCustomer;
    }

    public void setVaultCustomer(VaultCustomer value) {
    	vaultCustomer = value;
    }

    private String customerId = new String();
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
    	customerId = value;
    }

}


