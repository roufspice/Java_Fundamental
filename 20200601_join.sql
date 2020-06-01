#데이터를 효율적으로 쓰고, 하나의 테이블에 column을 조절하기 위하는 방법도 있다.

SELECT deptno, dname, loc
FROM dept
WHERE deptno != 10 AND deptno != 40;



#MAP구조로 key - value로 이어져있다.
#primaryKey로 검색을 하면 검색 효율이 높다.
#primaryKey - pointer로 연결되어 있으면 검색속도가 빠르다

#where조건이 없는 join은 column하나에 대해서 다 찾는다.
SELECT empno, ename, emp.deptno,  dname, loc
FROM emp, dept;

#where 조건을 주면 어떻게 변하는지 살펴보자!
SELECT empno, ename, emp.deptno, dept.DEPTNO, dname, loc
FROM emp, dept
WHERE dept.deptno = emp.deptno; #(왼쪽 변수 = 오른쪽 값)


SELECT empno, ename, emp.deptno,  dname, loc
FROM emp, dept
WHERE dept.DEPTNO = emp.deptno;

#emp테이블의 모든 사원들의 이름, 부서번호, 부서명을 출력
SELECT ename, dept.deptno, dname
FROM emp, dept
WHERE dept.DEPTNO = emp.DEPTNO;

#***테이블에 alias 추가하는 경우. *****
SELECT ename, d.deptno, dname  
FROM emp e, dept d
WHERE d.deptno = e.deptno
ORDER BY deptno ASC, ename ASC;

#***join~ on 표현식을 사용하는 경우 ','대신에 join 을 'where'대신에 'on'사용
SELECT ename, d.deptno, dname
FROM emp e JOIN dept d
ON d.deptno = e.deptno; 

#ansi join: join using(두테이블의 column명이 같을 경우에만)
SELECT ename, d.deptno, dname
FROM emp e JOIN dept d
USING(deptno);



#연습
#emp 테이블의 모든 사원들의 이름, 부서번호, 부서명을 출력
SELECT ename, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno  #왼쪽값을 primaryKEY값으로 입력하기!
ORDER BY deptno, ename;

#급여가 3000에서 5000사이의 사원이름과 부서명을 출력
SELECT ename, dname, sal
FROM emp e, dept d
WHERE sal >= 3000 and sal <= 5000 and D.deptno = e.deptno
ORDER BY dname;

#급여가 3000에서 5000사이의 사원이름과 부서명을 출력
SELECT ename, dname, sal
FROM emp e, dept d
WHERE sal between 3000 and 5000 and D.deptno = e.deptno
ORDER BY dname;

#부서명이 'Accounting'인 사원의 이름, 입사일, 부서번호, 부서명출력
SELECT ename, hiredate, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND dname = 'accounting'
ORDER BY hiredate;

#커미션이 null이 아닌 사원의 이름, 입사일, 부서명을 출력하라.
#단 입사일은 2020년 11월 20일 형식으로 출력

SELECT ename, DATE_FORMAT(hiredate, '%Y년 %m월 %d일') hiredate, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND comm IS NOT NULL; #null인사람은 is null
ORDER BY ename ASC;

#부서명이 'ACcounting'인 사원의 이름, 입사일, 부서번호, 부서명을 출력
#단 입사일은 2020년 11월 20일 형식으로 출력

SELECT ename, date_format(hiredate, '%Y년 %m월 %d일') hiredate, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno
ORDER BY d.deptno ASC, ename ASC;

#신입사원 ERIC 입사!!!
INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm)
VALUES(8000, 'ERIC', 'CLERK' , 7900, '1983-02-25', 500, NULL);

#사원번호, 부서번호, 부서명을 출력하세요
#단, 사원이 근무하지 않는 부서명도 같이 출력해보세요!
SELECT empno, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno;

#**************#
#LEFT JOIN : 오른쪽테이블에는 데이터가 존재하지 않을 때에도 모든 데이터를 추출하도록 함.
SELECT empno, d.deptno, dname
FROM emp e LEFT JOIN dept d
ON d.deptno = e.deptno;

#emp 테이블과 dept 테이블을 조인하여 부서번호, 부서명, 이름, 급여를 출력!
SELECT d.deptno, dname, ename, sal
FROM emp e, dept d
WHERE d.deptno = e.deptno;

#2. 사원의 이름이 'ALLEN'인 사원의 이름과 부서명을 출력!
SELECT ename, d.deptno
FROM emp e, dept d
WHERE ename = 'ALLEN' AND e.deptno = d.deptno;

#3. 모든사원의 이름, 부서번호, 부서명, 급여를 출력
#단! emp테이블에 없는 부서도 출력해보세요!!
SELECT ename, d.deptno, dname, sal
FROM emp e LEFT JOIN dept d
ON e.deptno = d.deptno;

#4. 사원의 이름과 급여, 급여의 등급을 출력
#emp 테이블과 salgrade 테이블을 조인
SELECT ename, sal, grade
FROM emp e, salgrade s
WHERE sal BETWEEN losal AND hisal #하나씩 비교하면서 조건문이 true인경우 출력
ORDER BY sal desc;


#5. 사원의 이름과, 부서명, 급여의 등급을 출력
#emp 테이블과 salgrade 테이블을 조인해야 함
SELECT ename, dname, grade
FROM emp e, dept d, salgrade s
WHERE d.DEPTNO = e.deptno AND sal >= losal AND sal <= hisal
ORDER BY dname ASC;


#Smith가 근무하는 부서명을 서브쿼리를 이용해서 출력!!
SELECT ename, dname
FROM emp e, dept d
WHERE e.deptno = d.deptno AND ename = 'smith'

#Allen과 같은 부서에서 근무하는 사원의 이름과 부서의 번호를 출력해주세요
SELECT ename, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND d.deptno = (SELECT deptno
FROM emp 
WHERE ename = 'Allen');


#subQuery
SELECT ename, deptno
FROM emp
WHERE deptno = (SELECT deptno 
FROM emp
WHERE ename = 'Allen');

#직업이 'Salesman'인 사람의 사원번호와 직업을 출력!!
SELECT empno, job , ename
FROM emp
WHERE job = 'salesman'
ORDER BY empno ASC;

#subQuery를 남용하지마라라는거에요 마라탕이구나 





