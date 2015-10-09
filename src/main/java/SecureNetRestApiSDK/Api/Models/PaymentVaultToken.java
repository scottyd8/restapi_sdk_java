//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;


/**
* Data from a Vault payment account.
*/
public class PaymentVaultToken   
{
    /**
    * Customer identifier.
    */
    private String customerId = new String();
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    /**
    * Payment method to be used for billing.
    */
    private String paymentMethodId = new String();
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String value) {
        paymentMethodId = value;
    }

    /**
    * Public Key used to identify the mechant.
    */
    private String publicKey = new String();
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String value) {
        publicKey = value;
    }

    /**
    * Payment type that is stored or about to be stored in the Vault.
    */
    private String paymentType = new String();
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String value) {
        paymentType = value;
    }

}


