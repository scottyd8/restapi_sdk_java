//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.Encryption;
import SecureNetRestApiSDK.Api.Models.ExtendedInformation;
import SecureNetRestApiSDK.Api.Models.PaymentVaultToken;

/**
* Request class used for authorizing a transaction.
*/
public class AuthorizeRequest  extends SecureNetRequest 
{
    /**
    * Amount of the charge to be authorized.
    */
    private double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        amount = value;
    }

    /**
    * Credit-card-specific data. In the case of a card-present transaction, track data from a swiped transaction is the most commonly used property. Required for credit card charges.
    */
    private Card card;
    public Card getCard() {
        return card;
    }

    public void setCard(Card value) {
        card = value;
    }


    /**
    * Data from a Vault payment account. Required for transactions where a Vault token is sent in the place of card or check data.
    */
    private PaymentVaultToken paymentVaultToken;
    public PaymentVaultToken getPaymentVaultToken() {
        return paymentVaultToken;
    }

    public void setPaymentVaultToken(PaymentVaultToken value) {
        paymentVaultToken = value;
    }

    /**
    * Indicates whether the card object is to be added to the vault to be stored as a token.
    */
    private boolean addToVault;
    public boolean getAddToVault() {
        return addToVault;
    }

    public void setAddToVault(boolean value) {
        addToVault = value;
    }

    /**
    * Indicates whether the card object is to be added to the vault to be stored as a token even if the attempted authorization is declined.
    */
    private boolean addToVaultOnFailure;
    public boolean getAddToVaultOnFailure() {
        return addToVaultOnFailure;
    }

    public void setAddToVaultOnFailure(boolean value) {
        addToVaultOnFailure = value;
    }

    /**
    * Typically used as an optional field for pin debit processing. The value of cashBackAmount indicates the amount in cash to be given back to the customer during card processing.
    */
    private double cashBackAmount;
    public double getCashBackAmount() {
        return cashBackAmount;
    }

    public void setCashBackAmount(double value) {
        cashBackAmount = value;
    }

    /**
    * Indicates whether it is permissible to authorize less than the total balance available on a prepaid card.
    */
    private boolean allowPartialChanges;
    public boolean getAllowPartialChanges() {
        return allowPartialChanges;
    }

    public void setAllowPartialChanges(boolean value) {
        allowPartialChanges = value;
    }

    /**
    * Indicates how checks for duplicate transactions should behave. Duplicates are evaluated on the basis of amount, card number, and order ID; these evaluation criteria can be
    * extended to also include customer ID, invoice number, or a user-defined field. Valid values for this parameter are:
    * 0 - No duplicate check
    * 1 - Exception code is returned in case of duplicate
    * 2 - Previously existing transaction is returned in case of duplicate
    * 3 - Check is performed as above but without using order ID, and exception code is returned in case of duplicate
    * The transactionDuplicateCheckIndicator parameter must be enabled in the Virtual Terminal under Tools->Duplicate Transactions. Duplicates are checked only for APPROVED transactions.
    */
    private int transactionDuplicateCheckIndicator;
    public int getTransactionDuplicateCheckIndicator() {
        return transactionDuplicateCheckIndicator;
    }

    public void setTransactionDuplicateCheckIndicator(int value) {
        transactionDuplicateCheckIndicator = value;
    }

    /**
    * Client-generated unique ID for each transaction, used as a way to prevent the processing of duplicate transactions. The orderId must be unique to the merchant's SecureNet ID;
    * however, uniqueness is only evaluated for APPROVED transactions and only for the last 30 days. If a transaction is declined, the corresponding orderId may be used again.
    * (NOTE: orderId is not used in Prior Auth Capture.)
    * The orderId is limited to 25 characters; e.g., â€œCUSTOMERID MMddyyyyHHmmssâ€�.
    */
    private String orderId = new String();
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String value) {
        orderId = value;
    }

    /**
    * Encryption mode for the transaction. Required when using device-based encryption.
    */
    private Encryption encryption;
    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption value) {
        encryption = value;
    }

    /**
    * Additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information.
    */
    private ExtendedInformation extendedInformation;
    public ExtendedInformation getExtendedInformation() {
        return extendedInformation;
    }

    public void setExtendedInformation(ExtendedInformation value) {
        extendedInformation = value;
    }

    public String getUri() throws Exception {
        return "api/Payments/Authorize";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}


