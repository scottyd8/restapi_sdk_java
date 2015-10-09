//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import java.util.ArrayList;
import java.util.List;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.UserDefinedField;

public class UpdatePaymentMethodRequest  extends SecureNetRequest 
{
    private String customerId = new String();
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    private String paymentMethodId = new String();
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String value) {
        paymentMethodId = value;
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

    private String notes = new String();
    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }

    private boolean primary;
    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean value) {
        primary = value;
    }

    private List<UserDefinedField> userDefinedFields = new ArrayList<UserDefinedField>();
    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

    public String getUri() throws Exception {
        return String.format("api/Customers/%s/PaymentMethod/%s", getCustomerId(), getPaymentMethodId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.PUT;
    }

}


