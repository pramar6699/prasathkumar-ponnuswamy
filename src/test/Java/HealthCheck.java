import org.testng.Assert;
import org.testng.annotations.Test;

public class HealthCheck {

    @Test(priority=1)
    void getHealthCheck(){

        Healthchecks healthchecks = new Healthchecks();

        System.out.println(healthchecks.healthcheckGet().getBody().asString());

        Assert.assertEquals(healthchecks.healthcheckGet().getStatusCode(),200);

    }

}
