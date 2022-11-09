mysql -u YourMysqlUsername -p

show databases;

Create batabase learn;

show databases;

use learn;

drop database learn;

create table user(id int(11) primary key, name varchar(100) not null, city varchar(50));

show tables;

desc user;

drop table user;

alter table user rename to student;

truncate table student;

insert into student (id, name, city) value(12,'sanket', 'kolhar');

insert into student (id, name, city) value(11, 'ram', 'kolhar');

select * from student;

alter table student add country varchar(15);

update student set country='india' where name='sanket';

delete from student where col=value;