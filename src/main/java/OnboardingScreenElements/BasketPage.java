package OnboardingScreenElements;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasketPage {
	
		public BasketPage(AppiumDriver driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		@AndroidFindBy(id="allo.ua:id/increment_count_of_product_pressable_area")
		public MobileElement AddOneMoreItemButton;
		
		@AndroidFindBy(id="allo.ua:id/make_order_button")
		public MobileElement CreateAnOrder;
		
		
}
