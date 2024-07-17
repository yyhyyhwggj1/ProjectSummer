CREATE DATABASE IF NOT EXISTS lesson DEFAULT CHARACTER SET GBK COLLATE GBK_CHINESE_CI;
ALTER DATABASE lesson CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;
CREATE DATABASE IF NOT EXISTS lesson DEFAULT CHARACTER SET GBK COLLATE GBK_CHINESE_CI;
CREATE DATABASE IF NOT EXISTS exercise DEFAULT CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;
CREATE TABLE IF NOT EXISTS stu_course(
                                         `number` INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT '课程编号',
    name VARCHAR(20) NOT NULL COMMENT '课程名称',
    score DOUBLE(5, 2) NOT NULL COMMENT '学分'
    )ENGINE=InnoDB CHARSET=UTF8 COMMENT '课程表';
ALTER TABLE stu_course RENAME AS course;
ALTER TABLE course ADD `time` INT(3) NOT NULL  COMMENT '学时';
ALTER TABLE course MODIFY score DOUBLE(3,1) NOT null COMMENT '学分';``
INSERT INTO course(`number`, name, score, `time`) VALUES (1, 'Java基础', 4, 40);
INSERT INTO course VALUES (2, '数据库', 3, 20);
INSERT INTO course(`number`, score,  name, `time`) VALUES (3, 5, 'Jsp', 40);
INSERT INTO course(`number`, name, score, `time`) VALUES (4, 'Spring', 4, 5),(5,
                                                                              'Spring Mvc', 2, 5);
INSERT INTO course VALUES (6, 'SSM', 2, 3), (7, 'Spring Boot', 2, 2);
INSERT INTO course (`number`,name,score,`time`)VALUES (1,'Java基础',4,40);
INSERT INTO course VALUES(2,'数据库',3,20);
INSERT INTO course (`number`,score,name,`time`)VALUES(3,5,'Jsp',40);
INSERT INTO course (`number`,name,score,`time`)VALUES(4,'Spring',4,5),(5,'Spring Mvc',2,5);
UPDATE course SET score=4,`time`=15 WHERE name='数据库';
DELETE FROM course;
TRUNCATE course;
SELECT c.number,c.score FROM course c WHERE c.score<5;
SELECT*FROM course WHERE name LIKE '%ing%';
SELECT*FROM course WHERE name LIKE 'J%';
SELECT*FROM course WHERE name LIKE '%p';
SELECT*FROM course WHERE name LIKE '___';
SELECT*FROM course WHERE name LIKE 'S__';
从学生表查询成绩在80分以上的学生信息并按性别分组
SELECT*FROM student WHERE score>80 GROUP BY sex;
SELECT * FROM student WHERE score>80 GROUP BY sex;
示例：从学生表查询成绩在60~80之间的学生信息并按性别和年龄分组
SELECT * FROM student WHERE score BETWEEN 60 AND 80 GROUP BY sex, age;
4.2 聚合函数
COUNT() ：统计满足条件的数据总条数
示例：从学生表查询成绩在80分以上的学生人数
SELECT COUNT(*) total FROM student WHERE score>80;
SUM()：只能用于数值类型的字段或者表达式，计算该满足条件的字段值的总和
示例：从学生表查询不及格的学生人数和总成绩
SELECT COUNT(*) totalCount, SUM(score) totalScore FROM student WHERE
    score<60;
AVG()：只能用于数值类型的字段或者表达式，计算该满足条件的字段值的平均值
示例：从学生表查询男生、女生、其他类型的学生的平均成绩
SELECT sex, AVG(score) avgScore FROM student GROUP BY sex;
MAX()：只能用于数值类型的字段或者表达式，计算该满足条件的字段值的最大值
示例：从学生表查询学生的最大年龄
SELECT MAX(age) FROM student;
MIN()：只能用于数值类型的字段或者表达式，计算该满足条件的字段值的最小值
示例：从学生表查询学生的最低分
SELECT MIN(score) FROM student;
4.3 分组查询结果筛选
SELECT ALL/DISTINCT * | 字段名1 AS 别名1[,字段名1 AS 别名1, ..., 字段名n AS 别名n]
FROM 表名 WHERE 查询条件 GROUP BY 字段名1，字段名2,..., 字段名n HAVING 筛选条件
    分组后如果还需要满足其他条件，则需要使用HAVING子句来完成。
示例：从学生表查询年龄在20~30之间的学生信息并按性别分组，找出组内平均分在74分以上的组
SELECT * FROM student WHERE age BETWEEN 20 AND 30 GROUP BY sex HAVING
    avg(score)>74;
5. 排序
SELECT ALL/DISTINCT * | 字段名1 AS 别名1[,字段名1 AS 别名1, ..., 字段名n AS 别名n]
FROM 表名 WHERE 查询条件 ORDER BY 字段名1 ASC|DESC，字段名2 ASC|DESC,..., 字段名n
ASC|DESC
ORDER BY 必须位于WHERE 条件之后。
示例：从学生表查询年龄在18~30岁之间的学生信息并按成绩从高到低排列，如果成绩相同，则按年龄
从小到大排列
SELECT * FROM student WHERE age BETWEEN 18 AND 30 ORDER BY score DESC, age ASC;
6. 分页
SELECT ALL/DISTINCT * | 字段名1 AS 别名1[,字段名1 AS 别名1, ..., 字段名n AS 别名n]
FROM 表名 WHERE 查询条件 LIMIT 偏移量, 查询条数
    LIMIT的第一个参数表示偏移量，也就是跳过的行数。
LIMIT的第二个参数表示查询返回的最大行数，可能没有给定的数量那么多行。
示例：从学生表分页查询成绩及格的学生信息，每页显示3条，查询第2页学生信息
SELECT * FROM student WHERE score>=60 LIMIT 3, 3;
注意：
如果一个查询中包含分组、排序和分页，那么它们之间必须按照分组->排序->分页的先后顺序排列
CREATE DATABASE IF NOT EXISTS mysql_test;
CREATE TABLE IF NOT EXISTS YANYUHE DEFAULT CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;
CREATE DATABASE IF NOT EXISTS DEFAULT CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;
CREATE DATABASE IF NOT EXISTS DEFAULT CHARACTER SET UTF8_GENERAL_CI;
ALTER DATABASE YANYUHE CHARACTER SET GBK COLLATE GBK_CHINESE_CI;
ALTER DATABASE YANYUHE CHARACTER SET GBK COLLATE GBK_CHINESE_CI;
ALTER DATABASE YANYUHE CHARACTER SET GBK COLLATE GBK_CHINESE_CI;
CREATE DATABASE IF NOT EXISTS YANYUHE DEFAULT CHARACTER SET GBK COLLATE GBK_CHINESE_CI;
DROP DATABASE IF EXISTS YANYUHE;
CREATE TABLE IF NOT EXISTS student{
    `SNO` INT AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT 学号,
    SN vachar()
    }


    use mysql_test;