//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import org.apache.commons.lang.StringUtils;

import SecureNetRestApiSDK.Api.Enums.EncryptionModeType;

public class Encryption   
{
    public String EncryptionMode = EncryptionModeType.NONE.toString();
    // default to no encryption
    public Encryption setEncryptionMode(String passIn) throws Exception {
        if (StringUtils.isBlank(passIn))
        {
            EncryptionMode = EncryptionModeType.NONE.toString();
            return this;
        }
         
        if (StringUtils.equals(passIn.toUpperCase().trim(), "IDTECHMSR"))
        {
            EncryptionMode = EncryptionModeType.IDTECHmSR.toString();
        }
        else if (StringUtils.equals(passIn.toUpperCase().trim(), "MAGTEKMSR"))
        {
            EncryptionMode = EncryptionModeType.MAGTEKmSR.toString();
        }
        else if (StringUtils.equals(passIn.toUpperCase().trim(), "MAGTEKIPAD"))
        {
            EncryptionMode = EncryptionModeType.MAGTEKiPAD.toString();
        }
           
        return this;
    }

}


