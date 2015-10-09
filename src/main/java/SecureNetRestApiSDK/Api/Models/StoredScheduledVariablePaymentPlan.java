//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.Date;


public class StoredScheduledVariablePaymentPlan   
{
    private int scheduleId ;
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int value) {
        scheduleId = value;
    }

    private Date paymentDate = new Date();
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date value) {
        paymentDate = value;
    }

    private double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        amount = value;
    }

}


