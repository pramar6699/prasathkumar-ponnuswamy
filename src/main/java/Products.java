import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;


public class Products {

    public Products() {

        baseURI = "http://localhost:3030/products";
    }

    public Response productGet() {


        return given().queryParam("manufacturer", "Duracell").request(Method.GET);

    }

    public Response productCreate() {


        RequestSpecification httpRequest = RestAssured.given();

        httpRequest.header("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "New Product");
        jsonObject.put("type", "Hard Good");
        jsonObject.put("upc", "12345676");
        jsonObject.put("price", 99.99);
        jsonObject.put("description", "This is a placeholder request for creating a new product");
        jsonObject.put("model", "NP12345");

        httpRequest.body(jsonObject.toJSONString());

        return httpRequest.request(Method.POST);
    }

    public Response productEdit() {


        RequestSpecification httpRequest = RestAssured.given();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "New Product for N26");
        jsonObject.put("type", "Hard Good");
        jsonObject.put("upc", "12345676");
        jsonObject.put("price", 99.99);
        jsonObject.put("description", "This is a placeholder request for creating a new product");
        jsonObject.put("model", "NP12345");

        return httpRequest.queryParam("id", "9999687").request(Method.PATCH);
    }

    public Response productDelete() {

        return given().queryParam("id", "9999691").request(Method.DELETE);

    }
}

