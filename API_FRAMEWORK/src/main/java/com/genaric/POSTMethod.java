package com.genaric;

import org.testng.Assert;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class POSTMethod {
	
public static void main(String[] args) {
	JsonObject json = new JsonObject();
	json.addProperty("Boro","Queens" );		
	json.addProperty("City", "New york");		
	json.addProperty("Country", "USA");
	json.addProperty("farhan", "30");

	RequestSpecification rs= RestAssured.given();
	rs.header("Content-type","application/json");
	rs.body(json.toString());
	Response response = rs.post("http://dummy.restapiexample.com/api/v1/create");
	
	System.out.println("status code="+response.statusCode());
	Assert.assertEquals(response.statusCode(),200);
	System.out.println("response time ="+response.getTime());
	Assert.assertTrue(response.getTime()<200);
	System.out.println("content time="+response.contentType());
	Assert.assertTrue(response.contentType().contains("json") );
	System.out.println("headers="+response.getHeaders());
	
	//validation test
	JsonPath jsonPath =response.jsonPath();
	Assert.assertTrue(jsonPath.get("status").toString()!=null,"status should not be null");
	Assert.assertTrue(jsonPath.get("data").toString()!=null,"status should not be null");
	
	System.out.println("status value from json="+jsonPath.get("status").toString());
	Assert.assertEquals("status".toString(),"success" );
}	
	
}
