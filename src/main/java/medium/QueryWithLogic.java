package medium;

public class QueryWithLogic {

//    TASK - 176. Second Highest Salary

//    SOLUTION 1 - not correct. Doesn't work proper if the highest salary occurs more than 1 time
//    SELECT salary AS SecondHighestSalary FROM employee ORDER BY salary DESC OFFSET 1 ROWS LIMIT 1;

//    SOLUTION 2 - not correct. Doesn't return 'NULL' if there is no records in result set
//    SELECT salary AS SecondHighestSalary FROM employee where salary < (SELECT MAX(salary) FROM employee)
//    ORDER BY salary DESC LIMIT 1;

//    SOLUTION 3 - correct.
//    SELECT (SELECT salary FROM employee where salary < (SELECT MAX(salary) FROM employee)
//    ORDER BY salary DESC LIMIT 1) AS SecondHighestSalary;

//    SOLUTION 4 - correct. Uses CASE-WHEN-THEN-ELSE-END syntax
//    SELECT CASE
//          WHEN COUNT(*)=0 THEN NULL
//          ELSE (SELECT salary FROM employee where salary < (SELECT MAX(salary) FROM employee)
//               ORDER BY salary DESC LIMIT 1)
//          END
//    AS SecondHighestSalary;


//    POPULATION
//    CREATE TABLE Employee (
//            id INTEGER PRIMARY KEY,
//            name VARCHAR(50),
//            salary INTEGER,
//            departmentId INTEGER,
//    FOREIGN KEY (departmentId) REFERENCES Department (id)
//            );
//
//    INSERT INTO Department (id, name)
//    VALUES
//            (1,'IT'),
//	           (2,'Sales');
//
//    INSERT INTO Employee (id, name, salary, departmentid)
//    VALUES
//            (1,'Joe',70000,1),
//	           (2,'Jim',90000,1),
//            (3,'Henry',80000,2),
//            (4,'Sam',60000,2),
//            (5,'Max',90000,1);


}
