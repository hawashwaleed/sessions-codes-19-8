

update patient set  pcellno = '0554976670' where Registrationno = 999000067

update patient set  PPhone = '0554976670' where Registrationno = 999000067

update patient set  SaudiIqamaId = '2125129558' where Registrationno = 999000067
----- ER enhancment ----
select pcellno, PPhone ,SaudiIqamaId,Nationality,Registrationno from patient where  Registrationno = 4600219

select pcellno, PPhone ,SaudiIqamaId,Nationality,Registrationno,Religion from patient where  Registrationno = 1839640
select * from Patient where Registrationno = 0001839987
select * from Patient  where sex=4  -- check why add sex type = 4 in unknownpatient 
select * from patient where Title = 'Unknown'
----------job doctor order-----
exec [DM].[SavePatientUCAF_JOB]
---------------------tabl unknown triag patient---------
--select *  into testunkown from Unknownpatient where Registrationno = 1839991 

select * from Unknownpatient  order by RegistrationNo desc

--update Unknownpatient set  CreatedAt = '2024-02-19 15:13:47.483' where Registrationno = 1839991

update Unknownpatient set CreatedAt = '2024-03-02 15:13:47.483', PayLaterStart = '2024-03-02 16:13:47.483'
,PayLaterEnd = '2024-03-03 16:13:47.483' where Registrationno = 1840017

--select * from Unknownpatient where Registrationno = 5331231


--update Unknownpatient set PayLaterStart = '2024-03-03 08:24:59.363' ,
--PayLaterEnd = '2024-03-04 08:24:59.363' where Registrationno = (1840017 ,1840016
--,1840015
--,1840014
--,1840013
--,1840012
--,1840011
--,1840010
--,1840009) and PayLaterStart is not null and PayLaterEnd is not null;

select *  from Unknownpatient where Registrationno = 1840000 
delete from Unknownpatient where Registrationno = 1839991 
insert into Unknownpatient (RegistrationNo
,CreatedById
,CreatedAt
,IsValidated
,ValidatedById
,ValidatedAt
,PayLaterStart
,PayLaterEnd
,PayLaterby
,visitid
,PayLater
,TriageCategory)  select 
RegistrationNo
,CreatedById
,CreatedAt
,IsValidated
,ValidatedById
,ValidatedAt
,PayLaterStart
,PayLaterEnd
,PayLaterby
,visitid
,PayLater
,TriageCategory
 from testunkown

-------------MRN Registrationno---------
SELECT top 2000 * FROM Patient ORDER BY Registrationno DESC; 
----doctor scedual----
select * from reception.patientgrouptypemaster
insert into reception.patientgrouptypemaster (name,createddate,modifieddate,deleted,[order]) values('VIP',GETDATE(),GETDATE(),0,1),
('Normal',getdate(),getdate(),0,2)

update patient
set  FamilyName = 'Waleed'
where Registrationno = 1839320

update patient
set  LastName = 'Saeed'
where Registrationno = 1839320

update patient
set  Firstname = 'Mansoor'
where Registrationno = 1839320

select pcellno, PPhone ,SaudiIqamaId,Nationality,Registrationno from patient where  Registrationno = 1839968

select * from patient where  Registrationno = 1839968

select * from patient where  PPhone = '0510459022'
select * from patient where PCellno = '0510459022'
select * from OPBill where Registrationno = 0001839970 
select * from OPBillDetail 

select * from [PMS].[ReservationType]

select * from patientType where id = '6'
select * from [PMS].[Queue]
select  * from [PMS].[QueueSetup]
select * from pms.PatientToken where PatientMRN = '5554668'
select * from PMS.Token where Id = 13843

update pms.PatientToken
set  Queueid = 2
where id = 392 

select * from pms.PatientToken where CreateDateTime = '2024-01-29'
select * from PMS.Token order by Date desc; 
select * from Pms.Devices
select * from Pms.Queue 
select * from pms.Devices
select top 10 * from patient
select * from [PMS].[Token]
=======================
select * from doctor where  empcode like ('%ER%') 
select * from doctor where departmentid in   (36,35,37) 
select * from department where ora_code like ('%ER%')
select EmployeeId, FirstName, EmpCode, DepartmentID from doctor where departmentid in (85,111,5,101,34,78,13,74,34,106,39,50) --(36,35,37)
select * from doctor where employeeID = 1822925
Select * from patient where Registrationno = 1839296
---nursing--


-- To use Kiosk 
update Pms.Devices set DeviceIpAddress= '10.243.2.40' where id = 14
--update Pms.Devices set DeviceIpAddress= '10.243.2.40' where id = 23

-- To use Front Office 
-----Screen
update Pms.Devices set DeviceIpAddress= '10.243.2.30' where id = 23
-----Queue
update Pms.Devices set DeviceIpAddress= '10.243.2.30' where id = 22

SELECT top 2000 * FROM Patient ORDER BY Registrationno DESC; 
SELECT top 2000 billtype, * FROM Patient ORDER BY Billtype  DESC; 

select * from Patient where Billtype = '2' 

---consultation arabic name---
select * from doctor where Empcode = 'pd1j'



select * from doctor where firstname like('%Abdelghani%') and employeeid  in('1200713','OGM6')
select * from doctor where EmpCode = 'XR01'
select * from EmpCode where id = IM05
---Doctor department----

