//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

/**
 * Account holder address details.
 */
public class Address {
	/**
	 * Street address.
	 */
	private String line1;
	private String city;
	private String state;
	private String zip;
	private String country;
        private String company;
        private String phone;
        

	public String getLine1() {
		return line1;
	}

	public void setLine1(String value) {
		line1 = value;
	}

	/**
	 * City where address is located.
	 */
	public String getCity() {
		return city;
	}

	public void setCity(String value) {
		city = value;
	}

	/**
	 * State where address is located; valid values are 2-character state
	 * abbreviations.
	 */
	public String getState() {
		return state;
	}

	public void setState(String value) {
		state = value;
	}

	/**
	 * 5- or 9-digit zip code.
	 */
	public String getZip() {
		return zip;
	}

	public void setZip(String value) {
		zip = value;
	}

	/**
	 * Country name. Defaults to US.
	 */
	public String getCountry() {
		return country;
	}

	public void setCountry(String value) {
		country = value;
	}
        
        /**
	 * Company name. Defaults to US.
	 */
	public String getCompany() {
		return company;
	}

	public void setCompany(String value) {
		company = value;
	}
        
         /**
	 * Phone name. Defaults to US.
	 */
	public String getPhone() {
		return phone;
	}

	public void setPhone(String value) {
		phone = value;
	}

}
