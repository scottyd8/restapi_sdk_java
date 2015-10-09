//
//

package test.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import SNET.Core.APIContext;
import SecureNetRestApiSDK.Api.Controllers.PreVaultController;
import SecureNetRestApiSDK.Api.Models.Address;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.Check;
import SecureNetRestApiSDK.Api.Models.DeveloperApplication;
import SecureNetRestApiSDK.Api.Requests.TokenCardRequest;
import SecureNetRestApiSDK.Api.Requests.TokenCheckRequest;
import SecureNetRestApiSDK.Api.Responses.TokenCardResponse;
import SecureNetRestApiSDK.Api.Responses.TokenCheckResponse;

public class PrevaultControllerTest   
{
	
	Properties config ;
	
	
	@Before
	public void before() throws Exception{
		InputStream stream  = this.getClass().getResourceAsStream("/config.properties");
		config = new Properties();
		config.load(stream);
	}
    
    
    
	@Test
    public void tokenizationCreateTokenUsingCreditCardRequest() throws Exception {
        TokenCardRequest request = new TokenCardRequest();
        request.setDeveloperApplication(getDeveloperApplication());
        request.setCard(getCard());
        request.setPublicKey("4672d4e5-ae4c-464a-b1be-96bdfa31c5fb");
        APIContext apiContext = new APIContext();
        apiContext.setHTTPHeaders(getOrigin());
        PreVaultController controller = new PreVaultController();
        TokenCardResponse response = (TokenCardResponse) controller.processRequest(apiContext,request,TokenCardResponse.class);
        Assert.assertTrue(response.toResponseString(), response.getSuccess());
    }
	
	@Test
    public void tokenizationcreatetokenusingcheckinginformationrequestreturnssuccessfully() throws Exception {
        TokenCheckRequest request = new TokenCheckRequest();
        request.setCheck(getCheck());
        request.setDeveloperApplication(getDeveloperApplication());
        request.setPublicKey(config.getProperty("publicKey"));
        APIContext apiContext = new APIContext();
        apiContext.setHTTPHeaders(getOrigin());
        PreVaultController controller = new PreVaultController();
        TokenCheckResponse response = (TokenCheckResponse) controller.processRequest(apiContext,request,TokenCheckResponse.class);
        Assert.assertTrue(response.toResponseString(), response.getSuccess());
    }
	
	private Dictionary<String, String> getOrigin() throws IOException{
        Dictionary<String, String> dictionary = new Hashtable<String, String>();
        dictionary.put("Origin", config.getProperty("origin"));
        dictionary.put("Access-Control-Request-Method", "POST");
        return dictionary;
	}
	
	  private Card getCard(){
			Card card = new Card();
			card.setAddress(getAddress());
			card.setCvv("123");
			card.setExpirationDate("07/2018");
			card.setNumber("4111111111111111");
			return card;
		}
	    
	    private Address getAddress() {
			Address address = new Address();
			address.setCity("Austin");
			address.setCountry("US");
			address.setLine1("123 Main St.");
			address.setState("TX");
			address.setZip("78759");
			return address;
		}

		private DeveloperApplication getDeveloperApplication() {
			DeveloperApplication devApp = new DeveloperApplication();
			devApp.setDeveloperId(Integer.parseInt(config.getProperty("developerId")));
			devApp.setVersion(config.getProperty("versionId"));
			return devApp;
		}
		
		private Check getCheck() {
			Check check = new Check();
			check.setFirstName("Bruce");
			check.setLastName("Wayne");
			check.setRoutingNumber("222371863");
			check.setAccountNumber("123456");
			return check;
		}
}


