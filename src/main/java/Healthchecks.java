import io.restassured.http.Method;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Healthchecks {

    public Healthchecks(){

        baseURI = "http://localhost:3030/healthcheck";
    }

    public Response healthcheckGet() {

        return given().request(Method.GET);

    }
}
