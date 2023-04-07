package easy;
public class GroupByDate {

//    TASK - 1667. Fix Names in a Table

//    SOLUTION 1 - doesn't work in MySQL (there is no STRING_AGG function)
//SELECT sell_date, COUNT(product) AS num_sold,
//    STRING_AGG(product,',')
//    FROM Activities
//    GROUP BY sell_date;

//    LEET CODE SOLUTION - MySQL
//  SELECT
//      	     sell_date,
//              (COUNT(sell_date ) ) as num_sold ,
//            	GROUP_CONCAT(distinct product  ORDER BY product) as products
//      FROM
//	            (SELECT DISTINCT sell_date,product FROM Activities) as Activities
//      GROUP BY sell_date;


//       POPULATION
//       CREATE TABLE Activities (
//            sell_date DATE,
//            product VARCHAR(100));
//      INSERT INTO Activities (sell_date, product) VALUES
//        ('2020-05-30', 'Headphone'),
//        ('2020-06-01', 'Pencil'),
//        ('2020-06-02', 'Mask'),
//        ('2020-05-30', 'Basketball'),
//        ('2020-06-01', 'Bible'),
//        ('2020-06-02', 'Mask'),
//        ('2020-05-30', 'T-Shirt');
//      INSERT INTO Activities (sell_date, product) VALUES ('2020-04-01', 'Desk');
}
