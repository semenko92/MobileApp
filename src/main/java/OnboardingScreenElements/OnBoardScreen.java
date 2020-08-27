package OnboardingScreenElements;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OnBoardScreen{

public OnBoardScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(id="allo.ua:id/button_next_onboarding")
public MobileElement NextButton;

@AndroidFindBy(id="allo.ua:id/button_close_onboarding")
public MobileElement CLoseOnboardingButton;

@AndroidFindBy(id="allo.ua:id/btn_ok")
public MobileElement OkCityButton;



}