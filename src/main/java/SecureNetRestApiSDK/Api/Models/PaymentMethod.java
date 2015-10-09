//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethod {
    private String customerId = new String();

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    private String paymentId = new String();

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String value) {
        paymentId = value;
    }

    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card value) {
        card = value;
    }

    private Object check = new Object();

    public Object getCheck() {
        return check;
    }

    public void setCheck(Object value) {
        check = value;
    }

    private String notes = new String();

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }

    private String method = new String();

    public String getMethod() {
        return method;
    }

    public void setMethod(String value) {
        method = value;
    }

    private boolean primary;

    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean value) {
        primary = value;
    }

    private String cardType = new String();

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String value) {
        cardType = value;
    }

    private Object lastAccessDate = new Object();

    public Object getLastAccessDate() {
        return lastAccessDate;
    }

    public void setLastAccessDate(Object value) {
        lastAccessDate = value;
    }

    private List<UserDefinedField> userDefinedFields = new ArrayList<UserDefinedField>();

    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

}


