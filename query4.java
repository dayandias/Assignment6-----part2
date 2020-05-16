package paper_review_U01673051;

import java.sql.*;

public class query4 {
	
	public static void main(String [] args) {
		Connection myConn = null;
		Statement myStmt = null;
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper_reviews", "root", "Root@123");
			
			myStmt = myConn.createStatement();
			
			String sql1 = "insert into author(Email_Address, First_name, Last_name) values ('eminem1@music.com', 'Emi', 'Baptis')";
			
			myStmt.execute(sql1);
			
			String sql2 = "insert into paper(Title, Abstract, File_name, Contact_Author) values ('Simple Algo', 'Yes', 'Computer Science', 7)";
		
			myStmt.execute(sql2);
			
			System.out.println("Entries added successfully");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		finally {
			try {
				if(myStmt != null)
					myConn.close();
			}
			catch(SQLException se) {
			}
			try {
				if(myConn != null)
					myConn.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
		}
	
	}
		
}
