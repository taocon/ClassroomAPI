INSERT INTO CLASSROOM (classroomId,trainerName) VALUES (1, 'John Gordon');
INSERT INTO CLASSROOM (classroomId,trainerName) VALUES (2, 'Matt Hunt');
INSERT INTO TRAINEE (traineeId,trainerFullName,classroomId) VALUES (1,'Joe Bloggs',1);
INSERT INTO TRAINEE (traineeId,trainerFullName,classroomId) VALUES (2,'Jane Bloggs',1);
INSERT INTO TRAINEE (traineeId,trainerFullName,classroomId) VALUES (3,'David Bloggs',2);
INSERT INTO TRAINEE (traineeId,trainerFullName,classroomId) VALUES (4,'Ceri Bloggs',2);

SELECT c.ClassROOMID , c.traINERNAME , t.traINERFULLNAME  FROM TRAINEE t  JOIN CLASSROOM c ON c.classroomId = t.classroomId