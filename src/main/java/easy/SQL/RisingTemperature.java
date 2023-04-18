package easy.SQL;

public class RisingTemperature {

 //    TASK  - 197. Rising Temperature

//    MY SOLUTION - does't work in MySQL
//  SELECT w.id FROM Weather JOIN Weather AS w ON Weather.recordDate = w.recordDate - INTEGER '1'
//   WHERE Weather.temperature < w.temperature;

//    LEET-CODE SOLUTION
//    SELECT
//    weather.id AS 'Id'
//    FROM
//            weather
//    JOIN
//    weather w ON DATEDIFF(weather.recordDate, w.recordDate) = 1
//    AND weather.Temperature > w.Temperature
//    ;


//    POPULATION

//    CREATE TABLE Weather (
//            id INTEGER PRIMARY KEY,
//            recordDate DATE,
//            temperature INTEGER);
//    INSERT INTO Weather (id,recordDate,temperature) VALUES
//	           (1, '2015-01-01', 10),
//            (2,'2015-01-02',25),
//            (3,'2015-01-03', 20),
//            (4,'2015-01-04',30);

}
