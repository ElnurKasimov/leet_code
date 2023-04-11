package medium;
public class TreeNode {

//    TASK - 608. Tree Node

//    SOLUTION
//  SELECT id, 'root' AS type FROM Tree WHERE p_id IS NULL
//  UNION
//  SELECT id, 'inner' AS type FROM Tree WHERE id IN (SELECT p_id FROM Tree) AND p_id IS NOT NULL
//  UNION
//  SELECT id, 'leaf' AS type FROM Tree WHERE id NOT IN (SELECT p_id FROM Tree WHERE p_id IS NOT NULL)  AND p_id IS NOT NULL;

//    LEET CODE SOLUTION
//


//       POPULATION
//      CREATE TABLE Tree (
//	        id INTEGER PRIMARY KEY,
//	        p_id INTEGER
//      );
//
//      INSERT INTO Tree(id, p_id) VALUES
//      	(1, null), (2,1), (3,1), (4,2), (5,2), (6,5), (7,5), (8,5);


}
