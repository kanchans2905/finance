package BaseClass;

//import Common_Variables.Propertyfileutilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.MarketSummary;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonUtilities.Constant_var;
import CommonUtilities.DatabaseWriting;

public class TestBase {

	public static void init()
	{
		WebDriverManager.chromedriver().setup();
        Constant_var.driver=new ChromeDriver();
        String url=CommonUtilities.Propertyfileutilities.readPropertyFile(Constant_var.path,"URL");
        Constant_var.driver.get(url);
        Constant_var.driver.manage().deleteAllCookies();
        Constant_var.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);       
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		TestBase.init();
		MarketSummary m=new MarketSummary();
		DatabaseWriting d=new DatabaseWriting();
		d.database_writing();
		m.click_DJI();
		d.alterTable();
		
	}

}
