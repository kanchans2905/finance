package pomClasses;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;
import CommonUtilities.Constant_var;

public class MarketSummary extends TestBase
{
	@FindBy(xpath="//span[@class='Z90tFb r-iUu9zAV4eKUw']//parent::div")
	WebElement DJI;
	@FindBy(xpath="//span[@class='Z90tFb r-izMkdiw90E_A']//parent::div")
	WebElement DAX;
	@FindBy(xpath="//span[@class='Z90tFb r-ic_DfdDaavVw']//parent::div")
	WebElement SENSEX;
	@FindBy(xpath="//span[@class='Z90tFb r-ii6v1PgWDi8A']//parent::div")
	WebElement UKX;
	@FindBy(xpath="//span[@class='Z90tFb r-iZCGt6iD6bCg']//parent::div")
	WebElement IB;
	
	@FindBy(xpath="//span[@class='Z90tFb r-iUu9zAV4eKUw']")
	WebElement DJI_VALUE;
	@FindBy(xpath="//span[@class='Z90tFb r-izMkdiw90E_A']")
	WebElement DAX_VALUE;
	@FindBy(xpath="//span[@class='Z90tFb r-ic_DfdDaavVw']")
	WebElement SENSEX_VALUE;
	@FindBy(xpath="//span[@class='Z90tFb r-ii6v1PgWDi8A']")
	WebElement UKX_VALUE;
	@FindBy(xpath="//span[@class='Z90tFb r-iZCGt6iD6bCg']")
	WebElement IB_VALUE;
	
	@FindBy(xpath="//span[@class='iFFCsTk_zVU4-Y5HEJA6AmUY']")
	WebElement DJI_per;
	@FindBy(xpath="//span[@class='iU2X_Zqx_9pI-Y5HEJA6AmUY']")
	WebElement DAX_per;
	@FindBy(xpath="//span[@class='iBOheOlF26gs-Y5HEJA6AmUY']")
	WebElement SENSEX_per;
	@FindBy(xpath="//span[@class='iFLctZepxrwY-Y5HEJA6AmUY']")
	WebElement UKX_per;
	@FindBy(xpath="//span[@class='iuR_w9bLatQU-Y5HEJA6AmUY']")
	WebElement IB_per;
	
	public ArrayList<String> names;
	public ArrayList<String> values;
	public ArrayList<String> per;
	
	public MarketSummary() 
	{
		PageFactory.initElements(Constant_var.driver,this);
	}	
	
	public void click_DJI()
	{
		DJI.click();	
	}
	public void click_SENSEX()
	{	
		SENSEX.click();	
	}
	public void click_UKX()
	{	
		UKX.click();	
	}
	public void click_DAX()
	{	
		DAX.click();	
	}
	public void click_IB()
	{
		IB.click();
	}
	public ArrayList<String> get_MarketName()
	{
		names=new ArrayList<String>();
		names.add(DJI.getText());
		names.add(DAX.getText());
		names.add(SENSEX.getText());
		names.add(UKX.getText());
		names.add(IB.getText());
		return names;
	}
	public ArrayList<String> get_MarketValues()
	{
		values=new ArrayList<String>();
		values.add(DJI_VALUE.getText());
		values.add(DAX_VALUE.getText());
		values.add(SENSEX_VALUE.getText());
		values.add(UKX_VALUE.getText());
		values.add(IB_VALUE.getText());
		return values;
	}
	public ArrayList<String> get_MarketPercentage()
	{
		per=new ArrayList<String>();
		per.add(DJI_per.getText());
		per.add(DAX_per.getText());
		per.add(SENSEX_per.getText());
		per.add(UKX_per.getText());
		per.add(IB_per.getText());
		return per;
	}
	
	
}
