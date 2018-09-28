CREATE DATABASE db4thtest;
USE db4thtest;
-- desc db4thtest(); -- syntax wrong
-- select * from db4thtest;-- Table 'db4thtest.db4thtest' doesn't exist
SHOW TABLES;
SELECT DATABASE();
/*创建部门表*/ 
CREATE TABLE dept( 
deptno INT PRIMARY KEY, 
dname VARCHAR(50), 
loc VARCHAR(50) 
);

/*创建雇员表*/ 
CREATE TABLE emp( 
empno INT PRIMARY KEY, 
ename VARCHAR(50), 
job VARCHAR(50), 
mgr INT, 
hiredate DATE, 
sal DECIMAL(7,2), 
COMM DECIMAL(7,2), 
deptno INT, 
CONSTRAINT fk_emp FOREIGN KEY(mgr) REFERENCES emp(empno) 
);
/*添加数据*/
INSERT INTO dept VALUES (10,'ACCOUNTING','NEWTORK');
INSERT INTO dept VALUES (20,'RESEARCH','DALLAS');
INSERT INTO dept VALUES (30,'SALES','CHICAGO');  
INSERT INTO dept VALUES (40,'OPERATIONS','BOSTON');  

ALTER TABLE emp DROP FOREIGN KEY fk_emp;
# Cannot add or update a child row: a foreign key constraint fails
INSERT INTO EMP VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20);  
INSERT INTO EMP VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30);  
INSERT INTO EMP VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30);  
INSERT INTO EMP VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20);  
INSERT INTO EMP VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30);  
INSERT INTO EMP VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30);  
INSERT INTO EMP VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10);  
INSERT INTO EMP VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19', 3000, NULL, 20);  
INSERT INTO EMP VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10);  
INSERT INTO EMP VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30);  
INSERT INTO EMP VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23', 1100, NULL, 20);  
INSERT INTO EMP VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30);  
INSERT INTO EMP VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20);  
INSERT INTO EMP VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);

/* 1．列出最少有4个员工的所有部门信息。*/
-- 表: 部门表, 员工表, 员工人数大于4
-- 条件: count(id) > 4 group by dname
SELECT t1.*,
	t2.部门人数 
FROM 
	dept t1,
(SELECT deptno, COUNT(empno) 部门人数 FROM emp GROUP BY deptno HAVING COUNT(empno) > 4/*; 有';'符号就报错!!*/) t2
WHERE
t1.`deptno` = t2.deptno;
# where t1.`deptno` = t2.deptno and t2.count(*) > 4;
# where count(empno) > 4; Invalid use of group function
# where dept.`deptno` = emp.deptno; Unknown column 'dept.deptno' in 'where clause'

-- Answer: 
SELECT * FROM dept WHERE deptno IN (SELECT deptno FROM emp GROUP BY deptno HAVING COUNT(*) >=4 ) ;

/* 2. 列出薪金比“SMITH”多的所有员工。*/
-- 要什么: 员工信息
-- 什么表查: emp
-- 字段:sal
-- 条件: sal > (select sal from emp where ename = "SMITH")
SELECT * 
FROM
  emp 
WHERE sal > 
  (SELECT 
    sal 
  FROM
    emp 
  WHERE ename = "SMITH") 
ORDER BY sal DESC ;

/* ****3. 列出所有员工的姓名及其直接上级的姓名。
# 自关联查询, 最基础的!
*/
-- 要:员工姓名, 上级姓名
-- 表:emp, 
-- 核心字段: empno, mgr
-- 条件: empno = mgr
SELECT 
	t1.`ename` 员工,
	t2.`ename` 上级
FROM 
	emp t1
LEFT JOIN
	emp t2
ON 
	t1.`mgr` = t2.`empno`;

/* 4. 列出受雇日期早于其直接上级的所有员工。*/
-- 要什么: 员工信息
-- 表: emp
-- 字段: hiredate 
-- 条件: t1.hiredate > t2.hiredate
-- 多行单列: select * from t1 where hiredate > (select hiredate from t2 )
SELECT 
	t1.`ename`,
	t1.`hiredate` 员工受雇日期,
	t2.`ename`,
	t2.`hiredate` 上级受雇日期
FROM 
	emp t1
LEFT JOIN
	emp t2
ON
	t1.`mgr` = t2.`empno`
HAVING	
	员工受雇日期 < 上级受雇日期;
	
# where 员工受雇日期 > 上级受雇日期; --> Unknown column '员工受雇日期' in 'where clause'
# t1.`hiredate` > (select hiredate from t2);SELECT hiredate FROM t2 --> t1.hiredate > t2.hiredate --> Table 'db4thtest.t2' doesn't exist
-- ASWERE:
SELECT 
  employee.* 
FROM
  emp AS employee,
  emp AS leader 
WHERE employee.mgr = leader.empno 
  AND employee.hiredate < leader.hiredate ;

/* 5．列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门。*/
-- 要什么: 部门名称, 对应的员工信息, 没有员工的部门.
-- 表: dept emp
-- 条件: deptno = deptno
SELECT 
	t1.`dname`,
	t2.`ename`
FROM
	dept t1
LEFT JOIN	
	emp t2
ON 
	t1.`deptno` = t2.`deptno`;
	
/* 6．列出所有“CLERK”（办事员）job = clerk 的姓名及其部门名称。*/
-- yao:姓名及其部门名称
-- condition: job = clerk
SELECT 
	t1.`ename`,
	t2.`dname`
FROM 
	emp t1,
	dept t2
