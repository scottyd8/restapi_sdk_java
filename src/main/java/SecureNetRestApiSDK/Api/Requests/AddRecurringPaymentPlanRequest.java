//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.RecurringPaymentPlan;

public class AddRecurringPaymentPlanRequest extends SecureNetRequest {
	private String customerId = new String();

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String value) {
		customerId = value;
	}

	private RecurringPaymentPlan plan;

	public RecurringPaymentPlan getPlan() {
		return plan;
	}

	public void setPlan(RecurringPaymentPlan value) {
		plan = value;
	}

	private boolean includeRawObjects;

	public boolean getIncludeRawObjects() {
		return includeRawObjects;
	}

	public void setIncludeRawObjects(boolean value) {
		includeRawObjects = value;
	}

	private boolean includeRequest;

	public boolean getIncludeRequest() {
		return includeRequest;
	}

	public void setIncludeRequest(boolean value) {
		includeRequest = value;
	}

	public String getUri() throws Exception {
		return String.format("api/Customers/%s/PaymentSchedules/Recurring",
				getCustomerId());
	}

	public HttpMethodEnum getMethod() throws Exception {
		return HttpMethodEnum.POST;
	}

}
