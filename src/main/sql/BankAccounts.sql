/**

There are two tables:

+-------------+----------+
| Debit                  |
+-------------+----------+
| accountId   | int(11)  |
| amount      | numeric  |
+-------------+----------+

+-------------+----------+
| Credit                 |
+-------------+----------+
| accountId   | int(11)  |
| amount      | numeric  |
+-------------+----------+

Calculate accounts balance: (accountId, balance)

where balance is difference between Debit amount and Credit amount.

 */

select t.id, sum(t.amount) from (
	select id, amount from debit
	union all
	select id, -amount from credit
) t
group by t.id
order by t.id
;

