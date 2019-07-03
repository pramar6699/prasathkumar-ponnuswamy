import org.testng.Assert;
import org.testng.annotations.Test;

public class Store {


    @Test(priority=1)
    void getStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeGet().getBody().asString());

        Assert.assertEquals(stores.storeGet().getStatusCode(),200);

    }


    @Test(priority=2)
    void createStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeCreate().getBody().asString());

        Assert.assertEquals(stores.storeCreate().getStatusCode(),201);


    }

    @Test(priority=3)
    void editStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeEdit().asString());

        Assert.assertEquals(stores.storeEdit().getStatusCode(),200);

    }

    @Test(priority = 4)
    void deleteStore(){

        Stores stores=new Stores();

        System.out.println(stores.storeDelete().asString());

        Assert.assertEquals(stores.storeDelete().getStatusCode(),200);

    }

}
