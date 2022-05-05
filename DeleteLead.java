package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	
	@When("Enter the username1 as {string}")
	public void enterTheUsername1As(String uname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@When("Enter the password1 as {string}")
	public void enterDeletePassword1(String pass) {
		 driver.findElement(By.id("password")).sendKeys(pass);
	}

	
	@When("Clicking  the login1 button")
	public void clickingTheLogin1Button() 
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Enter the {string} link")
	public void clicking_the_crmsfa_link(String linktext) {
		
		driver.findElement(By.linkText(linktext)).click();
	}
	
	@When("Enter the phone area code")
	public void enter_the_phone_area_code() {
		driver.findElement(By.name("phoneAreaCode")).sendKeys("000");
	}

	@When("Enter the phone number")
	public void enter_the_phone_number() {
		driver.findElement(By.name("phoneNumber")).sendKeys("1234");
	}

	@When("Clicking the lead id link")
	public void clicking_the_lead_id_link() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]//a")).click();
	}

	@When("Clicking the delete button")
	public void clicking_the_delete_button() {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	}

	@Then("My lead page is displayed")
	public void my_lead_page_is_displayed() {
	    System.out.println("My lead page is displayed");
	}



}
