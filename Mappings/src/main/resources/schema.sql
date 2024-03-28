CREATE TABLE Students (
    ID INT NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);


CREATE TABLE Department (
    department_id INT NOT NULL,
    dept_name VARCHAR(100) NOT NULL,
    DEPART_STUDENT_ID INT NOT NULL
 );
 
 ALTER TABLE Students ADD PRIMARY KEY (ID);
 ALTER TABLE Department ADD PRIMARY KEY (department_id);
 ALTER TABLE Department ADD FOREIGN KEY (DEPART_STUDENT_ID) REFERENCES Students(ID);
 
 
 
 
