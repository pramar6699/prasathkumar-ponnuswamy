import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreFalseCase {


    @Test(priority=1)
    void getStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeGet().getBody().asString());

        Assert.assertNotEquals(stores.storeGet().getStatusCode(),400);

    }


    @Test(priority=2)
    void createStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeCreate().getBody().asString());

        Assert.assertNotEquals(stores.storeCreate().getStatusCode(),400);


    }

    @Test(priority=3)
    void editStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeEdit().asString());

        Assert.assertNotEquals(stores.storeEdit().getStatusCode(),400);

    }

    @Test(priority = 4)
    void deleteStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeDelete().asString());

        Assert.assertNotEquals(stores.storeDelete().getStatusCode(),400);

    }

}
