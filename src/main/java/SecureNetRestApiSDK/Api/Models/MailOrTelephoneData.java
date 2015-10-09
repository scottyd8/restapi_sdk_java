//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;


public class MailOrTelephoneData   
{
    private String type = new String();
    public String getType() {
        return type;
    }

    public void setType(String value) {
        type = value;
    }

    private String totalNumberOfInstallments = new String();
    public String getTotalNumberOfInstallments() {
        return totalNumberOfInstallments;
    }

    public void setTotalNumberOfInstallments(String value) {
        totalNumberOfInstallments = value;
    }

    private String currentInstallment = new String();
    public String getCurrentInstallment() {
        return currentInstallment;
    }

    public void setCurrentInstallment(String value) {
        currentInstallment = value;
    }

}


