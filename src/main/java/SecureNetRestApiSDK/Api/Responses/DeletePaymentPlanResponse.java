//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class DeletePaymentPlanResponse  extends SecureNetResponse 
{
    private Object planId = new Object();
    public Object getPlanId() {
        return planId;
    }

    public void setPlanId(Object value) {
        planId = value;
    }

    private Object customerId = new Object();
    public Object getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Object value) {
        customerId = value;
    }

    private Object storedInstallmentPaymentPlan = new Object();
    public Object getStoredInstallmentPaymentPlan() {
        return storedInstallmentPaymentPlan;
    }

    public void setStoredInstallmentPaymentPlan(Object value) {
        storedInstallmentPaymentPlan = value;
    }

    private Object storedRecurringPaymentPlan = new Object();
    public Object getStoredRecurringPaymentPlan() {
        return storedRecurringPaymentPlan;
    }

    public void setStoredRecurringPaymentPlan(Object value) {
        storedRecurringPaymentPlan = value;
    }

    private Object storedVariablePaymentPlan = new Object();
    public Object getStoredVariablePaymentPlan() {
        return storedVariablePaymentPlan;
    }

    public void setStoredVariablePaymentPlan(Object value) {
        storedVariablePaymentPlan = value;
    }

}


