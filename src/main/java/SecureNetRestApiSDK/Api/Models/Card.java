//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

/**
 * Credit Card Specific Data.
 */
public class Card {
	/**
	 * Data that has been read from the card's magnetic stripe.
	 */
	private String trackData;
	private String number;
	private String cvv;
	private String expirationDate;
	private String ksn;
	private String pinBlock;
	private String firstName;
	private String lastName;
	private Address address;
        private String email;
        private String emailReceipt;
	private byte[] signature;

	public String getTrackData() {
		return trackData;
	}

	public void setTrackData(String value) {
		trackData = value;
	}

	/**
	 * Credit card account number.
	 */
	public String getNumber() {
		return number;
	}

	public void setNumber(String value) {
		number = value;
	}

	/**
	 * Card security code.
	 */
	public String getCvv() {
		return cvv;
	}

	public void setCvv(String value) {
		cvv = value;
	}

	/**
	 * Expiration date for the card. format: MM/YYYY.
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String value) {
		expirationDate = value;
	}

	/**
	 * Unaltered KSN Number from PIN pad. (Debit only.)
	 */
	public String getKsn() {
		return ksn;
	}

	public void setKsn(String value) {
		ksn = value;
	}

	/**
	 * Pinblock obtained from the PIN pad. (Debit only.)
	 */
	public String getPinBlock() {
		return pinBlock;
	}

	public void setPinBlock(String value) {
		pinBlock = value;
	}

	/**
	 * First name of the account holder.
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String value) {
		firstName = value;
	}

	/**
	 * Last name of the account holder.
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String value) {
		lastName = value;
	}

	/**
	 * Billing address of the account holder.
	 */
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address value) {
		address = value;
	}
        
        /**
	 * email of the account holder.
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String value) {
		email = value;
	}
        
         /**
	 * email of the account holder.
	 */
	public String getEmailReceipt() {
		return emailReceipt;
	}

	public void setEmailReceipt(String value) {
		emailReceipt = value;
	}
	/**
	 * Image of the signature of the cardholder as completed at the time of the
	 * transaction.
	 */
	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] value) {
		signature = value;
	}

}
