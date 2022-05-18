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

public class PrimusBranchStepDefination {
	WebDriver driver;
	@Given("^run primus url to the browser$")
	public void run_primus_url_to_the_browser() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://primusbank.qedgetech.com/");
	    
	}

	@When("^Enter username as \"([^\"]*)\"$")
	public void enter_username_as(String username) throws Throwable {
		driver.findElement(By.name("txtuId")).sendKeys(username);
	    
	}

	@When("^the password as \"([^\"]*)\"$")
	public void the_password_as(String password) throws Throwable {
		driver.findElement(By.name("txtPword")).sendKeys(password);
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
	    driver.findElement(By.id("login")).click();
	}

	@When("^Click the branches$")
	public void click_the_branches() throws Throwable {
	    driver.findElement(By.xpath("(//img)[5]")).click();
	}

	@When("^click the new branch$")
	public void click_the_new_branch() throws Throwable {
	 driver.findElement(By.name("BtnNewBR")).click();
	}

	@When("^I enter \"([^\"]*)\" in bname$")
	public void i_enter_in_bname(String bname) throws Throwable {
	    driver.findElement(By.name("txtbName")).sendKeys(bname);
	}

	@When("^I enter \"([^\"]*)\" in adr(\\d+)$")
	public void i_enter_in_adr1(String adr1) throws Throwable {
	   driver.findElement(By.name("txtAdd1")).sendKeys(adr1);
	}
	/*@When("^I enter \"([^\"]*)\" in adr(\\d+)$")
	public void i_enter_in_adr2(String adr2) throws Throwable {
	   driver.findElement(By.name("Txtadd2")).sendKeys(adr2);
	}
	@When("^I enter \"([^\"]*)\" in adr(\\d+)$")
	public void i_enter_in_adr3(String adr3) throws Throwable {
	   driver.findElement(By.name("txtadd3")).sendKeys(adr3);
	}*/

	@When("^I enter \"([^\"]*)\" in area$")
	public void i_enter_in_area(String area) throws Throwable {
	    driver.findElement(By.name("txtArea")).sendKeys(area);
	}

	@When("^I enter \"([^\"]*)\" in zcode$")
	public void i_enter_in_zcode(String code) throws Throwable {
		driver.findElement(By.name("txtZip")).sendKeys(code);
	}

	@When("^i select \"([^\"]*)\" in country$")
	public void i_select_in_country(String country) throws Throwable {
	    new Select(driver.findElement(By.name("lst_counrtyU"))).selectByVisibleText(country);
	}

	@When("^i select \"([^\"]*)\" in state$")
	public void i_select_in_state(String state) throws Throwable {
		new Select(driver.findElement(By.name("lst_stateI"))).selectByVisibleText(state);
	}

	@When("^i select \"([^\"]*)\" in city$")
	public void i_select_in_city(String city) throws Throwable {
		new Select(driver.findElement(By.name("lst_cityI"))).selectByVisibleText(city);
	}

	@When("^i click save btn$")
	public void i_click_save_btn() throws Throwable {
	    driver.findElement(By.id("btn_insert")).click();
	}

	@Then("^validate alert massage$")
	public void validate_alert_massage() throws Throwable {
	   String expectedalert=driver.switchTo().alert().getText();
	   driver.switchTo().alert().accept();
	   String actualalert="New Branch with id";
	   if(expectedalert.contains(actualalert))
	   {
		   System.out.println(expectedalert);
	   }
	   else
	   {
		   System.out.println("user creation failed");
	   }
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}


}
