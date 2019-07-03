import org.testng.Assert;
import org.testng.annotations.Test;

public class Service {

    @Test(priority=1)
    void getService(){

        Services services=new Services();

        System.out.println(services.serviceGet().getBody().asString());

        Assert.assertEquals(services.serviceGet().getStatusCode(),200);

    }


    @Test(priority=2)
    void createService(){

        Services services=new Services();

        System.out.println(services.serviceCreate().getBody().asString());

        Assert.assertEquals(services.serviceCreate().getStatusCode(),201);


    }

    @Test(priority=3)
    void editService(){

        Services services=new Services();

        System.out.println(services.serviceEdit().asString());

        Assert.assertEquals(services.serviceEdit().getStatusCode(),200);

    }

    @Test(priority = 4)
    void deleteService(){

        Services services=new Services();

        System.out.println(services.serviceDelete().asString());

        Assert.assertEquals(services.serviceDelete().getStatusCode(),200);

    }

}
