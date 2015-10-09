//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;


/**
* Stores information on gratuity and the server name.
*/
public class ServiceData   
{
    /**
    * Tip amount.
    */
    private double gratuityAmount;
    public double getGratuityAmount() {
        return gratuityAmount;
    }

    public void setGratuityAmount(double value) {
        gratuityAmount = value;
    }

    /**
    * Server number (used in restaurant transactions).
    */
    private String server = new String();
    public String getServer() {
        return server;
    }

    public void setServer(String value) {
        server = value;
    }

}


