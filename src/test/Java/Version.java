import org.testng.Assert;
import org.testng.annotations.Test;

public class Version {

    @Test(priority=1)
    void getVersion(){

        Versions versions = new Versions();

        System.out.println(versions.versionGet().getBody().asString());

        Assert.assertEquals(versions.versionGet().getStatusCode(),200);

    }
}
