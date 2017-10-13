//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.List;
import main.java.SecureNetRestApiSDK.Api.Models.EbtData;


/**
* Additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing.
*/
public class ExtendedInformation   
{
    /**
    * Type of goods that are being purchased. Valid values are DIGITAL or PHYSICAL.
    */
    private String typeOfGoods = new String();
    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(String value) {
        typeOfGoods = value;
    }

    /**
    * Additional terminal information. Required to process checks when using the SEC code POINToFsALE.
    */
    private AdditionalTerminalInfo additionalTerminalInfo;
    public AdditionalTerminalInfo getAdditionalTerminalInfo() {
        return additionalTerminalInfo;
    }

    public void setAdditionalTerminalInfo(AdditionalTerminalInfo value) {
        additionalTerminalInfo = value;
    }

    /**
    * Information related to level two processing.
    */
    private LevelTwoData levelTwoData;
    public LevelTwoData getLevelTwoData() {
        return levelTwoData;
    }

    public void setLevelTwoData(LevelTwoData value) {
        levelTwoData = value;
    }

    /**
    * Information related to level three processing.
    */
    private LevelThreeData levelThreeData;
    public LevelThreeData getLevelThreeData() {
        return levelThreeData;
    }

    public void setLevelThreeData(LevelThreeData value) {
        levelThreeData = value;
    }

    /**
    * Device code of the device where the transaction originated.
    */
    private String deviceCode = new String();
    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String value) {
        deviceCode = value;
    }

    /**
    * Entry source of the transaction.
    */
    private String entrySource = new String();
    public String getEntrySource() {
        return entrySource;
    }

    public void setEntrySource(String value) {
        entrySource = value;
    }

    /**
    * Additional data for remote orders. Required in the case of a mail, phone, or ecommerce transaction.
    */
    private MailOrTelephoneData mailOrTelephoneData;
    public MailOrTelephoneData getMailOrTelephoneData() {
        return mailOrTelephoneData;
    }

    public void setMailOrTelephoneData(MailOrTelephoneData value) {
        mailOrTelephoneData = value;
    }

    /**
    * Restaurant-related transaction information.
    */
    private ServiceData serviceData;
    public ServiceData getServiceData() {
        return serviceData;
    }

    public void setServiceData(ServiceData value) {
        serviceData = value;
    }
    
    /**
    * EBT-related transaction information.
    */
    private EbtData ebtData;
    public EbtData getEbtData() {
        return ebtData;
    }

    public void setEbtData(EbtData value) {
        ebtData = value;
    }
    
    /**
    * Custom user-defined fields that can be sent with the transaction for reporting purposes.
    */
    private List<UserDefinedField> userDefinedFields = new ArrayList<UserDefinedField>();
    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

    /**
    * Notes associated with the transaction.
    */
    private String notes = new String();
    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        notes = value;
    }

    /**
    * Invoice number.
    */
    private String invoiceNumber = new String();
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String value) {
        invoiceNumber = value;
    }

    /**
    * Invoice description.
    */
    private String invoiceDescription = new String();
    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    public void setInvoiceDescription(String value) {
        invoiceDescription = value;
    }
	
    /**
     * Displays a description in addition to the merchants DBA.
     */
    private String softDescriptor = new String();
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String value) {
        softDescriptor = value;
    }

    /**
     * Displays a 4 characters dynamic merchant category code.
     */
    private String dynamicMCC = new String();
    public String getDynamicMCC() {
        return dynamicMCC;
    }

    public void setDynamicMCC(String value) {
        dynamicMCC = value;
    }
    
    

}


