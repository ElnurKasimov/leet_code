package medium;

public class HighestDepartmentSalary {

//    TASK - 184. Department Highest Salary
//
//    TEMPORARY SOLUTION
//    SELECT d.name Department, max(e.salary) Salary
//    FROM Employee e LEFT JOIN Department d ON d.id = e.departmentid
//    GROUP BY d.id;
//
//    WRONG SOLUTION
//    SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
//    FROM Employee AS e LEFT JOIN Department AS d ON d.id = e.departmentid
//    WHERE e.salary IN (select max(salary) from employee group BY departmentId);


//    POPULATION
//    CREATE TABLE Department(
//            id INTEGER PRIMARY KEY,
//            name VARCHAR (50)
//);
//
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