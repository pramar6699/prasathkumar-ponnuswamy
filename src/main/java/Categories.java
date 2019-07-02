import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Categories {



    Response categories(){

        RestAssured.baseURI="localhost:3030/Products/limit";

        RequestSpecification httpRequest = RestAssured.given();

        Response response=httpRequest.request(Method.GET, "/5");

        return response;
    }
}
