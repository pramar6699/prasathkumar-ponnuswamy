import org.testng.Assert;
import org.testng.annotations.Test;

public class Category {

    @Test(priority=1)
    void getCategory(){

        Categories categories=new Categories();

        System.out.println(categories.categoryGet().getBody().asString());

        Assert.assertEquals(categories.categoryGet().getStatusCode(),200);

    }


   @Test(priority=2)
    void createCategory(){

        Categories categories=new Categories();

        System.out.println(categories.categoryCreate().getBody().asString());

        System.out.println(categories.categoryCreate().getStatusCode());

        Assert.assertEquals(categories.categoryCreate().getStatusCode(),400);


    }

    @Test(priority=3)
    void editCategory(){

        Categories categories=new Categories();

        System.out.println(categories.categoryEdit().asString());

        Assert.assertEquals(categories.categoryEdit().getStatusCode(),200);

    }

    @Test(priority = 4)
    void deleteCategory(){

        Categories categories=new Categories();

        System.out.println(categories.categoryDelete().asString());

        Assert.assertEquals(categories.categoryDelete().getStatusCode(),200);

    }

}
