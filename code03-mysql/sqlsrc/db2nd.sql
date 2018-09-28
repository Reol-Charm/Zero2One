SHOW DATABASES ;

SHOW CREATE DATABASE mysql ;

USE mysql ;

# show table mysql;-- wrong!; 我的需求: 展示mysql: 显示数据库mysql下所有表;
SHOW TABLES ;

-- correct!
USE db2nd ;

-- 不运行的话不会起作用.
# SHOW DB2ND; -- WRONG!
SHOW TABLES ;

SELECT 
  TABLES () ;

-- WRONG! 我的需求: 查询正在使用的表;
SELECT 
  DATABASE() ;

-- correct!
DESC db2nd ;

-- 错误代码： 1146 Table 'mysql.db2nd' doesn't exist
DESC db2nd ;

-- correct! 
SHOW TABLES ;

USE mysql ;

SHOW TABLES ;

SHOW CREATE DATABASE mysql ;

SHOW CREATE DATABASE db2nd ;

DESC bd2nd ;

USE db2nd ;

DESC students ;

SHOW TABLES ;

SELECT 
  TABLES ;

SELECT 
  DATABASES () ;

SELECT 
  DATABASE() ;

SHOW TABLES ;

DESC teachers ;

-- DML操作
INSERT INTO stu (
  id,
  NAME,
  age,
  score,
  insert_time,
  birthday
) 
VALUES
  1,
  "Hello",
  21,
  88.88,
  NULL,
  NULL,
  2,
  "mysql",
  22,
  89.99,
  NULL,
  2018-02-12 ;

(2, "mysql", 22, 89.99, NULL, 2018-02-12) 
SELECT 
  * 
FROM
  stu ;

INSERT INTO tablename (
  id,
  NAME,
  age,
  sex,
  address,
  mathScore,
  EnglishScore
) 
VALUES
  (1, '马云', 55, '男', '杭州', 66, 78),
  (
    2,
    '马化腾',
    45,
    '女',
    '深圳',
    98,
    87
  ),
  (
    3,
    '马景涛',
    55,
    '男',
    '香港',
    56,
    77
  ),
  (4, '柳岩', 20, '女', '湖南', 76, 65),
  (
    5,
    '柳青',
    20,
    '男',
    '湖南',
    86,
    NULL
  ),
  (
    6,
    '刘德华',
    57,
    '男',
    '香港',
    99,
    99
  ),
  (7, '马德', 22, '女', '香港', 99, 99),
  (
    8,
    '德玛西亚',
    18,
    '男',
    '南京',
    56,
    65
  ) ;

DESC caseinclass ;

CREATE TABLE tablename (
  id INT,
  NAME VARCHAR (30),
  age INT,
  sex CHAR(10),
  address VARCHAR (100),
  mathScore DOUBLE (3, 1),
  EnglishScore DOUBLE (3, 1)
) ;

SHOW TABLES ;

SELECT 
  * 
FROM
  caseinclass ;

SHOW CREATE TABLE stu ;

SHOW CREATE DATABASE ;

DELETE 
FROM
  caseinclass 
WHERE id = 3 ;

TRUNCATE TABLE caseinclass ;

CREATE TABLE Person02 LIKE tablename ;

-- 1. 只复制 caseinclass 中的列名, 但不复制表中数据.??
SELECT 
  * 
FROM
  Person02 ;

DROP TABLE Person ;

DESC caseinclass ;

SHOW TABLES ;

USE stu ;

SELECT 
  * 
FROM
  students ;

DELETE 
FROM
  caseinclass 
WHERE NAME = "马化腾" ;

-- while 错误! 判断关键字 where!
DELETE 
FROM
  caseinclass 
WHERE NAME LIKE "马%" -- 模糊删除姓马的;
  SELECT 
    * 
  FROM
    caseinclass ;

DELETE 
FROM
  caseinclass 
