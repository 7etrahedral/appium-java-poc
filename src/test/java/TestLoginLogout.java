import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

/**
 * Created by genta.wibowo on 6/30/2016.
 */
public class TestLoginLogout extends AndroidSetup {

    @Stories("As a user I want to be able to log in")
    @TestCaseId("TC_KRM_001_001")
    @Title("Verify user is able to log in")
    @Test(priority = 0)
    public void logIn() throws Exception{
        ad.findElement(By.id("com.twitter.android:id/login_identifier")).sendKeys("wibowobullseye");
        ad.findElement(By.id("com.twitter.android:id/login_password")).sendKeys("qpqpqp");
        ad.findElement(By.id("com.twitter.android:id/login_login")).click();
        ad.findElement(By.id("android:id/button1")).click();
        ad.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
    }
/*
    @Test(priority = 1)
    public void logOut() {
        ad.findElement(By.id("com.twitter.android:id/overflow")).click();
//        ad.findElement(By.linkText("Settings")).click();
//        ad.findElement(By.linkText("Sign out")).click();
        ad.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[5]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
        ad.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
        ad.findElement(By.id("android:id/button1")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")));
    }
*/
}
