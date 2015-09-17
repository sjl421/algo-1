/**

  Average Population

  Given a City table, whose fields are described as:

+-------------+----------+
| Field       | Type     |
+-------------+----------+
| ID          | int(11)  |
| Name        | char(35) |
| CountryCode | char(3)  |
| District    | char(20) |
| Population  | int(11)  |
+-------------+----------+

  1. write a query that will fetch all columns for every row in the table.
*/
select ID, Name, CountryCode, District, Population from City;

/*
 * 2. print all the details of the city with ID is 1661.
 */
select * from City where ID = 1661;

/*
 * 3. You have to print all the details of all the cities of Japan.
 * The CountryCode for Japan is "JPN".
 */
select * from City where CountryCode='JPN';

/*
 * 4. You have to print the average population of all cities,
 * rounded down to the nearest integer.
 */
select round(avg(Population)) from City;

/*
 * 5. Japan Population
 * you have to print the sum of population of all the cities of Japan.
 * The CountryCode for Japan is "JPN".
 */
select sum(Population)
from City
where CountryCode = 'JPN';

/*
 * 6. Population Density Difference
 * Print the difference between the maximum and minimum city populations.
 */
select max(Population) - min(Population)
from City;