WHERE age BETWEEN 10 
  AND 50 ;

SELECT 
  * 
FROM
  caseinclass ;

SELECT 
  * 
FROM
  caseinclass ;

ALTER TABLE caseinclass 
  RENAME TO tablename ;

-- 更改表名称
SHOW TABLES ;

ALTER TABLE tablename 
  RENAME TO tableName ;

-- 2. 怎么让 tablename 变成 tableName? 
SHOW TABLES ;

SELECT 
  * 
FROM
  tablename ;

UPDATE 
  tablename NAME = "狗哥🐕",
  address = "常州" ;

-- 错误! 缺少关键字 SET
UPDATE 
  tablename 
SET
  NAME = "狗哥",
  address = "常州",
  age = 23 ;

SELECT 
  * 
FROM
  tablename ;

# DQL 练习.
INSERT INTO tablename (
  2,
  "邱达尔",
  24,
  "♂",
  "泸州",
  NULL,
  NULL
) ;

-- 错误! 缺少关键字 VALUE
INSERT INTO tablename VALUE (
  2,
  "邱达尔",
  24,
  "♂",
  "泸州",
  NULL,
  NULL
) ;

SELECT 
  * 
FROM
  tablename ;

UPDATE 
  tablename 
SET
  mathScore = 100 
WHERE NAME = "邱达尔" ;

-- 报错! Out of range value for column 'mathScore' at row 2
ALTER TABLE tablename 
  MODIFY mathScore INT ;

-- 改变 mathScore 的类型;
UPDATE 
  tablename 
SET
  mathScore = 100 
WHERE NAME = "邱达尔" ;

-- 成功;
SELECT 
  * 
FROM
  tablename ;

ALTER TABLE tablename 
  MODIFY mathScore DOUBLE (4, 1) ;

-- 设置分数上限为 999.9;
UPDATE 
  tablename 
SET
  mathScore = 100.0 
WHERE NAME = "邱达尔" ;

SELECT 
  * 
FROM
  tablename ;

# SQL 第二天.
SHOW TABLES ;

DESC students ;

SELECT 
  * 
FROM
  tablename ;

SELECT 
FROM
  s 
WHERE mathScore ASC ;

UPDATE 
  tablename 
SET
  id = 9 
WHERE NAME = '狗哥' ;

UPDATE 
  tablename 
SET
  id = 10 
WHERE NAME = '邱达尔' ;

SELECT 
  tablename 
WHERE id ASC ;

-- snytax wrong!
SELECT 
  tablename 
WHERE id 
ORDER BY ASC ;

SELECT 
  sex,
  AVG(mathScore) 
FROM
  tablename 
GROUP BY sex ;

SELECT 
  * 
FROM
  tablename ;

-- 分组查询: group 和 having
SELECT 
  COUNT(id),
  age 
FROM
  tablename 
GROUP BY COUNT(id) ;

-- wrong!
SELECT 
  age 
FROM
  tablename 
GROUP BY COUNT(id) ;

-- wrong!
SELECT 
  COUNT(id),
  age,
  sex 
FROM
  tablename 
GROUP BY sex age 
HAVING COUNT(id) > 1 ;

-- wrong!
-- 2. 实现分页操作.
-- 开始的索引 = (当前页面 - 1) * 每页条数;
-- limit 语法 仅限 mysql 数据库.
SELECT 
  * 
FROM
  tablename 
LIMIT 0, 4 ;

SELECT 
  * 
FROM
  tablename 
LIMIT 4 ;

-- 简写方式.
SELECT 
  * 
FROM
  tablename 
LIMIT 4, 4 ;

SELECT 
  * 
FROM
  tablename 
LIMIT 8, 4 ;

SELECT 
  * 
FROM
  tablename 
LIMIT 12, 4 ;

# 约束
-- 1. 非空约束 not null
ALTER TABLE tablename 
  MODIFY address NOT NULL ;

