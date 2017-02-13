//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecurringPaymentPlan   
{
    private String cycleType = new String();
    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String value) {
        cycleType = value;
    }

    private int dayOfTheMonth;
    public int getDayOfTheMonth() {
        return dayOfTheMonth;
    }

    public void setDayOfTheMonth(int value) {
        dayOfTheMonth = value;
    }

    private int dayOfTheWeek;
    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(int value) {
        dayOfTheWeek = value;
    }

    private int month;
    public int getMonth() {
        return month;
    }

    public void setMonth(int value) {
        month = value;
    }

    private int frequency;
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int value) {
        frequency = value;
    }

    private Date endDate = new Date();
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date value) {
        endDate = value;
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

    private int planId;
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int value) {
        planId = value;
    }

    private double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        amount = value;
    }

    private Date startDate = new Date();
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date value) {
        startDate = value;
    }

    private Date nextPaymentDate = new Date();
    public Date getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(Date value) {
        nextPaymentDate = value;
    }

    private int maxRetries;
    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int value) {
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


