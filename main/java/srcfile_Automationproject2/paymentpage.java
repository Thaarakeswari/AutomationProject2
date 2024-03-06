package srcfile_Automationproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentpage {
	@FindBy(xpath="//span[text()='Credit/Debit/ATM Card']")
	WebElement credit_payment;
	@FindBy(xpath="//input[@id='cardNumber']")
	WebElement credit_number;
	@FindBy(xpath="//input[@name='expiryMonth']")
	WebElement month;
	@FindBy(xpath="//div[@class='dropdown-list']/ul/li[6]")
	WebElement month1;
	@FindBy(xpath="//input[@name='expiryYear']")
	WebElement yaer;
	@FindBy(xpath="//input[@value='2025']")
	WebElement year;
	@FindBy(xpath="//input[@id='cardCvv']")
	WebElement cvv;
	@FindBy(xpath="//input[@id='nameOnCard']")
	WebElement cardname;
	public void credit_payment()
	{
		credit_payment.click();
	}
	public void credit_number()
	{
		credit_number.sendKeys("12345");
	}
	public void month() throws InterruptedException
	{
		month.click();
		Thread.sleep(1000);
		month1.click();
	}
	public void year() throws InterruptedException
	{
		yaer.click();
		Thread.sleep(1000);
		year.click();
	}
	public void cvv()
	{
		cvv.click();
	}
	public void cardname()
	{
		cardname.sendKeys("Thaara");
	}

public	paymentpage(WebDriver driver) 
{
PageFactory.initElements(driver, this);
}
}
