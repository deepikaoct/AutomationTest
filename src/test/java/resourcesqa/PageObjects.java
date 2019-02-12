package resourcesqa;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObjects {

	public WebDriver driver;
	
	public void createAccount() {
		
		
		 WebElement createAcc = driver.findElement(By.xpath("//div[@class='box-footer']/a"));
		createAcc.click();
		 
		 
	}
	public void  fullname() {
		WebElement Fullname = driver.findElement(By.id("user_name"));
		Fullname.sendKeys("Deepika Vijay");
	}
	public void userEmail() {
		WebElement useremail = driver.findElement(By.id("user_email"));
		
		useremail.sendKeys("deepikaragunathan@gmail.com");
	}
	
	public void passWordCreate() {
		 WebElement passwrd =  driver.findElement(By.id("user_password"));
		 passwrd.sendKeys("Vijay@123");
		 
		
	}
	
	public void confirmPassword() {
		WebElement confpaswd = driver.findElement(By.id("user_password_confirmation"));
		confpaswd.sendKeys("Vijay@123");
	}
	
public void emailCheckBox() {
	 WebElement emailcheckbox  = driver.findElement(By.id("user_unsubscribe_from_marketing_emails"));
	 
	 emailcheckbox.click();
}

	public void PolicyCheckbox() {
		WebElement policyCheckbox = driver.findElement(By.id("user_agreed_to_terms"));
		policyCheckbox.click();
	}
	
	public void submitCreation() {
		
		 WebElement submitcreation = driver.findElement(By.xpath("//input[@value='Sign Up']"));
			submitcreation.click();
	}
 public void createAccountMethod() {
	 createAccount();
	 fullname();
	 userEmail();
	 passWordCreate();
	 confirmPassword();
	 emailCheckBox();
	 PolicyCheckbox();
	 submitCreation();
	 
	 
 }
  
	
	public void login() {
		 WebElement login = driver.findElement(By.xpath("//a[@href=\'http://qaclickacademy.usefedora.com/sign_in\']/span"));
		 login.click();
		
	}
	
	public   void email(String userName) {
		
		WebElement email= driver.findElement(By.id("user_email"));
        email.sendKeys(userName);
	
		
	}
		public void passWord(String pass_word) {
			
			WebElement passWord= driver.findElement(By.id("user_password"));
			passWord.sendKeys(pass_word);
		 
			}
		public void popup() {
			int size = driver.findElements(By.xpath("//*[text()='NO THANKS']")).size();
			
			if (size>0) {
				
				driver.findElement(By.xpath("//*[text()='NO THANKS']")).click();
			}
			
		}
		
		public void submit() {
			driver.findElement(By.name("commit")).click();
		}
		
		
		public void coursesTab() {
			driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[2]")).click();
			String CourseTitle = driver.getTitle();
		}
		
		public void linkChecks() {
			String linkonnewtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Actions actions = new Actions(driver);
	        actions.moveToElement(driver.findElement(By.id("course-box-price-product-107392")));
	        actions.click();	  
	        actions.sendKeys(linkonnewtab);
	        actions.build().perform();
		
			
			
			//int count = driver.findElements(By.xpath("//img[@class='course-box-image']")).size();
			//for (int i= 0; i<count;i++) {
				//driver.findElements(By.xpath("//img[@class='course-box-image']")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
				
			//}
			
		}
		
		public PageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	


}

