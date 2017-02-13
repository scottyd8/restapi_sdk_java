//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;


public class SecureNetResponse   
{

	private boolean success;
    private String result;
    private int responseCode;
    private String message;
    private String responseDate;
    private Object rawRequest;
    private Object rawResponse;
    private Object jsonRequest;
    
    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean value) {
        success = value;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String value) {
        result = value;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int value) {
        responseCode = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        message = value;
    }

    public String getResponseDateTime() {
        return responseDateTime;
    }

    public void setResponseDateTime(String value) {
        responseDateTime = value;
    }

    public Object getRawRequest() {
        return rawRequest;
    }

    public void setRawRequest(Object value) {
        rawRequest = value;
    }

    public Object getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(Object value) {
        rawResponse = value;
    }

    public Object getJsonRequest() {
        return jsonRequest;
    }

    public void setJsonRequest(Object value) {
        jsonRequest = value;
    }

	public String toResponseString() {
		return "SecureNetResponse [success=" + success + ", result=" + result
				+ ", responseCode=" + responseCode + ", message=" + message
				+ ", responseDateTime=" + responseDateTime + ", rawRequest="
				+ rawRequest + ", rawResponse=" + rawResponse
				+ ", jsonRequest=" + jsonRequest + "]";
	}
}


