import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductFalseCase {

    @Test(priority=1)
    void getProduct(){

        Products products=new Products();

        System.out.println(products.productGet().getBody().asString());

        Assert.assertNotEquals(products.productGet().getStatusCode(),400);

    }


    @Test(priority=2)
    void createProduct(){

        Products products=new Products();

        System.out.println(products.productCreate().getBody().asString());

        Assert.assertNotEquals(products.productCreate().getStatusCode(),400);


    }

    @Test(priority=3)
    void editProduct(){

        Products products=new Products();

        System.out.println(products.productEdit().asString());

        Assert.assertNotEquals(products.productEdit().getStatusCode(),400);

    }

    @Test(priority = 4)
    void deleteProduct(){

        Products products=new Products();

        System.out.println(products.productDelete().asString());

        Assert.assertNotEquals(products.productDelete().getStatusCode(),400);

    }

}
