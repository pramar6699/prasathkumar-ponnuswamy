import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryFalseCase {


    @Test(priority=1)
    void getCategoryFalse(){

        Categories categories=new Categories();

        Assert.assertNotEquals(categories.categoryGet().getStatusCode(),400);

    }


   @Test(priority=2)
    void createCategoryFalse(){

        Categories categories=new Categories();

        Assert.assertNotEquals(categories.categoryCreate().getStatusCode(),201);

    }

    @Test(priority=3)
    void editCategoryFalse(){

        Categories categories=new Categories();

        Assert.assertNotEquals(categories.categoryEdit().getStatusCode(),400);


    }

   @Test(priority = 4)
    void deleteCategoryFalse(){

        Categories categories=new Categories();

        Assert.assertNotEquals(categories.categoryDelete().getStatusCode(),400);

    }

}
