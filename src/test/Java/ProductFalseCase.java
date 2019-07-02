import org.testng.Assert;

public class ProductFalseCase {

    void editProduct(){

        Products products=new Products();

        System.out.println(products.productEdit().asString());

        Assert.assertEquals(products.productEdit().getStatusCode(),400);

    }
}