-- wrong!
ALTER TABLE tablename 
  MODIFY address VARCHAR (100) NOT NULL ;

-- correct!
SELECT 
  * 
FROM
  tablename ;

ALTER TABLE tablename 
  MODIFY NAME VARCHAR (30) NOT NULL ;

--  todo 添加列中记录的语法?
INSERT INTO tablename -- 2. 唯一约束 UNIQUE;
ALTER TABLE tablename 
  MODIFY id UNIQUE ;

-- wrong!
ALTER TABLE tablename 
  MODIFY id INT UNIQUE ;

UPDATE 
  tablename 
SET
  id = 9 
WHERE id = 10 ;

-- Duplicate entry '9' for key 'id' 唯一约束生效了.
ALTER TABLE tablename 
  DROP INDEX id ;

-- 删除唯一约束;
UPDATE 
  tablename 
SET
  id = 9 
WHERE id = 10 ;

-- 更改id
-- 3. 主键约束 PRIMARY KEY
ALTER TABLE tablename 
  MODIFY id INT PRIMARY KEY ;

-- Duplicate entry '9' for key 'PRIMARY' 已经有重复的id了, 必须更改后才能设置主键.
ALTER TABLE tablename 
  SET id = 10 WHERE NAME = '邱达尔' ;

-- WRONG! 语法错误... set 与 update 连用.
UPDATE 
  tablename 
SET
  id = 10 
WHERE NAME = '邱达尔' ;

ALTER TABLE tablename 
  MODIFY id PRIMARY KEY ;

-- syntax wrong!
ALTER TABLE tablename 
  MODIFY id INT PRIMARY KEY ;

-- 设置主键成功
-- Incorrect table definition; there can be only one auto column and it must be defined as a key
ALTER TABLE tablename 
  MODIFY id INT AUTO_INCREMENT ;

-- 错误代码： 1075
ALTER TABLE tablename 
  MODIFY id INT ;

-- 删除自动增长.
ALTER TABLE tablename 
  MODIFY id INT AUTO_INCREMENT ;

-- 错误代码： 1075
SELECT 
  * 
FROM
  tablename ;

CREATE TABLE stu01 (
  id INT,
  -- id int PRIMARY KEY;-- syntax wrong! 以 , 隔开!
  -- stu_name varchar(30) not NULL; -- syntax wrong!以 , 隔开!最后一列什么也不加
  stu_name VARCHAR (30) NOT NULL
) ;

ALTER TABLE stu01 
  MODIFY id INT PRIMARY KEY AUTO_INCREMENT ;

-- correct! 设置aoto_increment 之前, 先设置 id 为主键. 
SELECT 
  * 
FROM
  stu01 ;

INSERT INTO stu01 
VALUES
  (NULL, 'hello'),
  (NULL, 'SQL') ;

-- 自动增加成功.
SELECT 
  * 
FROM
  stu01 ;

INSERT INTO stu01 (id, stu_name) 
VALUES
  (5, 'waiting'),
  (NULL, 'JDBC') ;

-- correct! null 自动增加为 6.
INSERT INTO stu01 id,
stu_name 
VALUES
  (5, 'waiting'),
  (NULL, 'JDBC') ;

-- WRONG! 必须给key加括号.
INSERT INTO stu01 id stu_name 
VALUES
  (5, 'waiting'),
  (NULL, 'JDBC') ;

-- wrong! 必须给key中列间加','隔开.且必须给key加括号
SELECT 
  * 
FROM
  stu01 
LIMIT 0, 2 ;

-- 第一页, 每页两列记录
SELECT 
  * 
FROM
  stu01 
LIMIT 2, 2 ;

SELECT 
  * 
FROM
  stu01 ;

DELETE 
  stu01 
WHERE id = 6 ;

-- wrong! delete from!
DELETE 
FROM
  stu01 
WHERE id = 6 ;

INSERT INTO (id, stu_name) 
VALUES
  (NULL, 'jdbcday02?') ;

