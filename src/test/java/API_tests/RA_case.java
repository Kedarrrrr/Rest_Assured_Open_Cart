package API_tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RA_case {

	@Test(priority =1)
	void postreq() {
		given()
			.contentType("application/json")
		.when()
			.get("http://localhost:3000/students")
		.then()
			.statusCode(200);
	}
	@Test(priority=2)
	void postreq2() {
		
	}
	
}
