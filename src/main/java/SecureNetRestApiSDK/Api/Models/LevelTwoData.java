//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;


import java.util.Date;

/**
 * Contains Level Two transaction data.
 */
public class LevelTwoData {
    /**
     * Date of the transaction.
     */
    private Date orderDate = new Date();

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date value) {
        orderDate = value;
    }

    /**
     * Purchase order number associated with the transaction
     */
    private String purchaseOrder = new String();

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String value) {
        purchaseOrder = value;
    }

    /**
     * Duty amount included in the transaction.
     */
    private double dutyAmount;

    public double getDutyAmount() {
        return dutyAmount;
    }

    public void setDutyAmount(double value) {
        dutyAmount = value;
    }

    /**
     * Freight amount included in the transaction.
     */
    private double freightAmount;

    public double getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(double value) {
        freightAmount = value;
    }

    /**
     * Lane number at which the transaction was completed in a retail environment.
     */
    private int retailLaneNumber;

    public int getRetailLaneNumber() {
        return retailLaneNumber;
    }

    public void setRetailLaneNumber(int value) {
        retailLaneNumber = value;
    }

    /**
     * Tax amount for the transaction.
     */
    private double taxAmount;

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double value) {
        taxAmount = value;
    }

    /**
     * Tax status of the transaction.
     */
    private String status = new String();

    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        status = value;
    }

}


