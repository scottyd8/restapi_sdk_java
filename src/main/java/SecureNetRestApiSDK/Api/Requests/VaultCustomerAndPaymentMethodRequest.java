//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import java.util.ArrayList;
import java.util.List;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Address;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.UserDefinedField;

public class VaultCustomerAndPaymentMethodRequest  extends SecureNetRequest 
{
    private String firstName = new String();
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        firstName = value;
    }

    private String lastName = new String();
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        lastName = value;
    }

    private String phoneNumber = new String();
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String value) {
        phoneNumber = value;
    }

    private Address address;
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address value) {
        address = value;
    }

    private String emailAddress = new String();
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String value) {
        emailAddress = value;
    }

    private boolean sendEmailReceipts;
    public boolean getSendEmailReceipts() {
        return sendEmailReceipts;
    }

    public void setSendEmailReceipts(boolean value) {
        sendEmailReceipts = value;
    }

    private String company = new String();
    public String getCompany() {
        return company;
    }

    public void setCompany(String value) {
        company = value;
    }

    private String notes = new String();
    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }

    private List<UserDefinedField> userDefinedFields = new ArrayList<UserDefinedField>();
    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

    private int customerDuplicateCheckIndicator;
    public int getCustomerDuplicateCheckIndicator() {
        return customerDuplicateCheckIndicator;
    }

    public void setCustomerDuplicateCheckIndicator(int value) {
        customerDuplicateCheckIndicator = value;
    }

    private Card card;
    public Card getCard() {
        return card;
    }

    public void setCard(Card value) {
        card = value;
    }

    private String phone = new String();
    public String getPhone() {
        return phone;
    }

    public void setPhone(String value) {
        phone = value;
    }

    private boolean primary;
    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean value) {
        primary = value;
    }

    private int accountDuplicateCheckIndicator;
    public int getAccountDuplicateCheckIndicator() {
        return accountDuplicateCheckIndicator;
    }

    public void setAccountDuplicateCheckIndicator(int value) {
        accountDuplicateCheckIndicator = value;
    }

    public String getUri() throws Exception {
        return "api/Customers/Payments";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}


