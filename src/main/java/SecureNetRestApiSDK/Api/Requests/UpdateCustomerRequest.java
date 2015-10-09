//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import java.util.List;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Address;
import SecureNetRestApiSDK.Api.Models.UserDefinedField;

public class UpdateCustomerRequest extends SecureNetRequest {
	private String customerId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	private Boolean sendEmailReceipts;
	private String notes;
	private Address address;
	private String company;
	private List<UserDefinedField> userDefinedFields;
	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String value) {
		customerId = value;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String value) {
		firstName = value;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String value) {
		lastName = value;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String value) {
		phoneNumber = value;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String value) {
		emailAddress = value;
	}

	public Boolean getSendEmailReceipts() {
		return sendEmailReceipts;
	}

	public void setSendEmailReceipts(Boolean value) {
		sendEmailReceipts = value;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String value) {
		notes = value;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address value) {
		address = value;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String value) {
		company = value;
	}

	public List<UserDefinedField> getUserDefinedFields() {
		return userDefinedFields;
	}

	public void setUserDefinedFields(List<UserDefinedField> value) {
		userDefinedFields = value;
	}

	public String getUri() throws Exception {
		return String.format("api/Customers/%s", getCustomerId());
	}

	public HttpMethodEnum getMethod() throws Exception {
		return HttpMethodEnum.PUT;
	}

}
