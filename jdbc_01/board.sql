create table board(
no int auto_increment primary key,
title varchar(200) not null,
writer varchar(200) not null,
content varchar(4000) not null,
regdate date not null
)

insert into board(no,title,writer,content,regdate)
values(100,'1번째 제목','유저1', '1등 내용임다~', now())