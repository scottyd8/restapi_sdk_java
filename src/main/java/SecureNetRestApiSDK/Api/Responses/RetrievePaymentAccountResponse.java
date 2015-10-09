//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Models.VaultPaymentMethod;
import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class RetrievePaymentAccountResponse  extends SecureNetResponse 
{
    private VaultPaymentMethod vaultPaymentMethod;
    public VaultPaymentMethod getVaultPaymentMethod() {
        return vaultPaymentMethod;
    }

    public void setVaultPaymentMethod(VaultPaymentMethod value) {
        vaultPaymentMethod = value;
    }

}


