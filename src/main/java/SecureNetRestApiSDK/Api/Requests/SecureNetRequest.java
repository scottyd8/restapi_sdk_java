//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.DeveloperApplication;

/**
 * Base class for all SecureNet requests.
 */
public abstract class SecureNetRequest {
	
	private DeveloperApplication developerApplication;

	public abstract String getUri() throws Exception;

	public abstract HttpMethodEnum getMethod() throws Exception;

	public DeveloperApplication getDeveloperApplication() {
		return developerApplication;
	}

	public void setDeveloperApplication(DeveloperApplication value) {
		developerApplication = value;
	}

}
