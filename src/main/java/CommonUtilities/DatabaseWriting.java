package CommonUtilities;
import java.sql.*;

import pomClasses.DJI_Index;
import pomClasses.MarketSummary;

public class DatabaseWriting 
{
	MarketSummary obj;
	DJI_Index dji_obj;
    public void database_writing() throws ClassNotFoundException, SQLException
    {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdata","root","root");
    String query="insert into market (name,values,per)"+" values (?, ?, ?)";
    for(int i=1;i<5;i++)
    {
    PreparedStatement p=con.prepareStatement(query);
	p.setString(1,obj.names.get(i));
    p.setString(2, obj.values.get(i));
    p.setString(3,obj.per.get(i));
    p.execute();
    }
    con.close();
    }
    
    public void alterTable() throws ClassNotFoundException, SQLException 
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdata","root","root");
    	String query="ALTER TABLE market ADD high VARCHAR(50),ADD low VARCHAR(50),ADD open VARCHAR(40)";
    	PreparedStatement p=con.prepareStatement(query);
    	p.setString(4,dji_obj.DJI_INDEX.get(0));
        p.setString(5,dji_obj.DJI_INDEX.get(1));
        p.setString(6,dji_obj.Dji_low);
        p.execute();
        con.close();
    }
}
