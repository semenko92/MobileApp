package OnboardingScreenElements;

import org.openqa.selenium.support.PageFactory;

import General.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductScreenObjects  {
	public ProductScreenObjects(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="allo.ua:id/to_cart_button")
	public MobileElement AddToBusketButton;
	
	@AndroidFindBy(id="allo.ua:id/tbCartIcon")
	public MobileElement BasketButton;
		

}
