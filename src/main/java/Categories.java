import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Categories {

    public Categories(){

        baseURI = "http://localhost:3030/categories";

    }

    public Response categoryGet() {

        return given().queryParam("id","abcat0020004").request(Method.GET);

    }

   public Response categoryCreate(){


        RequestSpecification httpRequest = RestAssured.given();

        httpRequest.header("Content-Type","application/json");

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", "N26_1"); //TODO please make sure to give unique id while creating a new category. Since,
        jsonObject.put("name", "New Category_1");

        httpRequest.body(jsonObject.toJSONString());

        return httpRequest.request(Method.POST);
    }

    public Response categoryEdit(){

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "N26_Category");

        return httpRequest.queryParam("id","abcat0020004").request(Method.PATCH);
    }

    public Response categoryDelete(){

        return given().queryParam("id","pcmcat84000050000").request(Method.DELETE);

    }
}
