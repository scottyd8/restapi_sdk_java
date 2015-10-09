//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import SecureNetRestApiSDK.Api.Models.Address;

public class Check   
{
    private String accountType = new String();
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String value) {
        accountType = value;
    }

    private String checkType = new String();
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String value) {
        checkType = value;
    }

    private String routingNumber = new String();
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String value) {
        routingNumber = value;
    }

    private String accountNumber = new String();
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String value) {
        accountNumber = value;
    }

    private String checkNumber = new String();
    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String value) {
        checkNumber = value;
    }

    private Address address;
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address value) {
        address = value;
    }

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

    private String email = new String();
    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        email = value;
    }

    private String front = new String();
    public String getFront() {
        return front;
    }

    public void setFront(String value) {
        front = value;
    }

    private String back = new String();
    public String getBack() {
        return back;
    }

    public void setBack(String value) {
        back = value;
    }

    private String verification = new String();
    public String getVerification() {
        return verification;
    }

    public void setVerification(String value) {
        verification = value;
    }

}


