# Assignment6-----part2
This repository contains SQL scripts used to implement and populate the assignment6/part2 queries. 
Google drive link to ScreenCast is https://drive.google.com/open?id=1OXXQqESh2sd0QLSV61JyO1BAUgZ0zfd-
Important: I have made a small adjustment to the 'query2.java' code after I recorded the ScreenCast. The changes which I made were
      "SELECT * FROM reviews where Recommendation like 'recommend%'"; 
      And a spelling mistake at 'Readability'
These changes are reflected in the .java file. 

For query5,the error message as follows; 
    Cannot delete or update a parent row: a foreign key constraint fails (`paper_reviews`.`paper`, CONSTRAINT `paper_ibfk_1` FOREIGN KEY       (`Contact_Author`) REFERENCES `author` (`Author_id`))
    This is due to the fact that the 'Author_id' is used as the FK in paper('Contact_Author').Therefore deleting this particular entry will have a effect on the paper realtion as well. Hence, it stops from someone deleting the entry. 
