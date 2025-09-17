CREATE DATABASE Practice; 

USE Practice;

CREATE TABLE Employee
( EmpID Int PRIMARY KEY,
EmpName VARCHAR(30),
EmpDepartment VARCHAR(30),
EmpCity VARCHAR(30)
);
INSERT INTO Employee VALUES(1,'Shubham','Engineering','Yavatmal'),(2,'Nikita','Engineering','Nagpur'),(3,'Shrinay','Management','Palam'),(4,'Pranali','Quality','Palam'),(5,'Amit','Support','Palam'),(6,'Jyoti','HR','Yavatmal'),(7,'Arun','Admin','Yavatmal'),(8,'Adesh','Marketing','Dhamna'),(9,'Gopal','IS','Naigaon');

SELECT * FROM Employee;

CREATE TABLE Employee_Salary(EmpID int,
Emp_Salary int,
 FOREIGN KEY(EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Employee_Salary VALUES(1,2000000),(2,150000),(3,1000000);
SELECT * FROM Employee_Salary;

SELECT Employee.EmpID, Employee.EmpName,Employee_Salary.Emp_Salary
FROM Employee
INNER JOIN Employee_Salary ON Employee.EmpID =Employee_Salary.EmpID