package paper_review_U01673051;

import java.sql.*;

public class query1 {
	
	public static void main(String [] args) {
		Connection myConn = null;
		Statement myStmt = null;
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper_reviews", "root", "Root@123");
			
			myStmt = myConn.createStatement();
			
			String sql = "SELECT paper.id, paper.Title, paper.Abstract, author.Email_Address, author.First_name, author.Last_name\r\n" +
					"from author join paper\r\n" +
					"on Author_id = Contact_Author\r\n" +
					"order by author.Email_Address";
			
			ResultSet myRs = myStmt.executeQuery(sql);
		
			while(myRs.next()) {
				System.out.println(myRs.getString("paper.id") + " | " + myRs.getString("paper.Title") + " | " + myRs.getString("paper.Abstract") + " | " + myRs.getString("author.Email_Address") + " | " + myRs.getString("author.First_name") + " | " + myRs.getString("author.Last_name"));
			}
			myRs.close();
		
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