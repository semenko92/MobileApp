package OnboardingScreenElements;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FirstCheckOut {
	public FirstCheckOut(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(id="allo.ua:id/et_user_name")
public MobileElement AddYourNameFieled;

@AndroidFindBy(id="allo.ua:id/et_phone")
public MobileElement AddYourPhoneField;

@AndroidFindBy(id="allo.ua:id/et_email")
public MobileElement AddYourEmailField;

@AndroidFindBy(id="allo.ua:id/et_city")
public MobileElement ChooseYourCityField;

@AndroidFindBy(id="allo.ua:id/fieldSearchCity")
public MobileElement AddYourCityField;

@AndroidFindBy(id="allo.ua:id/btn_next_step")
public MobileElement ChooseDeliveryAndPayment;

		
}
