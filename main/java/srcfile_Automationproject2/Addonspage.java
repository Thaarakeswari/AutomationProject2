package srcfile_Automationproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addonspage {
	@FindBy(xpath="//button[text()='That’s Correct']")
	WebElement thats_correct;
	@FindBy(xpath="//span[text()='Extra leg-room']")
	WebElement extra_legroom_charge;
	@FindBy(xpath="(//button[.='Add'])[1]")
	WebElement meals;
	@FindBy(xpath="(//button[.='Add'])[10]")
	WebElement baggage;
	@FindBy(xpath="//button[.='Proceed To Payment']")
	WebElement proceedpayment;
	@FindBy(xpath="//span[text()='Credit/Debit/ATM Card']")
	WebElement credit_payment;
	
	public void correctbutton()
	{
		thats_correct.click();
	}
	public void extra_legroom_charge()
	{
		extra_legroom_charge.click();
	}
	public boolean extra_legroom_charge1()
	{
	boolean b=extra_legroom_charge.isDisplayed();
	return b;
	
	}
	public void meals()
	{
		meals.click();
	}
	public boolean meals1()
	{
	boolean b=meals.isDisplayed();
	return b;
	
	}
	public void baggage()
	{
		baggage.click();
	}
	public boolean baggage1()
	{
	boolean b=baggage.isDisplayed();
	return b;
	
	}
	public void proceedpayment()
	{
		proceedpayment.click();
	}
	public void credit_payment()
	{
		credit_payment.click();
	}

public	Addonspage(WebDriver driver) 
{
PageFactory.initElements(driver, this);
}
}

