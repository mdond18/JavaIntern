--Task 7)

--1.)
create table Teacher
            (first_name varchar2(30),
             last_name varchar2(30),
             gender varchar2(30),
             subject varchar2(30) primary key);
            
create table Pupil
             (first_name varchar2(30),
             last_name varchar2(30),
             gender varchar2(30),
             n_class number,
             subject varchar2(30),
             constraint c1 foreign key(subject) references Teacher(Subject))

         

--2.)
select t.first_name
from Teacher t
join Pupil p 
on t.subject=p.subject
where p.first_name='giorgi'             

-------------------------------------------------- 

insert into Teacher (First_Name,
                     Last_Name,
                     Gender,
                     Subject)
                     values('teacher1','teacher1','female','subject1')
                     
insert into Pupil (First_Name,
                   Last_Name,
                   Gender,
                   n_Class,
                   Subject)
                   values('giorgi','pupil1','male',10,'subject1')             
