
package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VariablePaymentPlan  extends StoredVariablePaymentPlan 
{
    private Object planEndDate = new Object();
    public Object getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Date value) {
        planEndDate = value;
    }

    private String primaryPaymentMethodId = new String();
    public String getPrimaryPaymentMethodId() {
        return primaryPaymentMethodId;
    }

    public void setPrimaryPaymentMethodId(String value) {
        primaryPaymentMethodId = value;
    }

    private String secondaryPaymentMethodId = new String();
    public String getSecondaryPaymentMethodId() {
        return secondaryPaymentMethodId;
    }

    public void setSecondaryPaymentMethodId(String value) {
        secondaryPaymentMethodId = value;
    }

    private List<UserDefinedField> userDefinedFields = new ArrayList<UserDefinedField>();
    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

}


