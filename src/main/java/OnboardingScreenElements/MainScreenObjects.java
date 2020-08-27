package OnboardingScreenElements;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainScreenObjects {

	public MainScreenObjects(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="allo.ua:id/tbNavigation")
	public MobileElement CatalogPageButton;
	
	@AndroidFindBy(id="allo.ua:id/tbSearch")
	public MobileElement SearchButton;
	
	@AndroidFindBy(id="allo.ua:id/tbLocationImage")
	public MobileElement LocationButton ;

	@AndroidFindBy(id="allo.ua:id/tbCartIcon")
	public MobileElement BasketButton ;
	
	@AndroidFindBy(id="allo.ua:id/hits_of_season")
	public MobileElement InAppIsCheaperButton;
	
	@AndroidFindBy(id="allo.ua:id/specialOffers")
	public MobileElement SpecialOffersButton;
	
	@AndroidFindBy(id="allo.ua:id/item_smart_portal")
	public MobileElement SmartPortalButton;
	
	@AndroidFindBy(id="allo.ua:id/findServices")
	public MobileElement OurServicesButton;
		
	@AndroidFindBy(id="allo.ua:id/smartBonuses")
	public MobileElement SmartBonusesButton;
	
	@AndroidFindBy(id="allo.ua:id/news")
	public MobileElement NewsButton;
	
	@AndroidFindBy(id="allo.ua:id/searchEditField")
	public MobileElement SearchFieldButton;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector().scrollable(true).scrollIntoView(new UiSelector().text(\"Опис\"))")
	public MobileElement Scroll;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
	public  MobileElement ChooseBlackviewButton;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement TapOnThePhoneButton;
	
	@AndroidFindBy(id="allo.ua:id/txtJoinUsSocialMedia")
	public MobileElement ConnectToOurSocialButton;
	
	@AndroidFindBy(id="allo.ua:id/arrowRight")
	public MobileElement RightButton;
	
	@AndroidFindBy(id="allo.ua:id/productCatalog")
	public MobileElement ProductCatalogButton;
}
