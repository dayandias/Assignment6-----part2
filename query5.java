package paper_review_U01673051;

import java.sql.*;

public class query5 {
	
	public static void main(String [] args) {
		Connection myConn = null;
		Statement myStmt = null;
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper_reviews", "root", "Root@123");
		
			myStmt = myConn.createStatement();
			
			String sql = "delete from author where Author_id = 1";
			
			myStmt.executeUpdate(sql);
			
			System.out.println("Entry has been deleted successfully");
				
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
//Error message
//Cannot delete or update a parent row: a foreign key constraint fails (`paper_reviews`.`paper`, CONSTRAINT `paper_ibfk_1` FOREIGN KEY (`Contact_Author`) REFERENCES `author` (`Author_id`))
