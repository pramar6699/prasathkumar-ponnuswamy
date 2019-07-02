import org.testng.Assert;
import org.testng.annotations.Test;


public class Product {


    @Test(priority=1)
    void getProduct(){

        Products products=new Products();

        Assert.assertEquals(products.productGet().getStatusCode(),200);

    }


    @Test(priority=2)
    void createProduct(){

        Products products=new Products();

        System.out.println(products.productCreate().getBody().asString());

        Assert.assertEquals(products.productCreate().getStatusCode(),201);


    }

    @Test(priority=2)
    void getProductOrderBy(){

        Products products=new Products();

        System.out.println(products.productGet().asString());




    }
}
