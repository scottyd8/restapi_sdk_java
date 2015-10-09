//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.ExtendedInformation;

/**
* Request class used for allowing a previously authorized transaction to be captured for settlement.
*/
public class PriorAuthCaptureRequest  extends SecureNetRequest 
{
    /**
    * Identifier of the previously authorized transaction to be captured.
    */
    private int transactionId ;
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int value) {
        transactionId = value;
    }


    /**
    * Final amount of the transaction. Used in cases where the transaction amount needs to be modified after the original authorization.
    */
    private double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        amount = value;
    }

    /**
    * Additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information.
    * If a gratuity is to be added to the previously authorized amount, it can be sent in the serviceData object field.
    */
    private ExtendedInformation extendedInformation;
    public ExtendedInformation getExtendedInformation() {
        return extendedInformation;
    }

    public void setExtendedInformation(ExtendedInformation value) {
        extendedInformation = value;
    }

    public String getUri() throws Exception {
        return "api/Payments/Capture";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}


