package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass 
{
	
	@When("Enter the username_name as {string}")
	public void enter_the_username_as_username(String uname) 
	{
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@When("Enter the password_pass as {string}")
	public void enter_the_password_as_password(String pwd) 
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	
	@When("Clicking  the login button")
	public void clicking_the_login_button() 
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Clicking the CRMSFA link")
	public void clicking_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Clicking the Leads link")
	public void clicking_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Clicking  the create lead link")
	public void clicking_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the company name")
	public void enter_the_company_name() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
	@When("Enter the first name")
	public void enter_the_first_name() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preethi");
	}
	@When("Enter the last name")
	public void enter_the_last_name() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KB")	;
	}
	@When("Clicking the Create lead button")
	public void clicking_the_create_lead_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("View Lead page should be displayed")
	public void view_lead_page_should_be_displayed() {
	      System.out.println("Lead created successfully");
	}
	

}
