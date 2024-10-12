package steps;

import org.json.JSONObject;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ProdSteps {
	
	private String baseURL = "https://reqres.in/api/users?page=2";
	RequestSpecification request;
	Response response;
	
	@Before
	public void setUp() {
		RestAssured.baseURI = this.baseURL;
		System.out.println("Base URL :"+RestAssured.baseURI );
		
	}
	@Given("I set POST Product Service API Endpoint")
	public void i_set_post_product_service_api_endpoint() {
	    request = RestAssured.given();
	  /*  JSONObject requestParams = new JSONObject();
	    requestParams.put("pid", "17");
	    requestParams.put("pname", "Laptop");
	    requestParams.put("price", "50000");
	    System.out.println(request.body(requestParams.toString()));
	*/}

	@When("I set request Header")
	public void i_set_request_header() {
		request.header("Content-Type","application/json");
		
	}
	@When("Send a POST HTTP request")
	public void send_a_post_http_request() {
/*	    response = request.post(RestAssured.baseURI);
	    System.out.println(response.asPrettyString());
*/	}


	@Then("I receive a valid response {int}")
	public void i_receive_a_valid_response(Integer int1) {
	    System.out.println("Valid Response code : "+int1);
	}

	@Given("I set PUT Product Service API Endpoint")
	public void i_set_put_product_service_api_endpoint() {
	}
	@When("I set update request Body")
	public void i_set_update_request_body() {
	}

	@When("Send a update HTTP request")
	public void send_a_update_http_request() {
	}


	@Given("I set DELETE Product Service API Endpoint")
	public void i_set_delete_product_service_api_endpoint() {
	}

	@When("I set Delete HTTP request")
	public void i_set_delete_http_request() {
	}

	@When("I Send a DELETE HTTP request")
	public void i_send_a_delete_http_request() {
		RestAssured.baseURI = this.baseURL+"/4";
	}

	@Given("I set GET Product Service API Endpoint")
	public void i_set_get_product_service_api_endpoint() {
	}

	@When("Send a GET HTTP request")
	public void send_a_get_http_request() {
	}
	
}
