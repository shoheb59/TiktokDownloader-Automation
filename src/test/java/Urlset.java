import org.testng.annotations.DataProvider;


public class Urlset extends Setup {
    @DataProvider(name = "data-provider1")
    public Object[][] setData() throws InterruptedException {
        return new Object[][]{
                {"www.tiktok.com/@filmmovies21/video/7134252964243459333?is_from_webapp=1&sender_device=pc"},


        };
    }

    @DataProvider(name = "data-provider2")
    public Object[][] setData1() throws InterruptedException {
        return new Object[][]{

                {"https://vt.tiktok.com/ZSRX7GhhL"}


        };
    }
}


