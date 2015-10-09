//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Models.StoredVariablePaymentPlan;
import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class AddVariablePaymentPlanResponse  extends SecureNetResponse 
{
    private String planId = new String();
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String value) {
        planId = value;
    }

    private String customerId = new String();
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
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

    private StoredVariablePaymentPlan storedVariablePaymentPlan;
    public StoredVariablePaymentPlan getStoredVariablePaymentPlan() {
        return storedVariablePaymentPlan;
    }

    public void setStoredVariablePaymentPlan(StoredVariablePaymentPlan value) {
        storedVariablePaymentPlan = value;
    }

}


