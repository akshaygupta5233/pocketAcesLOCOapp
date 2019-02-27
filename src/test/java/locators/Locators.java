package locators;

import org.openqa.selenium.By;

public class Locators {

    public static final By englishLanguageTickMark = By.xpath("//android.widget.LinearLayout[@index='0']//following::android.widget.ImageView[@index='1']");
    public static final By englishLanguageSelect = By.xpath("//android.widget.RelativeLayout[@index=0]");
    public static final By languageNextButton = By.xpath("//android.widget.Button[@text='NEXT']");
    public static final By noneOfTheAboveButton = By.xpath("//android.widget.Button[@text='NONE OF THE ABOVE']");
    public static final By headingYourPhoneNumber = By.xpath("//android.widget.TextView[@text='Your Phone Number']");
    public static final By phoneNumberTextBox = By.xpath("//android.widget.EditText[@text='Phone number']");
    public static final By phoneNumberNextButton = By.xpath("//android.widget.Button[@text='NEXT']");
    public static final By verificationCodeScreen = By.xpath("//android.widget.TextView[@text='Enter verification code']");
    public static final By permissionBtn = By.xpath("//android.widget.Button[@index='0']");
}
