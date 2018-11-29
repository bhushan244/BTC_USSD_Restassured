package confirmation_testsuit;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

class Response_body_class {
	public String Type = "";
	public String Message = "";
}

public class Confirm_Customer_Validate_Response {

	@Test
	public void test1() {
		RestAssured.baseURI = "http://10.122.20.36/uspgh/confirmation";
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("accept", "application/json");
		JSONObject object = new JSONObject();
		object.put("Mobile", "233204544441");
		object.put("SessionId", "1234569");
		object.put("ServiceCode", "712");
		object.put("Type", "Initiation");
		object.put("Message", "*712#");
		object.put("Operator", "vodafone");
		object.put("Sequence", "1");
		Response response = given().headers(headers).body(object.toJSONString()).post();

		response.then().assertThat().statusCode(200);
		response.then().assertThat().body(
				"Dear bima, you have registered for BIMA  Doctor policies for GHC 15. Press 1 to authorise deductions and confirm T&C".replaceAll("\\s", ""), null
						);
	}
}
