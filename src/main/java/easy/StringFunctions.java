package easy;
public class StringFunctions {

//    TASK - 1667. Fix Names in a Table

//    SOLUTION 1 - doesn't work in MySQL (there is no INITCAP function)
//      UPDATE users set name = INITCAP(name);

//    LEET CODE SOLUTION
//    SELECT id, CONCAT(UPPER(LEFT(name,1)), LOWER(SUBSTR(name,2))) as name
//          FROM employee
//          ORDER BY id;

}
