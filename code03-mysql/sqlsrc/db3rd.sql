CREATE DATABASE db3rd;
USE db3rd;
-- 部门表
CREATE TABLE dept (
  id INT PRIMARY KEY PRIMARY KEY, -- 部门id
  dname VARCHAR(50), -- 部门名称
  loc VARCHAR(50) -- 部门所在地
);
-- 删除主键
ALTER TABLE dept DROP PRIMARY KEY;
-- 添加主键
ALTER TABLE dept MODIFY id INT PRIMARY KEY;
-- 添加4个部门
INSERT INTO dept(id,dname,loc) VALUES 
(10,'教研部','北京'),
(20,'学工部','上海'),
(30,'销售部','广州'),
(40,'财务部','深圳');

-- 职务表，职务名称，职务描述
CREATE TABLE job (
id INT PRIMARY KEY,
jname VARCHAR(20),
description VARCHAR(50)
);

-- 添加4个职务
INSERT INTO job (id, jname, description) VALUES
(1, '董事长', '管理整个公司，接单'),
(2, '经理', '管理部门员工'),
(3, '销售员', '向客人推销产品'),
(4, '文员', '使用办公软件');

-- 员工表
CREATE TABLE emp (
  id INT PRIMARY KEY, -- 员工id
  ename VARCHAR(50), -- 员工姓名
  job_id INT, -- 职务id
  mgr INT , -- 上级领导
  joindate DATE, -- 入职日期
  salary DECIMAL(7,2), -- 工资
  bonus DECIMAL(7,2), -- 奖金
  dept_id INT, -- 所在部门编号
  -- 绑定外键.
  CONSTRAINT emp_jobid_ref_job_id_fk FOREIGN KEY (job_id) REFERENCES job (id),
  CONSTRAINT emp_deptid_ref_dept_id_fk FOREIGN KEY (dept_id) REFERENCES dept (id)
);

-- 添加员工
INSERT INTO emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id) VALUES 
(1001,'孙悟空',4,1004,'2000-12-17','8000.00',NULL,20),
(1002,'卢俊义',3,1006,'2001-02-20','16000.00','3000.00',30),
(1003,'林冲',3,1006,'2001-02-22','12500.00','5000.00',30),
(1004,'唐僧',2,1009,'2001-04-02','29750.00',NULL,20),
(1005,'李逵',4,1006,'2001-09-28','12500.00','14000.00',30),
(1006,'宋江',2,1009,'2001-05-01','28500.00',NULL,30),
(1007,'刘备',2,1009,'2001-09-01','24500.00',NULL,10),
(1008,'猪八戒',4,1004,'2007-04-19','30000.00',NULL,20),
(1009,'罗贯中',1,NULL,'2001-11-17','50000.00',NULL,10),
(1010,'吴用',3,1006,'2001-09-08','15000.00','0.00',30),
(1011,'沙僧',4,1004,'2007-05-23','11000.00',NULL,20),
(1012,'李逵',4,1006,'2001-12-03','9500.00',NULL,30),
(1013,'小白龙',4,1004,'2001-12-03','30000.00',NULL,20),
(1014,'关羽',4,1007,'2002-01-23','13000.00',NULL,10);

-- 工资等级表
CREATE TABLE salarygrade (
  grade INT PRIMARY KEY,   -- 级别
  losalary INT,  -- 最低工资
  hisalary INT -- 最高工资
);

-- 添加5个工资等级
INSERT INTO salarygrade(grade,losalary,hisalary) VALUES 
(1,7000,12000),
(2,12010,14000),
(3,14010,20000),
(4,20010,30000),
(5,30010,99990);
# 练习
-- 5. 查询出部门编号、部门名称、部门位置、部门人数
/* 分析: 
	1. 确定表: 部门编号、部门名称、部门位置 dept; 部门人数: emp 下 cout(*) group by dept_id
	2. 确定条件: emp.dept_id = dept.id
*/

SELECT 
  t2.`id`,
  t2.`dname`,
  t2.`loc`,
  -- 怎么表示部门人数. --> 对子查询语句自定义名称,调用里面的值.
FROM
  (SELECT 
    dept_id 部门编号,
    COUNT(id) AS 部门人数 
  FROM
    emp 
  GROUP BY dept_id),
  dept t2 
WHERE t1.`dept_id` = t2.`id` ;

-- 正确完整写法

SELECT 
  t2.`id`,
  t2.`dname`,
  t2.`loc`,
  t1.部门人数 -- 等价于t1.count(id) 但直接写是错误的.-- 错误代码： 1630
  #-- 怎么表示部门人数. --> 对子查询语句自定义名称,调用里面的自定义名称的值.
  #-- t1.count(id)-- 错误代码： 1630
  #-- FUNCTION t1.count does not exist. Check the 'Function Name Parsing and Resolution' section in the Reference Manual
FROM
  (SELECT 
    dept_id 部门编号,
    COUNT(id) AS 部门人数 
  FROM
    emp 
  GROUP BY dept_id) AS t1,
  dept t2 
  WHERE t1.部门编号 = t2.id;
#-- WHERE t1.`dept_id` = t2.`id` ;
#-- dept_id 起别名后,直接调用, 竟然报错.调用别名


-- 6.查询所有员工的姓名及其直接上级的姓名,没有领导的员工也需要查询
/* 分析: 1. 确定表: emp t1, emp t2;
	2.确定筛选条件: id = mgr */
#自关联映射
SELECT 
	t1.`ename` 员工,
	t1.`mgr` 其管理者id,
	t2.`ename` 管理者,t2.`id`
	
FROM
	-- emp t1,  -- syntax
	emp t1 -- 员工表
LEFT JOIN 
	emp t2 -- 管理者表
-- on t1.`id` = t2.`mgr`; -- 显示不对: 员工表的管理者与管理者的id相同.所以颠倒过来
ON t1.`mgr` = t2.`id`;
-- 7.查询所有员工的姓名及其直接上级的姓名 及他们的职位名称`job`,没有领导的员工也需要查询
-- 第一种: select 后接已查询出来字段.
SELECT 
	t1.ename,
	-- 将emp 表中的job_id 换成 jname 抓重点!
	(SELECT job.`jname` FROM job job WHERE id = t1.`job_id`) e1job,  
	t2.ename,
	(SELECT Job.`jname` FROM /*emp t2,job Job*/ job Job WHERE id = t2.`job_id`) e2job
 
FROM emp t1 LEFT JOIN emp t2
ON 
	t1.mgr = t2.`id`;
-- 错误代码： 1242
-- Subquery returns more than 1 row

-- 第二种: 先找到结果集, 再查集中字段
SELECT
	t1.ename 全部员工,
	t1.jname 员工职位,
	t2.ename 领导
	-- t2.jname 领导职位
FROM
	(SELECT e1.id,e1.`ename`,e1.`mgr`,j1.`jname` FROM emp e1,job j1 WHERE e1.`job_id` = j1.`id`) t1 -- 所有员工的结果集
LEFT JOIN	
	(SELECT e2.id,e2.`ename`,e2.`mgr`,j2.`jname` FROM emp e2,job j2 WHERE e2.`job_id` = j2.`id`) t2 -- 管理者的结果集
ON t1.mgr = t2.id; -- 将同一个表中两个对应起来

/*错误代码： 1060
Duplicate column name 'id'*/

SELECT * FROM emp;