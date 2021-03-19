create table jspboard(
	board_no number not null primary key,
	title varchar2(50) not null,
	content varchar2(4000) null,
	writer varchar2(12) not null,
	reg_date timestamp default sysdate
);

create sequence jspboard_seq 
start with 1
increment by 1 
nocycle;