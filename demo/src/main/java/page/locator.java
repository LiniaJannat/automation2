package page;

import org.openqa.selenium.By;

import Base.Driversetup;

public class locator extends Driversetup  {
	
	By name = By.xpath ("//input[@id='inputUsername']");
	By pass = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[2]");
	By check = By.xpath("//input[@id='chkboxTwo']");
	By btn = By.xpath("//button[contains(text(),'Sign In')]");
	
	By fp = By.xpath("//a[contains(text(),'Forgot your password?')]");
	By Username = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]");
	By email = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]");
	By phn = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]");
	
	By resetlogin = By.xpath("//button[contains(text(),'Reset Login')]");
	
	By go = By.xpath ("//button[contains(text(),'Go to Login')]");
	By log = By.xpath("//button[contains(text(),'Log Out')]");
	
	
	
	
	public void clickname ()
	{
		driver.findElement(name).sendKeys("zinia");
	}
	
	public void clickpass () {
		driver.findElement(pass).sendKeys("1234");
	}
	
	public void clickcheck () {
		
		driver.findElement(check).click();
	}
	
	
	public void clickbtn () {
		
		driver.findElement(btn).click();
	}
	
	public void clickfp () {
		driver.findElement(fp).click();
	}
	
	public void clickusername () {
		driver.findElement(Username).sendKeys("Linia Hossain ");
	}
	public void clickemail () {
		driver.findElement(email).sendKeys("linia@outlook.com");
	}
	
	public void clickphn () {
		driver.findElement(phn).sendKeys("0987653");
	}
	
	public void clickresetlogin () {
		driver.findElement(resetlogin).click();
		
	}
	
	public void clickgo () {
		driver.findElement(go).click ();
	}
	
	

	public void clickname2 ()
	{
		driver.findElement(name).sendKeys("zinia");
	}
	
	public void clickpass2 () {
		driver.findElement(pass).sendKeys("rahulshettyacademy");
	}
	
	public void clickbtn1 () {
		driver.findElement(btn).click();
	}
	
	public void clicklog ()
	{
		driver.findElement(log).click ();
	}
	

}
