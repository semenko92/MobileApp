package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import General.TestBase;
import OnboardingScreenElements.OnBoardScreen;
import io.appium.java_client.android.AndroidDriver;
import OnboardingScreenElements.MainScreenObjects;

public class OnboardingTest extends TestBase {
	AndroidDriver driver;
	OnBoardScreen onBoardScreen;
	MainScreenObjects mainScreenObjects;
	
@Test
public void OnboardingTest() {
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allo.ua:id/button_close_onboarding")));
	
	onBoardScreen.CLoseOnboardingButton.click();
	onBoardScreen.OkCityButton.click();
	mainScreenObjects.CatalogPageButton.click();
	
}












@BeforeTest
public void beforeTest() throws MalformedURLException {
driver=mycapabilities();
onBoardScreen=new OnBoardScreen(driver);
mainScreenObjects=new MainScreenObjects(driver);
}
}