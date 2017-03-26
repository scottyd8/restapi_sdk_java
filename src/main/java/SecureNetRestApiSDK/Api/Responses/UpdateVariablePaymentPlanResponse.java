//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Models.StoredVariablePaymentPlan;
import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class UpdateVariablePaymentPlanResponse  extends SecureNetResponse 
{
    private Object storedInstallmentPaymentPlan = new Object();
    public Object getStoredInstallmentPaymentPlan() {
        return storedInstallmentPaymentPlan;
    }

    public void setStoredInstallmentPaymentPlan(Object value) {
        storedInstallmentPaymentPlan = value;
    }

    private Object storedRecurringPaymentPlan;
    public Object getStoredRecurringPaymentPlan() {
        return storedRecurringPaymentPlan;
    }

    public void setStoredRecurringPaymentPlan(Object value) {
        storedRecurringPaymentPlan = value;
    }

    private StoredVariablePaymentPlan storedVariablePaymentPlan = new StoredVariablePaymentPlan();
    public StoredVariablePaymentPlan getStoredVariablePaymentPlan() {
        return storedVariablePaymentPlan;
    }

    public void setStoredVariablePaymentPlan(StoredVariablePaymentPlan value) {
        storedVariablePaymentPlan = value;
    }
}