-- wrong! 缺少表名!
INSERT INTO stu01 (id, stu_name) 
VALUES
  (NULL, 'jdbcday02?') ;

-- id = 8
SELECT 
  * 
FROM
  stu01 ;

DELETE 
FROM
  stu01 
WHERE id = 8 ;

INSERT INTO stu01 (id, stu_name) 
VALUES
  NULL,
  'why?' ;

-- wrong !必须给 values 也加括号.
INSERT INTO stu01 (id, stu_name) 
VALUES
  (NULL, 'why?') ;

-- 必须给 values 也加括号.
SELECT 
  * 
FROM
  stu01 ;

-- 将 id = 8 删除后, 插入的最新一列的 id 继续增加, 为9.
# 下午
-- 略显复杂的外键约束
-- 1. 创建时添加外键约束
SELECT 
  * 
FROM
  stu01 ;

CREATE TABLE stu02 LIKE stu01 ;

SELECT 
  * 
FROM
  stu ;

DROP TABLE stu02 ;

ALTER TABLE stu01 
  ADD stu01_stu_fk INT ;

SELECT 
  * 
FROM
  stu01 ;

SHOW CREATE TABLE stu01 ;

DESC stu01 ;

INSERT INTO stu01 stu01_stu_fk 
VALUES
  1 ;

-- Wrong! 我的需求: 给一列的数据添加1, 或者 2.
UPDATE 
  stu01 
SET
  stu01_stu_fk = 1 
WHERE id = 1 ;

UPDATE 
  stu01 
SET
  stu01_stu_fk = 2 
WHERE id = 2 ;

UPDATE 
  stu01 
SET
  stu01_stu_fk = 1 
WHERE id = 9 ;

UPDATE 
  stu01 
SET
  stu01_stu_fk = 2 
WHERE id = 4 ;

`stu` 
UPDATE 
  stu01 
SET
  stu01_stu_fk = 1 
WHERE id = 5 ;

-- 给表stu添加id = 2
INSERT INTO stu 
VALUES
  (2, 'sql', 22, 99, NULL, NULL) ;

ALTER TABLE stu01 
  ADD CONSTRAINT f_k FOREIGN KEY (stu01_stu_fk) REFERENCES stu (Id) ;

-- 发现stu没有添加主键.
ALTER TABLE stu 
  MODIFY Id INT PRIMARY KEY ;

-- 添加 外键成功.
ALTER TABLE stu01 
  ADD CONSTRAINT f_k FOREIGN KEY (stu01_stu_fk) REFERENCES stu (Id) ;

# 备份数据库: 要在mysql 外部,这里行不通...且最后不能加';', 报错: mysqldump: Couldn't find table: ";"
-- 也可以不指定文件后缀.自己指定打开方式.
-- mysqldump -uroot -proot db2nd > d:\\; -- wrong! 路径名称不对.
-- mysqldump -uroot -proot db2nd > d://db2nd
SHOW TABLES ;

SELECT 
  DATABASE() ;

-- 查询当前所用的数据库.
USE db2nd ;

SHOW TABLES ;

ALTER TABLE tablename 
  MODIFY id INT PRIMARY KEY AUTO_INCREMENT ;

-- 增加主键后, 实现了以主键升序排序.
UPDATE 
  tablename 
SET
  sex = 男 
WHERE sex = ♂ ;

-- Unknown column '♂' in 'where clause'. wrong! 缺少''符号.
UPDATE 
  tablename 
SET
  sex = '男' 
WHERE sex = '♂' ;

-- correct
# 自我训练1: 统计 tablename 表中男女人数;
SELECT 
  sex,
  COUNT(sex) 
FROM
  tablename 
GROUP BY sex ;

# 2. 统计表中男女的地区分布, 男生中多少人是南京...;
-- select sex, count(address),count(sex) from tablename group by sex,address; -- wrong!
SELECT 
  sex,
  COUNT(sex),
  address 
