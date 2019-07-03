import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Stores {

    public Stores(){

        baseURI = "http://localhost:3030/services";
    }

    public Response storeGet() {

        return given().queryParam("id","4").request(Method.GET);

    }

    public Response storeCreate(){

        RequestSpecification httpRequest = RestAssured.given();

        httpRequest.header("Content-Type","application/json");

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "N26_New_Branch");

        httpRequest.body(jsonObject.toJSONString());

        return httpRequest.request(Method.POST);
    }

    public Response storeEdit(){

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "New Store_N26");
        jsonObject.put("type", "Bank");
        jsonObject.put("address", "123 Fake St");
        jsonObject.put("city", "Springfield");
        jsonObject.put("state", "MN");
        jsonObject.put("zip", "55123");
        jsonObject.put("lat", 44.969658);
        jsonObject.put("lng", -93.449539);
        jsonObject.put("hours", "Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");

        return httpRequest.queryParam("id","8922").request(Method.PATCH);
    }

    public Response storeDelete(){

        return given().queryParam("id","8924").request(Method.DELETE);

    }
}
