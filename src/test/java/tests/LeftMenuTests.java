package tests;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import General.TestBase;
import OnboardingScreenElements.LeftAppearedMenu;
import OnboardingScreenElements.MainScreenObjects;
import OnboardingScreenElements.OnBoardScreen;
import io.appium.java_client.android.AndroidDriver;

public class LeftMenuTests extends TestBase {
	AndroidDriver driver;
	OnBoardScreen onBoardScreen;
	MainScreenObjects mainScreenObjects;
    LeftAppearedMenu leftAppearedMenu;
    
    @Test
    public void switchTest() {
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		  		+ " .scrollIntoView(new UiSelector().text(\"Тестовые настройки\"))");
		  
    	
		leftAppearedMenu.LanguageSwitchButton.click();
		
		mainScreenObjects.ProductCatalogButton.click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		  		+ " .scrollIntoView(new UiSelector().text(\"Парфюмерия, уход и украшения\"))");
		  
    }
    













@BeforeTest
public void beforeTest() throws MalformedURLException {
driver=mycapabilities();
onBoardScreen=new OnBoardScreen(driver);
mainScreenObjects=new MainScreenObjects(driver);
leftAppearedMenu=new LeftAppearedMenu(driver);

WebDriverWait wait = new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allo.ua:id/button_close_onboarding")));

onBoardScreen.CLoseOnboardingButton.click();
onBoardScreen.OkCityButton.click();
mainScreenObjects.CatalogPageButton.click();
}
}