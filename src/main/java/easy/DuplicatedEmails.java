package easy;

public class DuplicatedEmails {

 //    TASK  - 196. Delete Duplicate Emails

//    MY SOLUTION - work proper, but MySQL doesn't support it
//    DELETE FROM Person WHERE id NOT IN (SELECT MIN(id) FROM Person GROUP BY email);

//    LEET-CODE SOLUTION -  but PostgreSQL doesn't support it
//    DELETE p2 FROM Person p1 JOIN Person p2 ON p1.Email = p2.Email
//    WHERE p1.id< p2.id;


//    POPULATION

//    CREATE TABLE Person (
//            id INTEGER PRIMARY KEY,
//            email VARCHAR(50)
//	);
//
//    INSERT INTO Person (id, email)	VALUES
//	           (1, 'john@example.com'),
//            (2, 'bob@example.com'),
//            (3, 'john@example.com');

}
