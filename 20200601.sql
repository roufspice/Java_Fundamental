#ename 칼럼수를 반환
SELECT COUNT(ename) 
FROM emp;

#comm 칼럼수를 검색,null column은 반환하지 않습니다.!
SELECT COUNT(comm)
FROM emp;

#모든 행(row)의 갯수를  검색하는 방법!!
SELECT COUNT(*)
FROM emp;

SELECT COUNT(empno)
FROM emp;

#SUM(칼럼명) => 해당 칼럼의 값을 모두 더한 값을 리턴한다.

#해당 column의 총합을 구한다.
SELECT SUM(sal)
FROM emp;

SELECT SUM(comm)
FROM emp;

#null값은 계산이 안되기 때문에 ifnull을 이용해 0으로 만들어준다.
SELECT sal, comm, sal + IFNULL(comm,0) AS money
FROM emp;

#>3 AVG(칼럼명) 평균값을 리턴한다. 단 null 칼럼은 제외된다.

SELECT AVG(sal), AVG(comm)
FROM emp;

#comm이 NULL인 사원도 평균에 포함 시켜서 출력을 하려면?

SELECT AVG(IFNULL(comm,0))
FROM emp;

SELECT AVG(IFNULL(sal,0)) salAvg, AVG(IFNULL(comm,0)) commAvg
FROM emp;

SELECT AVG(sal), AVG(comm), AVG(IFNULL(comm,0)), 
SUM(comm)/COUNT(comm) , SUM(comm)/COUNT(*)
FROM emp;

#null은 카운트에서 제외되고, null인값도 평균을 구할때 제외된다.


#>MAX(칼럼명) / MIN(칼럼명)
SELECT MAX(sal) salMAx, empno
FROM emp;
SELECT MIN(sal), empno
FROM emp;



#부서별 급여의 총합을 출력하라.
SELECT sal, deptno
FROM emp
ORDER BY deptno ASC; 

SELECT deptno, COUNT(deptno)
FROM emp
GROUP BY deptno;

#부서별 인원수, 부서별 월급의 평균, 부서별 월급합
SELECT deptno, COUNT(deptno), AVG(ifnull(sal,0)), SUM(sal)
FROM emp
GROUP BY deptno;

#부서별 사원의 수! 
SELECT deptno, COUNT(deptno) 
FROM emp 
GROUP BY deptno;

#부서별 평균급여를 출력(반올림해서 소수 첫째자리까지만)
SELECT deptno, ROUND(AVG(sal),1) 'AVG(sal)'
FROM emp
GROUP BY deptno;

#직업과 직업별 최대 급여를 출력
SELECT job, MAX(sal) maxSal, MIN(sal)
FROM emp
GROUP BY deptno
ORDER BY maxSal DESC;  #ORDER BY는SELECT 할때 잊지 말기

SELECT deptno, round(AVG(sal)) avgSal
FROM emp
WHERE sal >= 1000
GROUP BY deptno
ORDER BY deptno DESC;

#emp테이블에서 / 부서번호 / 급여가 2000이상인 사원들의 
#부서별 평균 급여의 반올림 값을 /평균 급여의 반올림 값으로 오름차순 정렬해서 출력
SELECT deptno, round(AVG(sal)) avgSal
FROM emp
WHERE sal >= 2000
GROUP BY deptno
ORDER BY avgSal asc;

#emp 테이블에서 각 부서별 같은 업무를 하는 사람의 인원수/를 구해서
#부서번호, 업무(job), 인원수를 부서번호에 대해서 오름차순 정렬해서 출력!

SELECT deptno, job, COUNT(job) jobcount
FROM emp
GROUP BY deptno, job  #deptno에서 안에서 또다른 job으로 그룹핑이 가능
ORDER BY deptno ASC, jobcount ASC;


#급여가 1000이상인 사원들의 부서별 평균 급여를 출력
#단 부서별 평균 급여가 2000이상인 부서만 출력하세요

SELECT deptno, round(AVG(sal)) avgSal
FROM emp
WHERE sal >=1000
GROUP BY deptno
HAVING avgSal >=2000
ORDER BY deptno asc;

#LIMIT a,b => a는 시작위치(0부터시작), b는 길이;
#LIMIT 0, 10 => 처음0 번째 row 부터 10개를 가져오기!;
#LIMIT 10, 20 => 10번째 row 부터 10개를 가져오기!;
SELECT empno, ename, job
FROM emp
ORDER BY empno ASC
LIMIT 0,5; 
#LIMIT 같은경우는 게시판의 글을 보여주는 용도로 사용할 수 있다
#MariaDB에만 있는 기능 : LIMIT;

#테이블끼리 join !!!!!

SELECT empno, ename, dname
FROM emp e, dept d
WHERE d.DEPTNO = e.deptno;


































