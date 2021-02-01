package com.testing;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetWitnTesting {

	Response response;

	@BeforeTest
	public void setup() {
		response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	}

	@Test
	public void BasicTesting() {
		System.out.println("Status code =" + response.statusCode());
		Assert.assertEquals(response.statusCode(), 200, "Status code validation for 200");

		System.out.println("Response time is in ms=" + response.getTime());
		Assert.assertTrue(response.getTime() > 500);

		System.out.println("Content Type=" + response.getContentType());

		System.out.println("Json Headers=" + response.getHeaders());
		response.getBody().prettyPrint();
	}

	@Test
	public void ValidationTesting() {
		JsonPath jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("status").toString() != null, "Should not ne null");
		Assert.assertTrue(jsonPath.get("data").toString() != null, "Should not be null");
		System.out.println("from Json=" + jsonPath.get("status").toString());
		Assert.assertEquals(jsonPath.get("status").toString(), "success");

	}

	@AfterTest
	public void TesrDown() {
	}
}