WHERE 
	t1.job = 'clerk';
-- Answer:
SELECT 
  emp.ename,
  dept.dname 
FROM
  dept,
  emp 
WHERE dept.deptno = emp.deptno 
  AND job = 'clerk' ;
  
/* 7. 列出最低薪金大于1500的各种工作(job)*/
-- want: job
-- table: emp
-- field : min(sal),
-- condition: min(sal)> 1500 --> 求出各个工作的最低薪资, 
# SELECT emp.`job`,sal FROM emp WHERE min(sal) > 1500 GROUP BY emp.`job`.
# where 后不接组合函数.
-- Answer:
SELECT 
	job,
	sal
FROM 
	emp
GROUP BY 
	job
HAVING
	MIN(sal) > 1500;
/* 8．列出在部门“SALES”（销售部）工作的员工的姓名，*/
-- want: ename
-- table: emp, dept
-- field/condition: dname = sales --> 获取deptno
SELECT 
	t2.`dname`,
	t1.`ename`
FROM 
	emp t1,
	dept t2
WHERE 
	t1.`deptno` = t2.deptno
AND	
	t2.dname = 'SALES';
-- Answer:
SELECT 
  ename 
FROM
  emp 
WHERE deptno = 
  (SELECT 
    deptno 
  FROM
    dept 
  WHERE dname = 'SALES') ; -- > 获取到deptno

/* 9．列出薪金高于公司平均薪金的所有员工。*/
-- w: 员工
-- t: emp
-- f: avg(sal)
-- c: sal > avg(sal)
SELECT 
	t1.ename
FROM 
	emp t1
WHERE
	t1.sal > (SELECT AVG(sal) FROM emp);
-- A:
SELECT ename FROM emp WHERE sal>(SELECT AVG(sal) FROM emp);
/* 10．列出与“SCOTT”从事相同工作的所有员工。*/
SELECT 
	t1.ename
FROM 
	emp t1
WHERE 
	t1.job = (SELECT job FROM emp WHERE ename = 'SCOTT');
-- A:
SELECT * FROM emp WHERE job =(SELECT job FROM emp WHERE ename='SCOTT');
/* 11. 列出薪金等于部门30中员工的薪金的所有员工的姓名和薪金。*/
-- f: 部门30中员工的薪金
-- c: 薪金等于部门30中员工的薪金
SELECT 
	emp.`ename`,
	emp.`sal`
FROM 	emp
WHERE
	sal 
IN
	(SELECT sal FROM emp WHERE emp.`deptno` = 30);
-- A: 
SELECT ename,sal FROM emp WHERE sal IN(SELECT sal FROM emp WHERE deptno=30);
/* 13. 列出在每个部门工作的员工数量、平均工资。*/
-- count(empno),avg(sal)
SELECT   
	t1.avg(sal),
	t2.员工人数
FROM 
	emp t1,
	(SELECT deptno,COUNT(empno) 员工人数 FROM emp t1 GROUP BY deptno) t2
	dept t3
GROUP BY 
	(SELECT dname FROM dept)
HAVING t1.`deptno` = t3.depto;
# DML 的终极完整格式顺序?? 
-- A:
SELECT 
  COUNT(*),
  AVG(sal)
 # (select dname from dept t1, emp t2 where t1.deptno = t2.deptno)
  # 我的需求: 添加部门名称.
  
FROM
  emp 
GROUP BY deptno,(SELECT dname FROM dept);

/* 14．列出所有员工的姓名、部门名称和工资。*/
SELECT 
	t2.`dname`,
	t1.`ename`,
	t1.`sal`
FROM 
	emp t1,
	dept t2
WHERE 
	t1.`deptno` = t2.`deptno`;
/* 15．列出所有部门的详细信息和部门人数。*/

SELECT 
  t2.*,
  COUNT(*) 
# Subquery returns more than 1 row
#(select count(deptno)from emp t1group by deptno)
# t1.count(deptno)
# Column 'deptno' in field list is ambiguous
FROM
  emp t1,
  dept t2 
  /*group by 
	t2.`dname`
having
	t1.`deptno` = t2.`deptno`*/
  
WHERE t1.`deptno` = t2.`deptno` 
GROUP BY t2.`dname` ;
# group by count(t1.`deptno`); 错误代码： 1111	Invalid use of group function
-- A:
SELECT dept.*,COUNT(*) FROM dept,emp WHERE dept.deptno=emp.deptno GROUP BY deptno;
/* 16．列出各种工作的最低工资。*/
-- W:sal
-- t: emp
-- f: min(sal)
SELECT 
	job,
	MIN(sal)
FROM 
	emp
GROUP BY
	emp.`job`
-- A:
	SELECT job,MIN(sal) FROM emp GROUP BY job ;
/* 17．列出各个部门的MANAGER（经理）的最低薪金。 */
-- w: min(sal)
-- t: emp,dept
-- f: dname, emp.mgr.ename, min(sal)
 # 求成了每个领导的最低薪水
SELECT 
	t3.`dname`,
	t2.`ename`,
	MIN(t2.sal)
FROM 
	emp t1,
	emp t2,
	dept t3
WHERE 
	t1.`mgr` = t2.`empno`
AND 	
	t1.`deptno` = t3.`deptno`
GROUP BY 
	t3.`dname`;
-- A:
SELECT MIN(sal),emp.`ename` FROM emp WHERE job='MANAGER' GROUP BY deptno; 

/* 18．列出所有员工的年工资,按年薪从低到高排序。*/
-- 年工资