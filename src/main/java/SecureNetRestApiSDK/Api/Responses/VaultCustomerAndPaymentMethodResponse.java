//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Models.VaultCustomer;
import SecureNetRestApiSDK.Api.Models.VaultPaymentMethod;
import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class VaultCustomerAndPaymentMethodResponse  extends SecureNetResponse 
{
    private VaultCustomer vaultCustomer;
    public VaultCustomer getVaultCustomer() {
        return vaultCustomer;
    }

    public void setVaultCustomer(VaultCustomer value) {
        vaultCustomer = value;
    }

    private VaultPaymentMethod vaultPaymentMethod;
    public VaultPaymentMethod getVaultPaymentMethod() {
        return vaultPaymentMethod;
    }

    public void setVaultPaymentMethod(VaultPaymentMethod value) {
        vaultPaymentMethod = value;
    }

    private int accountResponseCode;
    public int getAccountResponseCode() {
        return accountResponseCode;
    }

    public void setAccountResponseCode(int value) {
        accountResponseCode = value;
    }

    private Object accountResponseMessage = new Object();
    public Object getAccountResponseMessage() {
        return accountResponseMessage;
    }

    public void setAccountResponseMessage(Object value) {
        accountResponseMessage = value;
    }

    private boolean accountSuccess;
    public boolean getAccountSuccess() {
        return accountSuccess;
    }

    public void setAccountSuccess(boolean value) {
        accountSuccess = value;
    }

    private String accountResult = new String();
    public String getAccountResult() {
        return accountResult;
    }

    public void setAccountResult(String value) {
        accountResult = value;
    }

    private String accountMessage = new String();
    public String getAccountMessage() {
        return accountMessage;
    }

    public void setAccountMessage(String value) {
        accountMessage = value;
    }

    private int customerResponseCode;
    public int getCustomerResponseCode() {
        return customerResponseCode;
    }

    public void setCustomerResponseCode(int value) {
        customerResponseCode = value;
    }

    private Object customerResponseMessage = new Object();
    public Object getCustomerResponseMessage() {
        return customerResponseMessage;
    }

    public void setCustomerResponseMessage(Object value) {
        customerResponseMessage = value;
    }

    private boolean customerSuccess;
    public boolean getCustomerSuccess() {
        return customerSuccess;
    }

    public void setCustomerSuccess(boolean value) {
        customerSuccess = value;
    }

    private String customerResult = new String();
    public String getCustomerResult() {
        return customerResult;
    }

    public void setCustomerResult(String value) {
        customerResult = value;
    }

    private String customerMessage = new String();
    public String getCustomerMessage() {
        return customerMessage;
    }

    public void setCustomerMessage(String value) {
        customerMessage = value;
    }

}


