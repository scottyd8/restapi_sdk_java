//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;


/**
* Contains information related to the integration.
*/
public class DeveloperApplication   
{
    /**
    * Developer ID of integrator as assigned by SecureNet.
    */
    private int developerId;
	private String version;

    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int value) {
        developerId = value;
    }

    /**
    * Version number of the integrator's application.
    */
    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        version = value;
    }

}


