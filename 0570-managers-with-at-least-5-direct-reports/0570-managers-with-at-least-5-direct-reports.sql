# Write your MySQL query statement below
select m.name 
from Employee as e
join Employee as m
on m.id=e.managerId
group by m.id,m.name
having count(*) >=5