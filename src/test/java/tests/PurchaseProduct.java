package tests;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
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

public class PurchaseProduct extends TestBase {
	AndroidDriver driver;
	MainScreenObjects mainScreenObjects;
	OnBoardScreen onBoardScreen;
	LeftAppearedMenu leftAppearedMenu;
	ProductScreenObjects productScreenObjects;
	BasketPage basketPage;
	FirstCheckOut firstCheckOut;
	SecondCheckOut secondCheckOut;
	
	
	@Test
	public void searchTest() throws InterruptedException {
		mainScreenObjects.CatalogPageButton.click();
		leftAppearedMenu.ChooseTownButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout")));
		leftAppearedMenu.ChooseDneprButton.click();
		productScreenObjects.BasketButton.click();
		mainScreenObjects.SearchButton.click();
		mainScreenObjects.SearchFieldButton.sendKeys("black");
		mainScreenObjects.ChooseBlackviewButton.click();
		mainScreenObjects.TapOnThePhoneButton.click();
		productScreenObjects.AddToBusketButton.click();
		WebDriverWait wait9 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allo.ua:id/tbTitle")));
		
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		  		+ " .scrollIntoView(new UiSelector().text(\"Опис\"))");
		  
		  productScreenObjects.BasketButton.click();
		  basketPage.AddOneMoreItemButton.click();
		  WebDriverWait wait1 = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allo.ua:id/make_order_button")));
		  
		  basketPage.CreateAnOrder.click();
		  
	      firstCheckOut.AddYourNameFieled.sendKeys("Сергей");
	      firstCheckOut.AddYourPhoneField.sendKeys("755738281");
	      firstCheckOut.AddYourEmailField.sendKeys("qaz@gmail.com");
	      firstCheckOut.ChooseDeliveryAndPayment.click();
	      
	      WebDriverWait wait2 = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allo.ua:id/checkBox")));
	      
	      secondCheckOut.DontCallMeButton.click();
	      
	      driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
			  		+ " .scrollIntoView(new UiSelector().text(\"Додайте коментар\"))");
	      secondCheckOut.AddCommentField.sendKeys("Тестовый заказ");
	      secondCheckOut.AddYourSurNameField.sendKeys("Семенко");
	      secondCheckOut.SubmitOrderButton.click();
	      
	      WebDriverWait wait5 = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("allo.ua:id/txtThanksForOrderTitle")));
			
		  String actualText=driver.findElement(By.id("allo.ua:id/txtThanksForOrderTitle")).getText();
	      String expectedText="Дякуємо! Ваші замовлення успішно оформлені!";
	      Assert.assertEquals(actualText, expectedText);
	  
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
