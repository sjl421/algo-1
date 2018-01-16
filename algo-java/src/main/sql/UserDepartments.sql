/*

There are 3 tables: User, Department and UserDepartments

+------------------------+
| User                   |
+-------------+----------+
| user_id     | int      |
| first_name  | char(50) |
| last_name   | char(50) |
+-------------+----------+

+------------------------+
| Department             |
+-------------+----------+
| dep_id      | int      |
| name        | char(50) |
+-------------+----------+

+------------------------+
| UserDepartments        |
+-------------+----------+
| user_id     | int      |
| dep_id      | int      |
+-------------+----------+

*/

-- Test data:

insert into User values
  (1, 'Mark Snow'),
  (2, 'John Rain'),
  (3, 'Cristian Woods'),
  (4, 'Jimmy Chin'),
  (5, 'Kate Petrova'),
  (6, 'Tanya Ivanova');

insert into Department values
  (1, 'IT'),
  (2, 'Accounting'),
  (3, 'Travel'),
  (4, 'Compliance');

insert into UserDepartments values
  (1, 1),
  (2, 1),
  (2, 2),
  (3, 2),
  (3, 4),
  (4, 1),
  (4, 3),
  (5, 2),
  (6, 2),
  (6, 4);

/*
  Task: to query all users that does not work in 'Compliance' department
  but work in at least in two departments.
*/

select u.user_id, count(ud.dep_id)
from User	u left join UserDepartments ud on u.user_id = ud.user_id
where not exists (
	select 1 from UserDepartments ud, Department d
	where ud.dep_id = d.dep_id and d.name = 'Compliance' and ud.user_id = u.user_id)
group by u.user_id
having count(ud.dep_id) > 1
;