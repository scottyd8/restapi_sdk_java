//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstallmentPaymentPlan {
    private String cycleType = new String();

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String value) {
        cycleType = value;
    }

    private Integer dayOfTheMonth;

    public Integer getDayOfTheMonth() {
        return dayOfTheMonth;
    }

    public void setDayOfTheMonth(Integer value) {
        dayOfTheMonth = value;
    }

    private Integer dayOfTheWeek;

    public Integer getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(Integer value) {
        dayOfTheWeek = value;
    }

    private String month = new String();

    public String getMonth() {
        return month;
    }

    public void setMonth(String value) {
        month = value;
    }

    private Integer frequency;

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer value) {
        frequency = value;
    }

    private double totalAmount;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double value) {
        totalAmount = value;
    }

    private Integer numberOfPayments;

    public Integer getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(Integer value) {
        numberOfPayments = value;
    }

    private double installmentAmount;

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double value) {
        installmentAmount = value;
    }

    private double balloonAmount;

    public double getBalloonAmount() {
        return balloonAmount;
    }

    public void setBalloonAmount(double value) {
        balloonAmount = value;
    }

    private String balloonPaymentAddedTo = new String();

    public String getBalloonPaymentAddedTo() {
        return balloonPaymentAddedTo;
    }

    public void setBalloonPaymentAddedTo(String value) {
        balloonPaymentAddedTo = value;
    }

    private double remainderAmount;

    public double getRemainderAmount() {
        return remainderAmount;
    }

    public void setRemainderAmount(double value) {
        remainderAmount = value;
    }

    private String remainderAmountAddedTo = new String();

    public String getRemainderAmountAddedTo() {
        return remainderAmountAddedTo;
    }

    public void setRemainderAmountAddedTo(String value) {
        remainderAmountAddedTo = value;
    }

    private boolean active;

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean value) {
        active = value;
    }

    private String notes = new String();

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }

    private Integer planId;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer value) {
        planId = value;
    }

    private Date startDate = new Date();

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date value) {
        startDate = value;
    }

    private Date endDate = new Date();

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date value) {
        endDate = value;
    }

    private Integer maxRetries;

    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer value) {
        maxRetries = value;
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

    private String softDescriptor = new String();

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String value) {
        softDescriptor = value;
    }

    private String dynamicMCC = new String();
    public String getDynamicMCC() {
        return dynamicMCC;
    }

    public void setDynamicMCC(String value) {
        dynamicMCC = value;
    }

}


