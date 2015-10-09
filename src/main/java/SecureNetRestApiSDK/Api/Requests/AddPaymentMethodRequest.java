//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import java.util.List;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.UserDefinedField;

public class AddPaymentMethodRequest  extends SecureNetRequest 
{
    private String customerId;
    private Card card;
    private String phone = new String();
    private String notes = new String();
    private int accountDuplicateCheckIndicator;
    private Boolean primary;
    private List<UserDefinedField> userDefinedFields;
    
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card value) {
        card = value;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String value) {
        phone = value;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }

    public int getAccountDuplicateCheckIndicator() {
        return accountDuplicateCheckIndicator;
    }

    public void setAccountDuplicateCheckIndicator(int value) {
        accountDuplicateCheckIndicator = value;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean value) {
        primary = value;
    }

    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }


    public String getUri() throws Exception {
        return String.format("api/Customers/%s/PaymentMethod", getCustomerId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}


