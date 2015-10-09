//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.Date;


public class StoredVariablePaymentPlan   
{
    private Date planStartDate = new Date();
    public Date getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Date value) {
        planStartDate = value;
    }

    private Object scheduledPayments = new Object();
    public Object getScheduledPayments() {
        return scheduledPayments;
    }

    public void setScheduledPayments(Object value) {
        scheduledPayments = value;
    }

    private int maxRetries;
    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int value) {
        maxRetries = value;
    }

    private String notes = new String();
    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }

}


