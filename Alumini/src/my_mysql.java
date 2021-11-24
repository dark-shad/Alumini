import java.sql.*;
public class my_mysql {

public  String[][] my_db_select() {
String[][] data = new String[10][7]; 
	
try{  
	//Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumini","root","Okay@2020");  
	Statement st=con.createStatement();  
	
  ResultSet rs=st.executeQuery("SELECT * FROM student LIMIT 0,10"); 

	int i=0;
	while(rs.next())  {
	 for(int j=0;j<7;j++) {
	 
	 data[i][j]=rs.getString(j+1);
	 }
	 
	 i=i+1;
	}

     con.close();  
}catch(Exception e){ System.out.println(e);} 

return data;
	}
}