use batch80;
select *from emp order by empno  limit 5;
select*from emp order by sal desc limit 3 ;
select *from emp order by hiredate desc limit 3;
select*from emp order by sal asc;
select *from emp order by sal desc;
select *from emp order by ename asc;
select *from emp order by empno desc;
select * from emp order by field(job,'president','Analyst','Manager','clerk','salesman');
select ename,job,sal,deptno from emp; 
select ename,job,sal,deptno from emp order by field(job,'MANAGER','CLERK','ANALYST','SALESMAN','PRESIDENT'), sal desc;
select ename, job , hiredate from emp order by field(job,'CLERK','SALESMAN','MANAGER','ANALYST','PRESIDENT'), hiredate desc;
select ename,deptno, job from emp where deptno in(10,20,30) order by field(deptno,30,10,20), field(job,'ANALYST','MANAGER','CLERK','SALESMAN','PRESIDENT');
select distinct job from emp;
select distinct deptno from emp;
select distinct sal from emp;
select distinct job, deptno from emp;
select distinct job from emp where sal >2500;
select distinct deptno from emp where job = 'clerk';
select distinct sal from emp where deptno = 10;
select ename from emp where sal in (800,1600,3000);
select sal from emp where deptno in (10,20);
select ename from emp where job != 'CLERK' AND job != 'SALESMAN';
select ename from emp where sal  not between 1000 and 3000;
select ename from emp where job =  'MANAGER' and  sal > 2500 or job = 'ANALYST' and sal = 3000;








