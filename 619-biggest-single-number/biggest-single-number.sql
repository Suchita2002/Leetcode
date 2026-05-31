# Write your MySQL query statement below

Select MAX(num) as num
from(
    Select num From MyNumbers
    Group By num
    having COUNT(num) = 1
)t;