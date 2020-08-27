package OnboardingScreenElements;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SecondCheckOut  {
	public SecondCheckOut(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="allo.ua:id/checkBox")
	public MobileElement DontCallMeButton;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup")
    public MobileElement DeliveryOption;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView")
	public MobileElement NewPostCourier;
	
	@AndroidFindBy(id="allo.ua:id/et_address")
	public MobileElement AddYourStreet;
	
	@AndroidFindBy(id="allo.ua:id/et_house_number")
	public MobileElement AddYourHouseNumber;
	
	@AndroidFindBy(id="allo.ua:id/et_apartment_number")
	public MobileElement AddYourFlatNumber;
	
	@AndroidFindBy(id="allo.ua:id/buttonSubmitOrder")
	public MobileElement SubmitOrderButton;
	
	@AndroidFindBy(id="allo.ua:id/fieldComment")
	public MobileElement AddCommentField;
	
	@AndroidFindBy(id="allo.ua:id/dont_call_me_user_lastname")
	public MobileElement AddYourSurNameField;
	
}
