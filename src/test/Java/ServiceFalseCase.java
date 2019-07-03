import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceFalseCase {

    @Test(priority=1)
    void getService(){

        Services services=new Services();

        System.out.println(services.serviceGet().getBody().asString());

        Assert.assertNotEquals(services.serviceGet().getStatusCode(),400);

    }


    @Test(priority=2)
    void createService(){

        Services services=new Services();

        System.out.println(services.serviceCreate().getBody().asString());

        Assert.assertNotEquals(services.serviceCreate().getStatusCode(),400);


    }

    @Test(priority=3)
    void editService(){

        Services services=new Services();

        System.out.println(services.serviceEdit().asString());

        Assert.assertNotEquals(services.serviceEdit().getStatusCode(),400);

    }

    @Test(priority = 4)
    void deleteService(){

        Services services=new Services();

        System.out.println(services.serviceDelete().asString());

        Assert.assertNotEquals(services.serviceDelete().getStatusCode(),400);

    }

}