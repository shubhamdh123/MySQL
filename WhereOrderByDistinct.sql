use Practice;

SELECT * FROM Employee order by EmpID DESC; --Order

select EmpName, EmpCity from Employee where EmpID=1;  --where

SELECT EmpCity, EmpName   --Distinct
FROM Employee e
WHERE EmpName = (
    SELECT TOP 1 EmpName
    FROM Employee
    WHERE EmpCity = e.EmpCity
    ORDER BY EmpName
);

Select Distinct EmpCity from Employee ;--DIstinct