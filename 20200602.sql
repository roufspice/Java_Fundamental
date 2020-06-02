## subQuery가 단일행인경우


#Allen의 급여와 동일하거나 더 많이 받는 사원의 이름과 급여를 출력해보세요~
SELECT ename, sal
FROM emp
WHERE sal  >= (SELECT salFROM emp WHERE ename = 'ALLEN') AND ename != 'ALLEN'
ORDER BY ename ASC;

#'Dallas'에서 근무하는 사원의 이름, 부서번호를 출력해보세요 
SELECT ename, deptno
FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE loc = 'DALLAS')
ORDER BY ename;

#'SALES'부서에 근무하는 모든 사원의 이름, 급여를 출력해보세요
SELECT ename, sal
FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'SALES')
ORDER BY ename; 

#자신의 직속 상관이 'KING'인 사원의 이름과 급여를 출력
SELECT ename, sal
FROM emp
WHERE mgr = (SELECT empno FROM emp WHERE ename = 'KING')
ORDER BY ename;


#급여를 3000이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의 이름과 급여, 부서번호를 출력해보세요

SELECT deptno FROM emp WHERE sal >= 3000;   #급여를 3000이상 받는 사원이 소속된 부서!

SELECT ename, sal, deptno
FROM emp
WHERE deptno IN (SELECT deptno FROM emp WHERE sal >= 3000);

#In연산자를 이용하여 부서별로 가장 급여를 많이 받는 사원의 사원번호,급여,부서번호를 출력
SELECT empno, sal, deptno
FROM emp
WHERE sal IN(SELECT MAX(sal) FROM emp GROUP BY deptno);


#GROUP BY로 뽑는 방법
SELECT max(sal)
FROM emp
GROUP BY deptno;

#직책이 'MANAGER'인 사원이 속한 부서의 부서번호와 부서명, 부서의 위치출력
SELECT deptno, dname, loc
FROM dept
WHERE deptno IN(SELECT deptno FROM emp WHERE job ='MANAGER');


#우선 직책이 'manager'인 사원이 속한 부서!
SELECT deptno
FROM emp
WHERE job = 'MANAGER';
#WHERE DEPTNO = 10 OR DEPTNO = 20 OR DEPTNO =30;


#직책이 'SLAESMAN'보다 급여를 많이 받는 사원들의 이름과 급여를 출력

SELECT ename, sal, job
FROM emp
WHERE sal > (SELECT min(sal) FROM emp WHERE job='SALESMAN')
ORDER BY sal DESC;

SELECT min(sal)
FROM emp
WHERE job = 'SALESMAN';

#ANY연산자를 활용함!!
SELECT ename, sal
FROM emp
WHERE sal > ANY (SELECT sal FROM emp WHERE job='SALESMAN');









#date => CURDATE(): 2020-06-02
#datetime => NOW(): 2020-06-02 @@:@@::@@
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES(8003, '최수만', '방장', 7900, CURDATE(), 2000, 100, 40);

SELECT * FROM emp;

SELECT * FROM member;

UPDATE member 
SET num = 3
WHERE num =100;

#member 테이블 내용중 num 칼럼이 2인 회원의 이름과 주소를 'jobs' 'us'로 바꾸기
UPDATE member
SET NAME ='손마사요시', addr = '일본'
WHERE num = 2;

INSERT INTO member (num, NAME, addr)
VALUE(5, '카누', '한국');

SELECT * FROM member;

DELETE 
FROM member
WHERE addr = '일본';

UPDATE member
SET num = 2
WHERE num = 1;

INSERT INTO member(num, NAME,addr)
VALUE (1, NULL, NULL);

SELECT * FROM member;

#여러개의 작업단위를 하나로 묶어주는기능 : 트랜젝션;
#한꺼번에 모두 수행해야 할 일련의 연산들을 말한다!!!

START TRANSACTION;
INSERT INTO member(num, NAME, addr) VALUES(9, '알리미' , '미국');
INSERT INTO member(num, NAME, addr) VALUES(10, '올리미' , '중국');
INSERT INTO member(num, NAME, addr) VALUES(11, '내리미' , '영국');

#트랜잭션끝: 모두 수행
#작업이 성공적으로 끝났고 .
COMMIT; 
#트랜잭션 끝: 모두취소
ROLLBACK;


#autocommit : 0 => 자동커밋을 지원하지 않음!
#autocommit : 1 => 자동 커밋을 지원함!

SET autocommit = 0;


DROP TABLE test;

CREATE TABLE test(
num INT,
NAME VARCHAR(50)

);
#테이블구조를 파악하는 코드
DESC test;

#테이블 이름 변경하기(DB에서 객체 이름 변경하기)
ALTER TABLE member_rev RENAME member;
ALTER TABLE test RENAME test_rev;

#DROP : 객체를 삭제할 때
DROP TABLE test_rev;

CREATE TABLE dept2(
deptno TINYINT PRIMARY KEY,
dname VARCHAR(15) DEFAULT '영업부',
loc CHAR(1) CHECK (loc IN('1','2')));

INSERT INTO dept2(deptno, dname, loc) VALUES(10,'기획부1','1');
INSERT INTO dept2(deptno, dname, loc) VALUES(20,'IT팀','1');
INSERT INTO dept2(deptno, dname, loc) VALUES(30,'1');



CREATE TABLE dept3(
deptno TINYINT PRIMARY KEY,
dname VARCHAR(15) NOT NULL
);

INSERT INTO dept3(deptno, dname) VALUES(10,'총무부');
INSERT INTO dept3(deptno, dname) VALUES(10,NULL);

CREATE TABLE emp2(
empno SMALLINT PRIMARY KEY,
ename VARCHAR(15) NOT NULL,
deptno TINYINT,
FOREIGN KEY(deptno) REFERENCES dept2(deptno)
);

INSERT INTO emp2(empno, ename, deptno)VALUES(1000,'KIM',10);
INSERT INTO emp2(empno, ename, deptno)VALUES(1001,'LEE',20);
INSERT INTO emp2(empno, ename, deptno)VALUES(1002,'CHOI',20);  
#FOREIGN KEY
INSERT INTO emp2(empno, ename, deptno)VALUES(1003,'PARK',40);

SELECT *
FROM emp2;



#테이블 복사하기
CREATE TABLE dept4(
deptno TINYINT, 
dname VARCHAR(14),
loc VARCHAR(13)
);
#테이블 복사1
INSERT INTO dept4 SELECT *FROM dept;

SELECT* from dept4;


#테이블 복사2 => 제약조건은 복사가 안됩니다!
CREATE TABLE dept5 AS SELECT * FROM dept;
SELECT* FROM dept5;

#테이블 복사3 => 테이블의 구조만 복사하려면 - 조건이 항상 거짓이 되는 편법 사용!
CREATE table dept6 AS SELECT * FROM dept WHERE 1=2;
SELECT * FROM dept6;

SELECT *
FROM member;
INSERT INTO member(num, NAME, addr) VALUES(8, '하대윤', '북한');

DELETE 
FROM member
WHERE num = 8;

DELETE FROM member WHERE num = 9;

INSERT INTO member(num,NAME,addr) VALUES(10, '하대윤', '북한');

UPDATE member
SET NAME = '문재인', addr ='한국'
WHERE num = 10;

SELECT * FROM member;












