package OnboardingScreenElements;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LeftAppearedMenu {
	public LeftAppearedMenu(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="allo.ua:id/txt_user_name")
	public MobileElement EntranceRegistrationButton;
	
	@AndroidFindBy(id="allo.ua:id/lang_switch")
	public MobileElement LanguageSwitchButton;
	
	@AndroidFindBy(id="allo.ua:id/tv_user_city")
	public MobileElement ChooseTownButton;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	public MobileElement ChooseDneprButton;
}
