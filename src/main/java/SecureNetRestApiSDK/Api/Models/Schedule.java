//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;


public class Schedule   
{
    private double amount ;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        amount = value;
    }

    private String installmentDate = new String();
    public String getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(String value) {
        installmentDate = value;
    }

    private int installmentNum ;
    public int getInstallmentNum() {
        return installmentNum;
    }

    public void setInstallmentNum(int value) {
        installmentNum = value;
    }

    private int numOfRetries ;
    public int getNumOfRetries() {
        return numOfRetries;
    }

    public void setNumOfRetries(int value) {
        numOfRetries = value;
    }

    private boolean paid;
    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean value) {
        paid = value;
    }

    private Object paymentdate = new Object();
    public Object getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Object value) {
        paymentdate = value;
    }

    private String paymentMethodId = new String();
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String value) {
        paymentMethodId = value;
    }

    private boolean processed;
    public boolean getProcessed() {
        return processed;
    }

    public void setProcessed(boolean value) {
        processed = value;
    }

    private int scheduleId ;
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int value) {
        scheduleId = value;
    }

    private int transcationId ;
    public int getTranscationId() {
        return transcationId;
    }

    public void setTranscationId(int value) {
        transcationId = value;
    }

}


