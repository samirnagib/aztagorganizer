/* brModelo: */

CREATE TABLE tbTags (
    idTag INTEGER PRIMARY KEY  auto_increment,
    IdServer INTEGER,
    start_workday Varchar(30),
    stop_workday Varchar(30),
    os_name varchar(50),
    support_group_so varchar(50),
    os_version varchar(50),
    support_group varchar(50)
);
 