/**

Given a table STATION that holds data for five fields namely
ID, CITY, STATE, NORTHERN LATITUDE and WESTERN LONGITUDE.

+-------------+------------+
| Field       |   Type     |
+-------------+------------+
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |
+-------------+------------+
*/

-- 1 Write a query to print the list of CITY in lexicographical order
-- for even ID only. Do not print duplicates.
select distinct CITY from STATION
where mod(ID, 2) = 0
order by CITY;

-- 2 Let NUM be no. of cities and NUM_unique be no. of unique cities,
-- then write a query to print the value of NUM - NUM_unique.
select count(CITY) - count(distinct CITY)
from STATION;

/* 3
 * Let |city| be the length of the city, write a query to print two lines:
 * 1. First line is city1 and |city1| separated by space, where |city1| is the possible minimum value.
 * 2. Second line is city2 and |city2| separated by space, where |city2|  is the possible maximum value.
 * If there are more than one possible cities print the lexicographical smallest.
 */
select * from (
    select CITY || ' ' || length(CITY)
    from STATION
    where length(CITY) = (select min(length(CITY)) from STATION)
    order by CITY asc
) where rownum <= 1
union all
select * from (
    select CITY || ' ' || length(CITY)
    from STATION
    where length(CITY) = (select max(length(CITY)) from STATION)
    order by CITY asc
) where rownum <= 1;

-- 4 Write a query to print the list of CITY that start with vowels in lexicographical order.
-- Do not print duplicates.
select distinct CITY
from STATION
where regexp_like(CITY, '^[aeiou]', 'i')
order by CITY asc;

-- or

select distinct CITY
from STATION
where substr(lower(CITY), 0, 1) in ('a', 'e', 'i', 'o', 'u')
order by CITY asc;

-- 5 Write a query to print the list of CITY that ends at vowels in lexicographical order.
-- Do not print duplicates.
select distinct CITY
from STATION
where regexp_like(CITY, '[aeiou]$', 'i')
order by CITY asc;

-- or

select distinct CITY
from STATION
where substr(lower(CITY), -1, 1) in ('a', 'e', 'i', 'o', 'u')
order by CITY asc;

-- 6 Write a query to print the list of CITY that starts with vowels and ends at vowels
-- in lexicographical order. Do not print duplicates.
select distinct CITY
from STATION
where substr(lower(CITY), 0, 1) in ('a', 'e', 'i', 'o', 'u')
  and substr(lower(CITY), -1, 1) in ('a', 'e', 'i', 'o', 'u')
order by CITY asc;

-- 7 Write a query to print the sum of LAT_N and the sum of
-- LONG_W separated by space, up to 2 decimal places
select round(sum(LAT_N), 2) || ' ' || round(sum(LONG_W), 2)
from STATION;

-- 8 Write a query to find the sum of the Northern Latitudes having values
-- greater than 38.7880 and less than 137.2345 up to 4 decimal places.
select round(sum(LAT_N), 4)
from STATION
where LAT_N > 38.7880 and LAT_N < 137.2345;

-- 9. Write a query to find the greatest value of the Northern Latitudes
-- less than 137.2345 up to 4 decimal places.
