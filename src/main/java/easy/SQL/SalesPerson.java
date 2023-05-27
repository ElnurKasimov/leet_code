package easy.SQL;

public class SalesPerson {

 //    TASK  - 607. Sales Person


//    MY SOLUTION
//SELECT name FROM SalesPerson WHERE name NOT IN (SELECT s.name FROM Orders AS o JOIN SalesPerson AS s ON o.sales_id = s.sales_id
//            JOIN Company c ON o.com_id = c.com_id WHERE c.name LIKE 'RED');

//    LEET-CODE SOLUTION


//    POPULATION
//CREATE TABLE SalesPerson (
//            sales_id INTEGER PRIMARY KEY,
//            name VARCHAR (100),
//    salary INTEGER,
//    comission_rate INTEGER,
//    hire_date DATE
//);
//    CREATE TABLE Company (
//            com_id INTEGER PRIMARY KEY,
//            name VARCHAR(100),
//    city VARCHAR (100)
//);
//CREATE TABLE Orders (
//            order_id INTEGER PRIMARY KEY,
//            order_date DATE,
//            com_id INTEGER,
//            sales_id INTEGER,
//            amount INTEGER,
//            FOREIGN KEY (com_id) REFERENCES Company (com_id),
//    FOREIGN KEY (sales_id) REFERENCES SalesPerson (sales_id)
//            );
//    INSERT INTO SalesPerson (sales_id,name,salary,comission_rate,hire_date) VALUES
// (1,'John',100000,6,'4-1-2006'),
//         (2,'Amy',12000,5,'5-1-2010'),
//         (3,'Mark',65000,12,'25-12-2008'),
//         (4,'Pam',25000,25,'1-1-2005'),
//         (5,'Alex',5000,10,'2-3-2007');
//INSERT INTO Company (com_id,name,city) VALUES
//(1,'RED','Boston'),
//        (2,'ORANGE','New York'),
//        (3,'YELLOW','Boston'),
//        (4,'GREEN','Austin');
//    INSERT INTO Orders (order_id,order_date,com_id,sales_id,amount) VALUES
//(1,'1-1-2014',3,4,10000),
//        (2,'2-1-2014',4,5,5000),
//        (3,'3-1-2014',1,1,50000),
//        (4,'4-1-2014',1,4,25000);

}
