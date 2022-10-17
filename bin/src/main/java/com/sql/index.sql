use datadb;
SELECT complaint_table.name,complaint_table.email,complaint_table.phonenumber,complaint_table.complaint1, manager.assignee 
FROM manager
INNER JOIN complaint_table ON complaint_table.id=manager.complaintid;

SELECT complaint_table.name,complaint_table.email,complaint_table.phonenumber,complaint_table.complaint1, manager.assignee,feedback.status
FROM manager
INNER JOIN complaint_table ON complaint_table.id=feedback.complaintid;


