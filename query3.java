package paper_review_U01673051;

import java.sql.*;

public class query3 {
	
	public static void main(String [] args) {
		Connection myConn = null;
		Statement myStmt = null;
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper_reviews", "root", "Root@123");
			
			myStmt = myConn.createStatement();
			
			String sql = "SELECT count(abstract) as no_of_papers\r\n" +
			"FROM paper \r\n" +
					"WHERE Abstract = 'Yes'"; //Where Abstract value is 'Yes' will be considered as received papers
		
			ResultSet myRs = myStmt.executeQuery(sql);
			
			while (myRs.next()) {
				System.out.println("Number of papers received = " + myRs.getString("no_of_papers"));
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
