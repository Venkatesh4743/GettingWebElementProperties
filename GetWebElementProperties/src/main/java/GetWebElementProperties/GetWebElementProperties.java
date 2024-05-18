package GetWebElementProperties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWebElementProperties {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ap/signin?ie=UTF8&ie=UTF8&openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&fromAuthPrompt=1&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
		Thread.sleep(3000);
	
		//Getting TagName
		System.out.println(driver.findElement(By.id("ap_email")).getTagName());
		
		//Getting HTML attribute value
	    String attributevalue = driver.findElement(By.id("ap_email")).getAttribute("type");
	    System.out.println(attributevalue);
		
		//Get text which is entered inside the textbox
		WebElement txt=driver.findElement(By.id("ap_email"));
		txt.sendKeys("alright");
		System.out.println(txt.getAttribute("value"));//we need to type value on our own
		
	    //getting text which is above the text field ie email or phonenumber	
		System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Email or mobile phone number']")).getText());
		
		driver.quit();
		
	}

}
