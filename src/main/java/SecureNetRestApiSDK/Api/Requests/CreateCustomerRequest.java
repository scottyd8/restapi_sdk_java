//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import java.util.List;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Address;
import SecureNetRestApiSDK.Api.Models.UserDefinedField;

public class CreateCustomerRequest  extends SecureNetRequest 
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private boolean sendEmailReceipts;
    private String notes;
    private String company;
    private List<UserDefinedField> userDefinedFields;
    
    private Address address;

	public String getUri() throws Exception {
		return "api/Customers";
	}

	public HttpMethodEnum getMethod() throws Exception {
		return HttpMethodEnum.POST;
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

    public boolean getSendEmailReceipts() {
        return sendEmailReceipts;
    }

    public void setSendEmailReceipts(boolean value) {
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


}


