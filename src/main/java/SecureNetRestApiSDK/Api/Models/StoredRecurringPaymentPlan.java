//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.List;

public class StoredRecurringPaymentPlan   
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

    private double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        amount = value;
    }

    private String endDate = new String();
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        endDate = value;
    }

    private int planId;
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int value) {
        planId = value;
    }

    private boolean active;
    public boolean getActive() {
        return active;
    }

    public void setActive(boolean value) {
        active = value;
    }

    private String startDate = new String();
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        startDate = value;
    }

    private String nextPaymentDate = new String();
    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String value) {
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

    private Object notes = new Object();
    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object value) {
        notes = value;
    }

    private List<UserDefinedField> userDefinedFields = new ArrayList<UserDefinedField>();
    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

    private List<Schedule> schedules = new ArrayList<Schedule>();
    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> value) {
        schedules = value;
    }

}


