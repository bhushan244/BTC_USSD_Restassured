package confirmation_testsuit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Confirm_Customer {
	@Test
	public void confirm_PA_MTN_cust() {
		JSONObject object = new JSONObject();
		object.put("Mobile", "233204544441");
		object.put("SessionId", "1234569");
		object.put("ServiceCode", "712");
		object.put("Type", "Initiation");
		object.put("Message", "*712#");
		object.put("Operator", "vodafone");
		object.put("Sequence", "1");
		RestAssured.baseURI = "http://10.122.20.36/uspgh/confirmation";
		RequestSpecification request = RestAssured.given().header("Content-Type", "application/json")
				.accept("application/json").body(object.toJSONString());
		Response response = request.post();
		Assert.assertEquals(response.statusCode(), 200);
		String msg = response.jsonPath().get("Message");
		System.out.println(msg);
		
		response=request.get();
		System.out.println(response.body().asString());
		
		System.out.println(response.getHeaders());
	}
}
