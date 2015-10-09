//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.Check;
import SecureNetRestApiSDK.Api.Models.Encryption;
import SecureNetRestApiSDK.Api.Models.ExtendedInformation;
import SecureNetRestApiSDK.Api.Models.PaymentVaultToken;

/**
 * Request class used for issuing a transaction.
 */
public class ChargeRequest extends SecureNetRequest {
	/**
	 * Amount to charge the account.
	 */
	private double amount;
	/**
	 * Credit-card-specific data. Required for credit card charges.
	 */
	private Card card;
	/**
	 * Check-specific data.
	 */
	private Check check;
	/**
	 * Contains developer Id and version information related to the integration.
	 */
	
	/**
	 * Data from a Vault payment account. Required for transactions where a
	 * Vault token is sent in the place of card or check data.
	 */
	private PaymentVaultToken paymentVaultToken;
	/**
	 * Indicates whether the card object is to be added to the vault to be
	 * stored as a token.
	 */
	private boolean addToVault;
	/**
	 * Indicates whether the card object is to be added to the vault to be
	 * stored as a token even if the attempted authorization is declined.
	 */
	private boolean addToVaultOnFailure;
	/**
	 * Typically used as an optional field for pin debit processing. The value
	 * of cashBackAmount indicates the amount in cash to be given back to the
	 * customer during card processing.
	 */
	private double cashBackAmount;
	/**
	 * Indicates whether it is permissible to authorize less than the total
	 * balance available on a prepaid card.
	 */
	private boolean allowPartialChanges;
	private ExtendedInformation extendedInformation;
	private int transactionDuplicateCheckIndicator;
	private String orderId = new String();
	private Encryption encryption;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double value) {
		amount = value;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card value) {
		card = value;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check value) {
		check = value;
	}


	public PaymentVaultToken getPaymentVaultToken() {
		return paymentVaultToken;
	}

	public void setPaymentVaultToken(PaymentVaultToken value) {
		paymentVaultToken = value;
	}

	public boolean getAddToVault() {
		return addToVault;
	}

	public void setAddToVault(boolean value) {
		addToVault = value;
	}

	public boolean getAddToVaultOnFailure() {
		return addToVaultOnFailure;
	}

	public void setAddToVaultOnFailure(boolean value) {
		addToVaultOnFailure = value;
	}

	public double getCashBackAmount() {
		return cashBackAmount;
	}

	public void setCashBackAmount(double value) {
		cashBackAmount = value;
	}

	public boolean getAllowPartialChanges() {
		return allowPartialChanges;
	}

	public void setAllowPartialChanges(boolean value) {
		allowPartialChanges = value;
	}

	/**
	 * Additional data to assist in reporting, ecommerce or moto transactions,
	 * and level 2 or level 3 processing. Includes user-defined fields and
	 * invoice-related information.
	 */
	public ExtendedInformation getExtendedInformation() {
		return extendedInformation;
	}

	public void setExtendedInformation(ExtendedInformation value) {
		extendedInformation = value;
	}

	/**
	 * Indicates how checks for duplicate transactions should behave. Duplicates
	 * are evaluated on the basis of amount, card number, and order ID; these
	 * evaluation criteria can be extended to also include customer ID, invoice
	 * number, or a user-defined field. Valid values for this parameter are: 0 -
	 * No duplicate check 1 - Exception code is returned in case of duplicate 2
	 * - Previously existing transaction is returned in case of duplicate 3 -
	 * Check is performed as above but without using order ID, and exception
	 * code is returned in case of duplicate The
	 * transactionDuplicateCheckIndicator parameter must be enabled in the
	 * Virtual Terminal under Tools->Duplicate Transactions. Duplicates are
	 * checked only for APPROVED transactions.
	 */
	public int getTransactionDuplicateCheckIndicator() {
		return transactionDuplicateCheckIndicator;
	}

	public void setTransactionDuplicateCheckIndicator(int value) {
		transactionDuplicateCheckIndicator = value;
	}

	/**
	 * Client-generated unique ID for each transaction, used as a way to prevent
	 * the processing of duplicate transactions. The orderId must be unique to
	 * the merchant's SecureNet ID; however, uniqueness is only evaluated for
	 * APPROVED transactions and only for the last 30 days. If a transaction is
	 * declined, the corresponding orderId may be used again. The orderId is
	 * limited to 25 characters; e.g., â€œCUSTOMERID MMddyyyyHHmmssâ€�.
	 */
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String value) {
		orderId = value;
	}

	/**
	 * Encryption mode for the transaction. Required when using device-based
	 * encryption.
	 */
	public Encryption getEncryption() {
		return encryption;
	}

	public void setEncryption(Encryption value) {
		encryption = value;
	}

	public String getUri() throws Exception {
		return "api/Payments/Charge";
	}

	public HttpMethodEnum getMethod() throws Exception {
		return HttpMethodEnum.POST;
	}

}
