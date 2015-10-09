//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;


public class Product   
{
    private String alternateTaxId = new String();
    public String getAlternateTaxId() {
        return alternateTaxId;
    }

    public void setAlternateTaxId(String value) {
        alternateTaxId = value;
    }

    private String commodityCode = new String();
    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String value) {
        commodityCode = value;
    }

    private double discountAmount;
    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double value) {
        discountAmount = value;
    }

    private double discountRate;
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double value) {
        discountRate = value;
    }

    private String discountIndicator = new String();
    public String getDiscountIndicator() {
        return discountIndicator;
    }

    public void setDiscountIndicator(String value) {
        discountIndicator = value;
    }

    private String grossNetIndicator = new String();
    public String getGrossNetIndicator() {
        return grossNetIndicator;
    }

    public void setGrossNetIndicator(String value) {
        grossNetIndicator = value;
    }

    private String itemCode = new String();
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String value) {
        itemCode = value;
    }

    private String itemName = new String();
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String value) {
        itemName = value;
    }

    private String itemDescription = new String();
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String value) {
        itemDescription = value;
    }

    private String unit = new String();
    public String getUnit() {
        return unit;
    }

    public void setUnit(String value) {
        unit = value;
    }

    private double unitPrice;
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double value) {
        unitPrice = value;
    }

    private double quantity;
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double value) {
        quantity = value;
    }

    private double totalAmount;
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double value) {
        totalAmount = value;
    }

    private double taxAmount;
    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double value) {
        taxAmount = value;
    }

    private double taxRate;
    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double value) {
        taxRate = value;
    }

    private String taxTypeIdentifier = new String();
    public String getTaxTypeIdentifier() {
        return taxTypeIdentifier;
    }

    public void setTaxTypeIdentifier(String value) {
        taxTypeIdentifier = value;
    }

    private String taxTypeApplied = new String();
    public String getTaxTypeApplied() {
        return taxTypeApplied;
    }

    public void setTaxTypeApplied(String value) {
        taxTypeApplied = value;
    }

    private boolean taxable;
    public boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(boolean value) {
        taxable = value;
    }

}


