
package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.List;

public class VaultCustomer {
    private String customerId;
    private Address address;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private boolean sendEmailReceipts;
    private String company;
    private List<UserDefinedField> userDefinedFields;
    private List<RecurringPaymentPlan> recurringPaymentPlans;
    private List<InstallmentPaymentPlan> installmentPaymentPlans;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address value) {
        address = value;
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


    public String getCompany() {
        return company;
    }

    public void setCompany(String value) {
        company = value;
    }

    private String notes;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }


    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

    private List<PaymentMethod> paymentMethods = new ArrayList<PaymentMethod>();

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> value) {
        paymentMethods = value;
    }

    private String primaryPaymentMethodId;

    public String getPrimaryPaymentMethodId() {
        return primaryPaymentMethodId;
    }

    public void setPrimaryPaymentMethodId(String value) {
        primaryPaymentMethodId = value;
    }

    private List<VariablePaymentPlan> variablePaymentPlans = new ArrayList<VariablePaymentPlan>();

    public List<VariablePaymentPlan> getVariablePaymentPlans() {
        return variablePaymentPlans;
    }

    public void setVariablePaymentPlans(List<VariablePaymentPlan> value) {
        variablePaymentPlans = value;
    }


    public List<RecurringPaymentPlan> getRecurringPaymentPlans() {
        return recurringPaymentPlans;
    }

    public void setRecurringPaymentPlans(List<RecurringPaymentPlan> value) {
        recurringPaymentPlans = value;
    }


    public List<InstallmentPaymentPlan> getInstallmentPaymentPlans() {
        return installmentPaymentPlans;
    }

    public void setInstallmentPaymentPlans(List<InstallmentPaymentPlan> value) {
        installmentPaymentPlans = value;
    }

}