FROM
  tablename 
GROUP BY sex,
  address ;

-- correct!
SELECT 
  sex,
  COUNT(sex),
  address 
FROM
  tablename 
GROUP BY address ;

-- 香港3人也是不正确的.
SELECT 
  address,
  COUNT(address),
  sex,
  COUNT(sex) 
FROM
  tablename 
GROUP BY address,
  sex ;

-- COUNT(sex,address) syntax wrong!
SELECT 
  * 
FROM
  tablename ;

# 3. 以年龄排序 order by -- 单列与多列格式.
-- SELECT age from tablename where * order by age desc;
-- select * from tablename where order by age desc; -- 不需要 where
-- 单列排序! 查询所有数据, 以年龄降序排列. 不需要条件判断 where
SELECT 
  * 
FROM
  tablename 
ORDER BY age DESC ;

-- 多列排序! 以数学成绩降序排列, 相同则以英语成绩降序排列.
SELECT 
  NAME,
  mathScore,
  EnglishScore 
FROM
  tablename 
ORDER BY mathScore DESC,
  EnglishScore DESC ;

-- 格式! :select 要筛选的字段, 逗号隔开 from 表名 ...
# 4. 聚合函数
# 4.1 查询学生总数
SELECT 
  COUNT(id) AS 总人数 
FROM
  tablename ;

-- 10;
SELECT 
  COUNT(*) AS allmembers 
FROM
  tablename ;

SELECT 
  COUNT(EnglishScore) AS 英语成绩人数 
FROM
  tablename ;

-- 8; 自动忽略 null类型.
-- 利用 IFNULL(可能有null值的列名, 0) 如果为null, 则使用0 代替.
SELECT 
  COUNT(IFNULL(EnglishScore, 0)) AS Englishmember 
FROM
  tablename ;

-- 10; 
# 4.2 年龄大于20的有多少人
SELECT 
  COUNT(age) AS 年龄大于2o 
FROM
  tablename 
WHERE age > 20 ;

SELECT 
  * 
FROM
  tablename 
WHERE age > 20 ;

-- 普通查询: 年龄大于20的人是:...
# 4.3 查询数学成绩平均分 
-- select avg(sum(mathScore + EnglishScore))成绩总分 from tablename;-- 错误代码： 1111 Invalid USE of GROUP FUNCTION
SELECT 
  id,
  AVG(mathScore) 
FROM
  tablename ;

-- 不进行分组的话, id/sex/adress等字段没有意义.(只显示一个.)
# 我的需求: 按照男女平均分分组
SELECT 
  sex AS 性别,
  AVG(mathScore) AS 数学平均分,
  AVG(EnglishScore) AS 英语平均分,
  COUNT(id) 男女人数 
FROM
  tablename 
GROUP BY sex ;

-- select avg(sum(mathScore + EnglishScore))成绩总分 from tablename;
/* 查询男女各多少人 
1)  查询所有数据,按性别分组。   
2)  统计每组人数 */
SELECT 
  sex,
  COUNT(id) AS 人数 
FROM
  tablename 
GROUP BY sex ;

-- 变形: 
SELECT 
  address,
  COUNT(id) AS 地区人数 
FROM
  tablename 
GROUP BY address ;

-- 按地区人数查询,分组
SELECT 
  address,
  sex,
  COUNT(sex) AS 该地不同性别的人数 
FROM
  tablename 
GROUP BY address,
  sex ;

-- 按地区和地区性别分组查询.
/*查询年龄大于 25 岁的人,按性别分组,统计每组的人数 
1)  先过滤掉年龄小于 25 岁的人。 
2)  再分组。 
3)  最后统计每组的人数 */
SELECT 
  sex,
  COUNT(id) AS 大于25岁的人数 
FROM
  tablename 
WHERE age > 25 
GROUP BY sex ;

