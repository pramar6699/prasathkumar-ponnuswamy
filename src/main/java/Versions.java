import io.restassured.http.Method;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Versions {

    public Versions(){

        baseURI = "http://localhost:3030/version";

    }

    public Response versionGet() {

        return given().request(Method.GET);

    }
}
