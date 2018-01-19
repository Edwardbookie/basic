drop table if exists user;
create table user (
  id bigint not null auto_increment commit '主键',
  user_name varchar(40) not null commit '用户名',
  name varchar(20) not null commit '名字',
  age int(3) default null commit '年龄',
  balance decimal(10,2) default null commit '金额',
  primary key (id)
) engine = innodb default charset = utf8