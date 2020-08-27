package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import General.TestBase;
import OnboardingScreenElements.BasketPage;
import OnboardingScreenElements.FirstCheckOut;
import OnboardingScreenElements.LeftAppearedMenu;
import OnboardingScreenElements.MainScreenObjects;
import OnboardingScreenElements.OnBoardScreen;
import OnboardingScreenElements.ProductScreenObjects;
import OnboardingScreenElements.SecondCheckOut;
import io.appium.java_client.android.AndroidDriver;

public class ChangeLanguageTest extends TestBase {
	AndroidDriver driver;
	MainScreenObjects mainScreenObjects;
	OnBoardScreen onBoardScreen;
	LeftAppearedMenu leftAppearedMenu;
	ProductScreenObjects productScreenObjects;
	BasketPage basketPage;
	FirstCheckOut firstCheckOut;
	SecondCheckOut secondCheckOut;
	
@Test
public void changeLanguageTest() {
	mainScreenObjects.CatalogPageButton.click();
	leftAppearedMenu.LanguageSwitchButton.click();
	String actualTitle=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")).getText();
	String expectedTitle="Каталог товаров";
	Assert.assertEquals(actualTitle, expectedTitle);
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
	  		+ " .scrollIntoView(new UiSelector().text(\"Долучайтесь до наших соц. мереж!\"))");
	
    mainScreenObjects.RightButton.click();
    String actualProductName = driver.findElement(By.id("allo.ua:id/tbTitle")).getText();
    String expectedProductName="Планшети";
    Assert.assertEquals(actualProductName, expectedProductName);
    

}

@BeforeTest
public void beforeTest() throws MalformedURLException {
driver=mycapabilities();
onBoardScreen=new OnBoardScreen(driver);
mainScreenObjects=new MainScreenObjects(driver);
leftAppearedMenu=new LeftAppearedMenu(driver);
productScreenObjects=new ProductScreenObjects(driver);
basketPage=new BasketPage(driver);
firstCheckOut=new FirstCheckOut(driver);
secondCheckOut=new SecondCheckOut(driver);


WebDriverWait wait = new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allo.ua:id/button_close_onboarding")));

onBoardScreen.CLoseOnboardingButton.click();
onBoardScreen.OkCityButton.click();
}
}