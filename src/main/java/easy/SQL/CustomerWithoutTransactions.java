package easy.SQL;
public class CustomerWithoutTransactions {

//    TASK - 1581. Customer Who Visited but Did Not Make Any Transactions

//    SOLUTION
//  SELECT customer_id,COUNT(customer_id) as count_no_trans FROM
//            (SELECT v.customer_id FROM Visits V LEFT JOIN Transactions T ON V.visit_id = T.visit_id WHERE T.transaction_id IS NULL)
//    AS temp GROUP BY customer_id;

    //    MORE  PRETTY SOLUTION
//    select customer_id, count(visit_id) as count_no_trans
//    from visits where visit_id not in (select visit_id from transactions)
//    group by customer_id;



//       POPULATION
//CREATE TABLE Visits (
//            visit_id INTEGER PRIMARY KEY,
//            customer_id INTEGER);
//    CREATE TABLE Transactions (
//            transactions_id INTEGER PRIMARY KEY,
//            visit_id INTEGER,
//            amount INTEGER);
//    INSERT INTO Visits(visit_id, customer_id) VALUES
//	(1,23),(2,9),(4,30),(5,54),(6,96),(7,54),(8,54);
//    INSERT INTO Transactions (transaction_id,visit_id,amount) VALUES
//	(2,5,310),(3,5,300),(9,5,200),(12,1,910),(13,2,970);
//    ALTER TABLE Transactions RENAME transactions_id TO transaction_id;


}
