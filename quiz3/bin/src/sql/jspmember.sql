create table jspmember (
	member_no number not null,
	id varchar(200) not null,
	password varchar(200) not null,
	email varchar(100) not null,
	phone_num varchar(50) not null,
	reg_date timestamp default sysdate,
	primary key (member_no)
);