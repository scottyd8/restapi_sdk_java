//
//

package test.controllers;

import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import SNET.Core.APIContext;
import SecureNetRestApiSDK.Api.Controllers.PaymentsController;
import SecureNetRestApiSDK.Api.Controllers.TransactionsController;
import SecureNetRestApiSDK.Api.Models.Address;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.DeveloperApplication;
import SecureNetRestApiSDK.Api.Requests.AuthorizeRequest;
import SecureNetRestApiSDK.Api.Requests.TransactionRetrieveRequest;
import SecureNetRestApiSDK.Api.Requests.TransactionSearchRequest;
import SecureNetRestApiSDK.Api.Requests.TransactionUpdateRequest;
import SecureNetRestApiSDK.Api.Responses.AuthorizeResponse;
import SecureNetRestApiSDK.Api.Responses.TransactionRetrieveResponse;
import SecureNetRestApiSDK.Api.Responses.TransactionSearchResponse;
import SecureNetRestApiSDK.Api.Responses.TransactionUpdateResponse;

public class TransactionsControllerTest   
{
	
	Properties config ;
	
	@Before
	public void before() throws Exception{
		InputStream stream  = this.getClass().getResourceAsStream("/config.properties");
		config = new Properties();
		config.load(stream);
	}
    
    /**
    * Successful response returned from a Search Transaction request.
    * https://apidocs.securenet.com/docs/transactions.html?lang=csharp#search
    */
	@Test
    public void transactionreportingandmanagementsearchtransactionrequestreturnssuccessfully() throws Exception {
        // Arramge
        TransactionSearchRequest request = new TransactionSearchRequest();
        request.setDeveloperApplication(getDeveloperApplication());
        request.setTransactionId(createTransaction());
        APIContext apiContext = new APIContext();
        TransactionsController controller = new TransactionsController();
        // Act
        TransactionSearchResponse response = (TransactionSearchResponse) controller.processRequest(apiContext,request,TransactionSearchResponse.class);
        // Assert
        Assert.assertTrue(response.toResponseString(), response.getSuccess());
    }

    /**
    * Successful response returned from a Retrieve Transaction request.
    * https://apidocs.securenet.com/docs/transactions.html?lang=csharp#retrieve
    */
	@Test
    public void transactionreportingandmanagementretrievetransactionrequestreturnssuccessfully() throws Exception {
        // Arrange
        TransactionRetrieveRequest request = new TransactionRetrieveRequest();
        request.setDeveloperApplication(getDeveloperApplication());
        request.setTransactionId(createTransaction());
        APIContext apiContext = new APIContext();
        TransactionsController controller = new TransactionsController();
        // Act
        TransactionRetrieveResponse response = (TransactionRetrieveResponse) controller.processRequest(apiContext,request,TransactionRetrieveResponse.class);
        // Assert
        Assert.assertTrue(response.toResponseString(), response.getSuccess());
    }

    /**
    * Successful response returned from an Update Transaction request.
    * https://apidocs.securenet.com/docs/transactions.html?lang=csharp#update
    */
	@Test
    public void transactionreportingandmanagementupdatetransactionrequestreturnssuccessfully() throws Exception {
        // Arrange
        TransactionUpdateRequest request = new TransactionUpdateRequest();
        request.setDeveloperApplication(getDeveloperApplication());
        request.setReferenceTransactionId(createTransaction());
        APIContext apiContext = new APIContext();
        TransactionsController controller = new TransactionsController();
        // Act
        TransactionUpdateResponse response = (TransactionUpdateResponse) controller.processRequest(apiContext,request,TransactionUpdateResponse.class);
        // Assert
        Assert.assertTrue(response.toResponseString(), response.getSuccess());
    }
    
	private DeveloperApplication getDeveloperApplication() {
		DeveloperApplication devApp = new DeveloperApplication();
		devApp.setDeveloperId(Integer.parseInt(config.getProperty("developerId")));
		devApp.setVersion(config.getProperty("versionId"));
		return devApp;
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
    
    private int createTransaction()
			throws Exception {
		// Arrange
		AuthorizeRequest request = new AuthorizeRequest();
		request.setCard(getCard());
		request.setAddToVault(true);
		request.setAmount(20d);
		request.setDeveloperApplication(getDeveloperApplication());
		APIContext apiContext = new APIContext();
		PaymentsController controller = new PaymentsController();
		// Act
		AuthorizeResponse response = (AuthorizeResponse) controller.processRequest(apiContext, request,AuthorizeResponse.class);
		// Assert
		Assert.assertTrue(response.toResponseString(), response.getSuccess());
		return response.getTransaction().getTransactionId();
	}

}


