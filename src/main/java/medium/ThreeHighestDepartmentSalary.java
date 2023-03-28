package medium;

public class ThreeHighestDepartmentSalary {
//    TASK - 185. Department Top Three Salaries
//

//    MY SOLUTION - works proper, but MySQL not supports IN & LIMIT
//    SELECT d.name AS Department, e.name AS Employee, salary AS Salary
//    FROM Employee AS e JOIN Department AS d ON d.id = e.departmentId
//    WHERE (salary, departmentId)
//    IN (SELECT DISTINCT salary, departmentId
//            FROM Employee WHERE departmentId = d.id ORDER by salary DESC LIMIT 3)
//    ORDER BY d.name;


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
//	          (2,'Sales');
//
//    INSERT INTO Employee (id, name, salary, departmentId)
//    VALUES
//            (1,'Joe',85000,1),
//	          (2,'Henry',80000,2),
//            (3,'Sam',60000,2),
//            (4,'Max',90000,1),
//            (5,'Janet',69000,1),
//            (6,'Randy',85000,1),
//            (7,'Will',70000,1);

}
