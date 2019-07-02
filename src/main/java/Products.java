import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;


public class Products {


    public Response productGet() {

        baseURI = "http://localhost:3030/products";

        return given().queryParam("manufacturer","Duracell").request(Method.GET);

    }

    public Response productCreate(){

        baseURI = "http://localhost:3030/products";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParameters = new JSONObject();


        requestParameters.put("name", "New Product");
        requestParameters.put("type", "Hard Good");
        requestParameters.put("upc", "12345676");
        requestParameters.put("price", 99.99);
        requestParameters.put("description", "This is a placeholder request for creating a new product");
        requestParameters.put("model", "NP12345");

        httpRequest.header("Content-Type","application/json");

        httpRequest.body(requestParameters.toJSONString());

        return httpRequest.request(Method.POST);
    }
}

