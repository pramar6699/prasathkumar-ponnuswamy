import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Services {

    public Services(){

        baseURI = "http://localhost:3030/services";

    }
    public Response serviceGet() {

        return given().queryParam("id","1").request(Method.GET);

    }

    public Response serviceCreate(){

        RequestSpecification httpRequest = RestAssured.given();

        httpRequest.header("Content-Type","application/json");

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "New Service for N26");

        httpRequest.body(jsonObject.toJSONString());

        return httpRequest.request(Method.POST);
    }

    public Response serviceEdit(){


        RequestSpecification httpRequest = RestAssured.given();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "New Service for N26");

        return httpRequest.queryParam("id","23").request(Method.PATCH);
    }

    public Response serviceDelete(){

        return given().queryParam("id","24").request(Method.DELETE);

    }
}
