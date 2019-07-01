package pomClasses;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtilities.Constant_var;

public class DJI_Index 
{
	@FindBy(xpath="//div[@class='QhLvnd r-iYhOnPVOIkaw']//child::table/tbody")
	WebElement DJI_open_High_Tabel;
	@FindBy(xpath="//div[@class='QhLvnd r-iYhOnPVOIkaw']//following::table/tbody/tr/td[2]")
	WebElement DJI_Low;
	public String Dji_low=DJI_Low.getText();
	public ArrayList<String> DJI_INDEX;
	public DJI_Index() 
	{
		PageFactory.initElements(Constant_var.driver,this);
	}
	public void Reading_table()
	{
	for(int i=1;i<=2;i++) 
	{
        DJI_INDEX=new ArrayList<String>();		
		DJI_INDEX.add(DJI_open_High_Tabel.findElement(By.xpath("//tr[i]/td[2]")).getText());
	
	}	
	}
	
	
		
	
}
