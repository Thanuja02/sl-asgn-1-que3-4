import java.sql.*;
import java.lang.*;
public class StudentDetails {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root","Thanuja@123");
			st=con.createStatement();
			rs=st.executeQuery("select * from students");
			while(rs.next())
			{
				//System.out.println(rs.getInt(1));
				//System.out.println(rs.getInt(1)+" "+rs.getString(2));
				System.out.println(rs.getString(1));
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			//System.out.println(e);
	
			e.printStackTrace();
		}
		
	}
