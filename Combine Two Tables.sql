# Write your MySQL query statement below
SELECT p.FirstName, p.LastName, a.City, a.State FROM Person as p
LEFT JOIN Address AS a ON p.PersonId = a.PersonId;
