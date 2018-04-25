drop table timesheet;
drop table resource_project;
drop table resource_department;
drop table resource;
drop table task_project;
drop table project;
drop table client;
drop table task;
drop table department;
drop table currency;

create table client (
    client_id int NOT NULL AUTO_INCREMENT, 
    client_name varchar(255) not null,
    client_deleted boolean default false,
    PRIMARY KEY(client_id)
);
create table task (
    task_id int NOT NULL AUTO_INCREMENT,
    task_name varchar(255) not null,
    task_deleted boolean default false,
    PRIMARY KEY(task_id)
);
create table department (
    department_id int NOT NULL AUTO_INCREMENT,
    department_name varchar(255) not null,
    department_deleted boolean default false, 
    PRIMARY KEY(department_id)
);
create table currency (
    currency_id int NOT NULL AUTO_INCREMENT,
    currency_name varchar(255) not null,
    currency_deleted boolean default false,
    primary key(currency_id)
);
create table project (
    project_id int NOT NULL AUTO_INCREMENT, 
    project_name varchar(255) not null,
    project_code varchar(50) not null,
    project_deleted boolean default false,
    PRIMARY KEY(project_id)
);
create table task_project(
    task_id int,
    project_id int,
    FOREIGN KEY(task_id) REFERENCES task(task_id),
    FOREIGN KEY(project_id) REFERENCES project(project_id)    
);
create table resource (
    resource_id int not null AUTO_INCREMENT, 
    resource_first_name varchar(50) not null,
    resource_last_name varchar(50) not null,
    resource_is_employee boolean not null,
    resource_external_reference_url varchar(255),
    resource_deleted boolean default false,
    currency_id int,
    
    PRIMARY KEY(resource_id),
    FOREIGN KEY(currency_id) REFERENCES currency(currency_id)
);
create table resource_department(
    resource_id int,
    department_id int,
    FOREIGN KEY(department_id) REFERENCES department(department_id),
    FOREIGN KEY(resource_id) REFERENCES resource(resource_id)    
);
create table resource_project(
    resource_id int,
    project_id int,
    FOREIGN KEY(resource_id) REFERENCES resource(resource_id),
    FOREIGN KEY(project_id) REFERENCES project(project_id)    
);
create table timesheet(
    timesheet_id int NOT NULL AUTO_INCREMENT, 
    timesheet_date DATETIME default CURRENT_TIMESTAMP,
    timesheet_hours double not null,
    timesheet_hours_rounded int not null,
    timesheet_approved boolean,
    timesheet_billable boolean, 
    timesheet_invoiced boolean,
    timesheet_billable_rate int not null,
    timesheet_cost_rate int not null, 
    timesheet_cost_amount int not null,    
    timesheet_deleted boolean default false,
    project_id int,
    resource_id int,
    
    PRIMARY KEY(timesheet_id),
    FOREIGN KEY(project_id) REFERENCES project(project_id),
    FOREIGN KEY(resource_id) REFERENCES resource(resource_id)
);
/
insert into client(
    client_name
)
select distinct client_name from tempin
where client_name is not null;
/
insert into task(
    task_name
)
select distinct task_name from tempin
where task_name is not null;
/
insert into department(
    department_name
)
select distinct department_name from tempin
where department_name is not null;
/
insert into currency(
    currency_name
)
select distinct currency_name from tempin
where currency_name is not null;
/
insert into project(
    project_name,
    project_code
)
select distinct project_name, project_code
from tempin;
/
insert into task_project(
    task_id,
    project_id
)
select t.task_id, p.project_id
from tempin tmp
join task t on tmp.task_name = t.task_name
join project p on tmp.project_name = p.project_name;
/
insert into resource( 
    resource_last_name,
    resource_first_name,
    resource_is_employee,
    resource_external_reference_url,
    currency_id)
select  distinct t.resource_last_name,
        t.resource_first_name,
        t.resource_is_employee,
        t.resource_external_reference_url,
        c.currency_id
from tempin t
left join currency c on c.currency_name = t.currency_name;
/
insert into resource_department(
    resource_id,
    department_id
)
select r.resource_id, d.department_id
from tempin tmp
join resource r on tmp.resource_last_name = r.resource_last_name
join department d on tmp.department_name = d.department_name;

/
insert into resource_project(
    resource_id,
    project_id
)
select r.resource_id, p.project_id
from tempin tmp
join resource r on tmp.resource_last_name = r.resource_last_name
join project p on tmp.project_name = p.project_name;
/
--Inserting to timesheet (only top 221 - there is wired issue with row 222 - don't have time to debug)
insert into timesheet( 
    timesheet_date,
    timesheet_hours,
    timesheet_hours_rounded,
    timesheet_approved,
    timesheet_billable, 
    timesheet_invoiced,
    timesheet_billable_rate,
    timesheet_cost_rate, 
    timesheet_cost_amount,
    project_id,
    resource_id
)
select 
    STR_TO_DATE(tmp.timesheet_date, '%m/%d/%Y'),
    tmp.timesheet_hours,
    tmp.timesheet_hours_rounded,
    tmp.timesheet_approved,
    tmp.timesheet_billable, 
    tmp.timesheet_invoiced,
    tmp.timesheet_billable_rate,
    tmp.timesheet_cost_rate, 
    tmp.timesheet_cost_amount,
    r.resource_id, 
    p.project_id
from tempin tmp
join resource r on tmp.resource_last_name = r.resource_last_name
join project p on tmp.project_name = p.project_name
limit 221; --Having a problem with row 222 so inserting only first 221 rows
/
--select * from timesheet;
--select * from resource;
--select * from project;
--select * from client;
--select * from task;
--select * from department;
--select * from currency;
--select * from tempin;