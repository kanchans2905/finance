package CommonUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import CommonUtilities.Constant_var;

public class Propertyfileutilities 
{
	public static Properties prop=new Properties();
	public static String readPropertyFile(String path,String Key) 
	{
		String value="";
		try
		{
		Constant_var.fis=new FileInputStream(path);
		prop.load(Constant_var.fis);
		value=prop.getProperty(Key);
		}
		catch(IOException e)
		{
			System.out.println("UNABLE TO READ FILE");
			e.printStackTrace();
		}	
       return value;
}
}