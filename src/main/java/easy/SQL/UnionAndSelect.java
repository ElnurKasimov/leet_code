package easy.SQL;
public class UnionAndSelect {

//    TASK - 1965. Employees With Missing Information1667. Fix Names in a Table

//    SOLUTION
//    SELECT e.id FROM Employee e LEFT JOIN Salaries s ON e.id=s.id WHERE s.salary IS NULL
//            UNION
//    SELECT s.id FROM Employee e RIGHT JOIN Salaries s ON e.id=s.id WHERE name IS NULL
//    ORDER BY id ASC;

//    LEET CODE SOLUTION
//

// POPULATION
//    CREATE TABLE Salaries (
//            employee_id INTEGER PRIMARY KEY,
//            salary INTEGER
//    );
//
//    INSERT INTO Salaries(employee_id, salary) VALUES
//	(5, 76071),
//            (1, 22517),
//            (4, 63539);
//    INSERT INTO Salaries(employee_id, salary) VALUES
//	(6, 76000);
//    INSERT INTO Employee(id, salary) VALUES
//	(6, 76000);
// ALTER TABLE Salaries RENAME COLUMN employee_id TO id;
}
