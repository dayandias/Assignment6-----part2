package paper_review_U01673051;

import java.sql.*;

public class query2 {
	
	public static void main(String [] args) {
		Connection myConn = null;
		Statement myStmt = null;
		
		try {
			
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper_reviews", "root", "Root@123");
		
			myStmt = myConn.createStatement();
			
			String sql = "SELECT * FROM reviews where Recommendation like 'recommend%'";
			
			ResultSet myRs = myStmt.executeQuery(sql);
			
			while(myRs.next()) {
				System.out.println(myRs.getString("Paper_id") + " | " + myRs.getString("Reviewer_id") + " | " + myRs.getString("Merit_Score") + " | " + myRs.getString("Readability_Score") + " | " + myRs.getString("Originality_Score") + " | " + myRs.getString("Relevance_Score") + " | " + myRs.getString("Recommendation"));
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