select  D.EmployeeID,
D.EmpCode,
D.FirstName,
D.MiddleName,
D.LastName,
D.Sex,
D.ID,
D.DOB , Dep.name Department_name from Doctor D
inner join  Department Dep 
on D.DepartmentID = Dep.ID where D.EmployeeID = '20211227'

,20211227
,20211228
,20211534
,20211571
,20211580
,20211582
,20214952
,20214720;


---Doctor department----


Select * from patient where Registrationno in('1835640','1132016') --10 Mother
select * from ARADmin.Patient_Dependents where relationships = 10
select * from ARADmin.Patient_Dependents where DependentRelationId = 10 
select * from ARADmin.Patient_Dependents where DependentRelationId = 1  and DependentRegistrationNo = '1565277'
select * from relationships 

select * from ARADmin.patientdetails where registrationno = '1839095'

update patient
set DateOfBirth = '2023-01-01'
where Registrationno = '1733235'
-------------------------------------

select * FROM IPBService where Deleted = 0

select * from OPBService where deleted = 0


select * from test where deleted = 0 and departmentid = 54 and (Arabicname is null or ArabicName like '' )

select * from department where id = 88

====================================
select * from ipbservice where deleted = 0

select * from opbservice where deleted = 0
select * from Department where deleted = 0 and LABORATORY = 0

select * from BBOtherProcedures WHERE deleted = 0

select * from Department where name like 'LABORATORY'
-----------------------
select * from ipbservice where deleted = 0

select * from opbservice where deleted = 0
select * from Department where deleted = 0 and LABORATORY = 0

select * from BBOtherProcedures WHERE deleted = 0

select * from Department where name like 'LABORATORY'
---------------
select * from Ipbservice where deleted = 0	
select * from OPbservice where deleted = 0

select * from FoodItem  where Deleted = 0 and DepartmentID = 53

select distinct departmentid from fooditem  where deleted = 0

select * from department where id in(53,119)

select * from department where id = 53

select ServiceName as name ,MasterTable from IPBService where deleted=0and MasterTable != 'NoMaster' 
union

select name,MasterTable from OPBService where deleted=0 and MasterTable != 'NoMaster'
----------------
select * from department where name like('%ome%')

select * from opbservice where deleted = 0
select * from IPBService where deleted = 0

select  * from test where departmentid = 163
-----------------------
update patient
set  pcellno = '0563666491'
where Registrationno = 52021 
	and pcellno='0501598223'
	select * from patient where Registrationno = 1835424
select pcellno, PPhone ,* from patient where  pcellno = '0508023608'
select * from patient where SaudiIqamId = 2298917222

and Registrationno = 52021

select top 10 * from sys.all_columns


select top 10 * from sys.tables where name= ''
----------


select * from employee where firstname like('%Salwa%') and employeeid  in('1200713','OGM6')

------------
select * from opbservice where deleted = 0

select * from ipbservice where deleted = 0

select * from MISCITEMS where deleted = 0

select top 100 * from item where categoryid = 17 
------------------
select * from opbservice where deleted = 0

select * from ipbservice where deleted = 0

select * from MISCITEMS where deleted = 0
select * from Patient where SaudiIqamaId = '1'   -- Registrationno = 18391
select top 100 * from item where categoryid = 17 
---------------------


Select * from patient where Registrationno in('1835640','1132016') --10 Mother
select * from ARADmin.Patient_Dependents where relationships = 10
select * from ARADmin.Patient_Dependents where DependentRelationId = 10 
select * from ARADmin.Patient_Dependents where DependentRelationId = 1  and DependentRegistrationNo = '1565277'
select * from relationships 

select * from ARADmin.patientdetails where registrationno = '1839095'

update patient
set DateOfBirth = '2023-01-01'
where Registrationno = '1733235'
-----------------
select  * from patient where Registrationno = '1839151'

 

update patient
set PCellno = '0541777777'
where Registrationno = '1179393'

 

update patient
set SaudiIqamaId = '1234512222'
where Registrationno = '1179393'
-----------------
select  * from patient where Registrationno = '1149499'

UPDATE PATIENT 
SET SaudiIqamaId = '2122890000' where Registrationno = '1466070'

SELECT * FROM PATIENT WHERE SaudiIqamaId = ''

select * from patient where PCellno = ''

SELECT * FROM Nationality WHERE ID = 9

update Patient
set PCellno = ''

 

update patient
set PCellno = '0544448011'
where Registrationno = '1149499'

 

--update patient
--set SaudiIqamaId = ''
--where Registrationno = '1606610'
-------------------
select  * from patient where Registrationno = '0790894'

UPDATE PATIENT SET SaudiIqamaId = '1234567290' where Registrationno = '13863'
update PATIENT set pcellno = '0541777777' where registrationno ='82065'
update PATIENT set Nationality = '25' where registrationno = '1565277'


SELECT * FROM PATIENT WHERE SaudiIqamaId = '1016170209'
select * from PATIENT where pcellno = '0505683878'
select * from patient where PCellno = '0555606150'

SELECT * FROM Nationality WHERE ID = 9
select * from Nationality where ID = 25
select * from Nationality where ID = 43

update Patient
set PCellno = ''

update patient
set PCellno = '0555555555'
where Registrationno = '453904'

--update patient
--set SaudiIqamaId = ''
--where Registrationno = '1606610'