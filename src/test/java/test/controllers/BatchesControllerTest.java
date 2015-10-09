//
//

package test.controllers;

import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import SNET.Core.APIContext;
import SecureNetRestApiSDK.Api.Controllers.BatchesController;
import SecureNetRestApiSDK.Api.Models.DeveloperApplication;
import SecureNetRestApiSDK.Api.Requests.BatchCloseRequest;
import SecureNetRestApiSDK.Api.Requests.BatchCurrentRequest;
import SecureNetRestApiSDK.Api.Requests.BatchRetrieveRequest;
import SecureNetRestApiSDK.Api.Responses.BatchCloseResponse;
import SecureNetRestApiSDK.Api.Responses.BatchCurrentResponse;
import SecureNetRestApiSDK.Api.Responses.BatchRetrieveResponse;

public class BatchesControllerTest   
{
	
	Properties config ;
	
	@Before
	public void before() throws Exception{
		InputStream stream  = this.getClass().getResourceAsStream("/config.properties");
		config = new Properties();
		config.load(stream);
	}
	
    /**
    * Successful response returned from a Settlement Close Batch request.
    * https://apidocs.securenet.com/docs/settlement.html?lang=csharp#closebatch
    */
	@Test
    public void settlementclosebatchrequestreturnssuccessfully() throws Exception {
		getBatchCloseResponse();
    }

    /**
    * Successful response returned from a Settlement Retrieve Closed Batch request.
    * https://apidocs.securenet.com/docs/settlement.html?lang=csharp#retrievebatch
    */
	@Test
    public void settlementretrieveclosedbatchrequestreturnssuccessfully() throws Exception {
        // Arrange
    	BatchCloseResponse closeResponse = getBatchCloseResponse();
    	
        BatchRetrieveRequest request = new BatchRetrieveRequest();
        request.setDeveloperApplication(getDeveloperApplication());
        request.setId(Integer.valueOf(closeResponse.getBatchId()));
        APIContext apiContext = new APIContext();
        BatchesController controller = new BatchesController();
        // Act
        BatchRetrieveResponse response = (BatchRetrieveResponse) controller.processRequest(apiContext,request,BatchRetrieveResponse.class);
        // Assert
        Assert.assertTrue(response.toResponseString(), response.getSuccess());
    }

    /*
    * Successful response returned from a Settlement Retrieve Current Batch request.
    * https://apidocs.securenet.com/docs/settlement.html?lang=csharp#currentbatch
    */
	@Test
    public void settlementretrievingcurrentbatchrequestreturnssuccessfully() throws Exception {
        // Arrange
        BatchCurrentRequest request = new BatchCurrentRequest();
        request.setDeveloperApplication(getDeveloperApplication());
        APIContext apiContext = new APIContext();
        BatchesController controller = new BatchesController();
        // Act
        BatchCurrentResponse response = (BatchCurrentResponse) controller.processRequest(apiContext,request,BatchCurrentResponse.class);
        // Assert
        Assert.assertTrue(response.toResponseString(), response.getSuccess());
    }
    
    private BatchCloseResponse getBatchCloseResponse() throws Exception{
    	 BatchCloseRequest request = new BatchCloseRequest();
         request.setDeveloperApplication(getDeveloperApplication());
         APIContext apiContext = new APIContext();
         BatchesController controller = new BatchesController();
         BatchCloseResponse response = (BatchCloseResponse) controller.processRequest(apiContext,request,BatchCloseResponse.class);
         Assert.assertTrue(response.toResponseString(), response.getSuccess());
         return response;
    }

    private DeveloperApplication getDeveloperApplication() {
		DeveloperApplication devApp = new DeveloperApplication();
		devApp.setDeveloperId(Integer.parseInt(config.getProperty("developerId")));
		devApp.setVersion(config.getProperty("versionId"));
		return devApp;
	}
}


