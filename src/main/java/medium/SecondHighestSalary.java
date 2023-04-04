package medium;

public class SecondHighestSalary {
//    MY SOLUTION
//    SELECT salary AS SecondHighestSalary FROM employee ORDER BY salary DESC OFFSET 1 ROWS LIMIT 1;

//    SELECT salary AS SecondHighestSalary FROM employee where salary < (SELECT MAX(salary) FROM employee)
//    ORDER BY salary DESC LIMIT 1;

//    LEET CODE SOLUTION

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
