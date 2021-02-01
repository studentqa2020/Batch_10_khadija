package com.test;

/*
public class ManualToAutomationTesting {

	Response responce;

@Before Test

public void setup()	{	
 responce=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");	
	
}

	@Test
	public void datacheck() {
		// check the data null or not

		int a = 10;
		boolean responceData = responce.toString() != null;
		Assert.assertTrue(responceData);
		// responce.body();
		// System.out.println(responce.toString()!=null);
	@Test
	public void statusValue() {
		JsonPath jp= responce.jsonPath();
		Assert.assertEquals(jp.get("status").toString(),"success");
		//System.out.println(jp.get("status").toString());
		
	@Test (dependsOnMethods= {"datacheck"});
	
	public void dataFormat() {
		
	Assert.assertTrue(responce.contentType().contains("json"));	
	@Test
	public void statuscode() {
	System.out.println(responce.statusCode());	
	Assert.assertEquals(responce.statusCode(), 200);	
	Assert.assertTrue(responce.statusCode()== 200);
	
*/
/*
 * Response responce;
 * 
 * @BeforeTest public void setup() { responce =
 * RestAssured.get(" http://dummy.restapiexample.com/api/v1/employees"); }
 * 
 * @Test public void dataCheck() { //boolean responceData = responce.toString()
 * != null; Assert.assertTrue(responce.toString() != null);//true }
 * 
 * @Test(dependsOnMethods = {"dataCheck"}) public void statusValue() {
 * 
 * JsonPath jp = responce.jsonPath();
 * Assert.assertEquals(jp.get("status").toString(), "success");
 * System.out.println(jp.get("status").toString());
 * 
 * }
 * 
 * @Test(dependsOnMethods = {"statusValue"}) public void dataFormat() {
 * 
 * System.out.println(responce.contentType().contains("json"));// true
 * 
 * Assert.assertTrue(responce.contentType().contains("json")); }
 * 
 * @Test(dependsOnMethods = {"dataFormat"}) public void statusCode() {
 * 
 * System.out.println(responce.statusCode());
 * Assert.assertEquals(responce.statusCode(), 200);
 * Assert.assertTrue(responce.statusCode() == 200);
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 */