create table emp(
emp_no number primary key,
emp_name varchar2(256) not null,
position varchar2(256),
department varchar2(256),
hire_date date,
emp_phone varchar2(256),
emp_email varchar2(256)
);
create sequence emp_seq;

insert into emp values(emp_seq.nextval, '홍길동', '사장', '', to_date('2010-10-10', 'YYYY-MM-DD'), '010-1234-5678', 'master@kh.com');
insert into emp values(emp_seq.nextval, '이소룡', '인턴', '홍보', to_date('2020-11-11', 'YYYY-MM-DD'), '010-1111-2222', 'tester@kh.com');
commit;
