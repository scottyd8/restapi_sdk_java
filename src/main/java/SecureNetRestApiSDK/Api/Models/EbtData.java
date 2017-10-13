/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.SecureNetRestApiSDK.Api.Models;

/**
 *
 * @author skunchepu
 */
public class EbtData {
    
    /**
    * ebtType.
    */
    private String ebtType = new String();
    public String getEbtType() {
        return ebtType;
    }

    public void setEbtType(String value) {
        ebtType = value;
    }

    /**
    * voucherNumber.
    */
    private String voucherNumber = new String();
    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String value) {
        voucherNumber = value;
    }
    
    /**
    * fnsNumber.
    */
    private String fnsNumber = new String();
    public String getFnsNumber() {
        return fnsNumber;
    }

    public void setFnsNumber(String value) {
        fnsNumber = value;
    }
    
}
