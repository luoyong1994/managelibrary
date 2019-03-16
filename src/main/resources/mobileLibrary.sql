drop database if exists mobilelibrary;
create database mobilelibrary;
use mobilelibrary;
CREATE TABLE sysuser(
  user_id varchar(100) NOT NULL PRIMARY KEY ,
  user_name VARCHAR(255) NOT NULL,
  user_password VARCHAR(255) NOT NULL,
  user_phone VARCHAR(255) NOT NULL,
  user_type VARCHAR(2)
) ENGINE=INNODB  DEFAULT CHARSET=utf8;


create table user_role(
	id varchar(100) NOT NULL,
	user_id varchar(100) NOT NULL,
	role_id varchar(100) NOT null
) ENGINE=INNODB  DEFAULT CHARSET=utf8;


create TABLE sysrole(
	role_id varchar(100) not NULL PRIMARY KEY ,
	role_desc VARCHAR(20) not NULL 
) ENGINE=INNODB  DEFAULT CHARSET=utf8;


create TABLE role_source(
	id varchar(100) NOT NULL,
	role_id varchar(100) NOT NULL,
	source_id varchar(100) NOT NULL
)ENGINE=INNODB  DEFAULT CHARSET=utf8;

create TABLE resource(
	source_id varchar(100) NOT NULL PRIMARY KEY ,
	source_name VARCHAR(40) NOT NULL,
	source_url VARCHAR(100) NOT null,
	source_type VARCHAR(10) NOT NULL,
	source_parentId varchar(100),
	source_sort varchar(100)(2) NOT NULL
) ENGINE=INNODB  DEFAULT CHARSET=utf8;


create TABLE book(
     id VARCHAR(100) not null,
     title varchar(100) not null,
     author VARCHAR(50) not null,
     publish VARCHAR(50),
     publishDate varchar(20),
     standardcode varchar(100),
     callnumber varchar(100),
     marc varchar(100),
     subTitle varchar(100),
     markbooknumber varchar(100),
     markbookname varchar(100)
) ENGINE=INNODB  DEFAULT CHARSET=utf8;