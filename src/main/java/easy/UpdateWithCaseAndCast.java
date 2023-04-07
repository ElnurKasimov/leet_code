package easy;

public class UpdateWithCaseAndCast {

//    TASK - 627. Swap Salary

//    SOLUTION 1
//    UPDATE Employee  SET  sex =  CAST (CASE sex WHEN 'm' THEN 'f' ELSE 'm' END AS sex);

//    LEET CODE SOLUTION - doesn't work in PostgreSQL
//    UPDATE salary SET sex = CASE sex
//                              WHEN 'm' THEN 'f'
//                              ELSE 'm'
//                            END;

//    POPULATION (added UNUM and altered table)
//    CREATE TYPE sex AS ENUM ('m', 'f');
//    ALTER TABLE Employee add column sex sex;
//    UPDATE Employee SET SEX = 'm' WHERE id=1;
//    UPDATE Employee SET SEX = 'm' WHERE id=2;
//    UPDATE Employee SET SEX = 'm' WHERE id=3;
//    UPDATE Employee SET SEX = 'f' WHERE id=4;
//    UPDATE Employee SET SEX = 'm' WHERE id=5;

}
