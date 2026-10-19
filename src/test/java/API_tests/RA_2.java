package API_tests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RA_2 {

	HashMap<String, Object> data = new HashMap<>();
	String Id;
	@Test(priority=1)
	void create_user() {

		data.put("sID", "200");
		data.put("name", "Ram Rajadi");
		data.put("contact", "0055005500");
		data.put("courses", "DSA");
		Response res = given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("http://localhost:3000/students");
		Id = res.jsonPath().get("id").toString();
			
			
	}
	@Test(priority=2)
	void delete_Object() {
		String name = data.get("name").toString();
		given()
			.pathParam("id",Id)
		.when()
			.delete("http://localhost:3000/students/{id}");
		
		System.out.println(name);
	}
}
/*"sID": 102,
"name": "Priya Patel",
"contact": "9123456789",
"courses": [
  "Web Development",
  "JavaScript",
  "Data Structures"
],
"id": "XrqD24-p5Bw"
},
*/