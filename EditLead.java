package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	
	@When("Cnter the username as {string}")
	public void enterUserName(String uname) {
		 driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@When("Enter the password as {string}")
	public void enterThePassword(String pwd) 
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Clicking the login button")
	public void clickingTheLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Clicking the {string} link")
	public void clicking_the_crmsfa_link(String linktext) {
		driver.findElement(By.linkText(linktext)).click();
	}
	@When("Enter the first name of lead")
	public void entertheFirstname() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Preethi");
	}
	@When("Clicking the Lead id link")
	public void clickLeadId() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	}

	@When("Edit the first name")
	public void editFirstName() {
		driver.findElement(By.id("updateLeadForm_firstName")).clear();
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys("Preethi");
	}
	@When("Edit the last name")
	public void editLastName() {
		driver.findElement(By.id("updateLeadForm_lastName")).clear();
		driver.findElement(By.id("updateLeadForm_lastName")).sendKeys("KB");
	}
	@When("Edit the company name")
	public void editCompanyName() {
		driver.findElement(By.id("updateLeadForm_firstName")).clear();
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys("TestLeaf");
	}
	@When("Clicking the update link")
	public void clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	
	@Then("View Lead page of editlead should be displayed")
	public void viewLead() {
	      System.out.println("Lead updated successfully");
	}
	
	
	
	

}
