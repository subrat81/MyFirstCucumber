package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDefination {
	WebDriver driver;
	@Given("^provide url to the browser$")
	public void provide_url_to_the_browser() throws Throwable {
	   driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("http://orangehrm.qedgetech.com/");
	   
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String username) throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String password) throws Throwable {
		 driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^I click Admin$")
	public void i_click_Admin() throws Throwable {
	    driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	}

	@When("^I click add btn$")
	public void i_click_add_btn() throws Throwable {
	    driver.findElement(By.name("btnAdd")).click();
	}

	@When("^I selsect \"([^\"]*)\" in userrole$")
	public void i_selsect_in_userrole(String UserRole) 
	{
	 new Select(driver.findElement(By.name("systemUser[userType]"))).selectByVisibleText(UserRole);
	}

	@When("^I enter \"([^\"]*)\" in ename$")
	public void i_enter_in_ename(String EmployeeName) throws Throwable {
	    driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys(EmployeeName);
	}

	@When("^I enter \"([^\"]*)\" in uname$")
	public void i_enter_in_uname(String uname) throws Throwable {
		driver.findElement(By.name("systemUser[userName]")).sendKeys(uname);  
	}

	@When("^I enter \"([^\"]*)\" in password$")
	public void i_enter_in_password(String pass) throws Throwable {
	   
	    driver.findElement(By.name("systemUser[password]")).sendKeys(pass);
	}

	@When("^I enter \"([^\"]*)\" in cpassword$")
	public void i_enter_in_cpassword(String cpass) throws Throwable {
	    
	    driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys(cpass);
	}

	@When("^I click save btn$")
	public void i_click_save_btn() throws Throwable {
	  driver.findElement(By.id("btnSave")).click();
	}

	@Then("^I validate url$")
	public void i_validate_url() throws Throwable {
	    String expectedurl="viewSystemUsers";
	    String Actualurl=driver.getCurrentUrl();
	    if(Actualurl.toLowerCase().contains(expectedurl.toLowerCase()))
	    {
	    	System.out.println("user creation success");
	    }
	    else
	    {
	    	System.out.println("user creation fail");
	    }
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}


}