SELECT 
  sex,
  COUNT(id) AS 大于25岁的人数 
FROM
  tablename 
WHERE age > 25 
GROUP BY sex 
HAVING 大于25岁的人数 > 2 ;

-- 利用 having 进行二次筛选.
SELECT 
  * 
FROM
  tablename ;

# 表设计: 约束. 一对多关系.
# 1. 创建食品分类表: 早餐,中,晚,夜宵;
CREATE TABLE kindSnake (
  id INT PRIMARY KEY AUTO_INCREMENT,
  -- 自增的主键约束
  kind_Name VARCHAR (20) NOT NULL UNIQUE,
  -- 非空,唯一约束.
  kind_Time DATE,
  indert_time TIMESTAMP
) ;

SELECT 
  * 
FROM
  kindSnake ;

# 2. 创建创建各种小吃: id(primary key), snake_name, snake_price, snake_weight
SHOW TABLES ;

`tablename` 
SELECT 
  * 
FROM
  tablename ;

# [重点]intert into是插一条(行)数据, 一列数据用update语句.
INSERT INTO tablename (f_k) 
VALUES
  (1) ;

-- Field 'name' doesn't have a default value
ALTER TABLE tablename 
  CHANGE fk_tablename f_k INT DEFAULT 1 ;

-- `stu`
UPDATE 
  tablename 
SET
  f_k = 1 ;

-- 添加外键,括号不能少.
ALTER TABLE tablename 
  ADD CONSTRAINT hellof_k FOREIGN KEY (f_k) REFERENCES stu (Id) ;

-- ALTER TABLE tablename 
-- ADD CONSTRAINT myfk FOREIGN KEY (外键字段名称) REFERENCES 主表名称 (主表列名称) ;

SELECT 
  * 
FROM
  tablename ;

UPDATE 
  tablename 
SET
  f_k = 2 
WHERE sex = '女' ;

# 多对多表关系的练习.--> 创建联合主键以及复合主键.
/* 1. 创建旅游线路分类表 tab_category
cid 旅游线路分类主键，自动增长
cname 旅游线路分类名称非空，唯一，字符串 100*/
CREATE TABLE tab_category(
	cid INT PRIMARY KEY AUTO_INCREMENT,
	cname VARCHAR(100) NOT NULL UNIQUE
);
INSERT INTO tab_category (cname) VALUES ('周边游'), ('出境游'), ('国内游'), ('港澳游');
SELECT * FROM tab_category;
SHOW TABLES;
/* 2. 创建旅游线路表 tab_route
rid 旅游线路主键，自动增长
rname 旅游线路名称非空，唯一，字符串 100
price 价格
rdate 上架时间，日期类型
cid 外键，所属分类
*/
CREATE TABLE tab_route(
	rid INT PRIMARY KEY AUTO_INCREMENT,
	rname VARCHAR(100) NOT NULL UNIQUE,
	price DOUBLE,
	rdate DATE,
	cid INT
	/*add*/ -- constraint fk_route foreign key (cid) references tab_category(cid)
);
-- 插入数据.
INSERT INTO tab_route VALUES 
(NULL, '【厦门+鼓浪屿+南普陀寺+曾厝垵 高铁 3 天 惠贵团】尝味友鸭面线 住 1 晚鼓浪屿', 1499, 
'2018-01-27', 1), 
(NULL, '【浪漫桂林 阳朔西街高铁 3 天纯玩 高级团】城徽象鼻山 兴坪漓江 西山公园', 699, '2018-02-22', 3), 
(NULL, '【爆款￥1699 秒杀】泰国 曼谷 芭堤雅 金沙岛 杜拉拉水上市场 双飞六天【含送签费 泰风情 广州
往返 特价团】', 1699, '2018-01-27', 2), 
(NULL, '【经典•狮航 ￥2399 秒杀】巴厘岛双飞五天 抵玩【广州往返 特价团】', 2399, '2017-12-23', 
2), 
(NULL, '香港迪士尼乐园自由行 2 天【永东跨境巴士广东至迪士尼去程交通+迪士尼一日门票+香港如心海景酒店
暨会议中心标准房 1 晚住宿】', 799, '2018-04-10', 4); 
UPDATE tab_route SET rid = 5 WHERE price = 799;
SELECT * FROM tab_route;
SHOW TABLES;
# 设置外键后 必须加',', 且没有add
/* 3. 创建用户表 tab_user
uid 用户主键，自增长
username 用户名长度 100，唯一，非空
password 密码长度 30，非空
name 真实姓名长度 100
birthday 生日
sex 性别，定长字符串 1
telephone 手机号，字符串 11
email 邮箱，字符串长度 100*/
CREATE TABLE tab_user(
	cid INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(100) NOT NULL UNIQUE,
	PASSWORD VARCHAR(30) NOT NULL,
	NAME VARCHAR(100),
	birthday DATE,
	sex CHAR(1) DEFAULT '♂',
	telephone VARCHAR(11),
	email VARCHAR(100)	
);
-- 添加用户信息
INSERT INTO tab_user VALUES 
(NULL, 'cz110', 123456, '老王', '1977-07-07', '男', '13888888888', '66666@qq.com'), 
(NULL, 'cz119', 654321, '小王', '1999-09-09', '男', '13999999999', '99999@qq.com');
SELECT * FROM tab_user; 
SHOW TABLES;

/*
创建收藏表 tab_favorite
rid 旅游线路 id，外键`db2nd`
date 收藏时间
uid 用户 id，外键
rid 和 uid 不能重复，设置复合主键，同一个用户不能收藏同一个线路两次
*/
CREATE TABLE tab_favorite ( 
  rid INT, 
  DATE DATETIME, 
  uid INT, 
  -- 创建复合主键 
  PRIMARY KEY(rid,uid), 
  FOREIGN KEY (rid) REFERENCES tab_route(rid), 
  FOREIGN KEY(uid) REFERENCES tab_user(uid) 
);
-- 增加收藏表数据 
INSERT INTO tab_favorite VALUES 
(1, '2018-01-01', 1), -- 老王选择厦门 
(2, '2018-02-11', 1), -- 老王选择桂林 
(3, '2018-03-21', 1), -- 老王选择泰国 
(2, '2018-04-21', 2), -- 小王选择桂林 
(3, '2018-05-08', 2), -- 小王选择泰国 
(5, '2018-06-02', 2); -- 小王选择迪士尼  

CREATE DATABASE db3th SELECT * FROM db2nd;
SHOW DATABASES;
SHOW CREATE DATABASE db3th;
SELECT DATABASE();
DROP DATABASE db3th;
CREATE TABLE test LIKE tab_user;
DROP TABLE test;
ALTER TABLE tab_users RENAME TO tab_user;
ALTER TABLE kindsnake CHANGE indert_time insert_time TIMESTAMP;
INSERT INTO kindsnake (id,kind_Name,kind_Time) VALUES (NULL,'夜宵',NULL);
-- 增加一列数据
ALTER TABLE kindsnake ADD test INT;
-- 设置一列数据: 
UPDATE kindsnake SET test = 1;
DESC kindsnake;
ALTER TABLE kindsnake MODIFY kind_Time VARCHAR(30);
INSERT INTO kindsnake (id,kind_Time,test) VALUES (5,'下午三四点',2); -- Field 'kind_Name' doesn't have a default value
ALTER TABLE kindsnake MODIFY kind_Name VARCHAR(30) DEFAULT '?';
DELETE FROM kindsnake WHERE test = 2;
-- 添加字段唯一约束
ALTER TABLE kindsnake MODIFY kind_Name VARCHAR(20) UNIQUE;
-- 删除唯一约束
ALTER TABLE kindsnake DROP INDEX kind_Name;