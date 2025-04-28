CREATE TABLE department (
    department_id NUMBER PRIMARY KEY,
    department_name VARCHAR2(100) NOT NULL,
    description VARCHAR2(100),
    status VARCHAR2(20) DEFAULT 'active' CHECK (status IN ('active', 'inactive')),
    created_by VARCHAR2(100),
    updated_by VARCHAR2(100),
    created_on TIMESTAMP DEFAULT SYSTIMESTAMP,
    updated_on TIMESTAMP DEFAULT SYSTIMESTAMP
);

CREATE SEQUENCE department_seq START WITH 1 INCREMENT BY 1;


CREATE TABLE job_title (
    job_title_id NUMBER PRIMARY KEY,
    job_title VARCHAR2(100) NOT NULL,
    description VARCHAR2(100),
    status VARCHAR2(20) DEFAULT 'active' CHECK (status IN ('active', 'inactive')),
    created_by VARCHAR2(100),
    updated_by VARCHAR2(100),
    created_on TIMESTAMP DEFAULT SYSTIMESTAMP,
    updated_on TIMESTAMP DEFAULT SYSTIMESTAMP
);

CREATE SEQUENCE job_title_seq START WITH 1 INCREMENT BY 1;



CREATE TABLE employee (
    employee_id NUMBER PRIMARY KEY,
    first_name VARCHAR2(100) NOT NULL,
    last_name VARCHAR2(100) NOT NULL,
    email VARCHAR2(150) UNIQUE NOT NULL,
    phone_number VARCHAR2(20),
    joining_date DATE NOT NULL,
    department_id NUMBER REFERENCES department(department_id) ON DELETE SET NULL,
    job_title_id NUMBER REFERENCES job_title(job_title_id) ON DELETE SET NULL,
    manager_id NUMBER REFERENCES employee(employee_id) ON DELETE SET NULL,
    date_of_birth DATE NOT NULL,
    created_by VARCHAR2(100),
    updated_by VARCHAR2(100),
    created_on TIMESTAMP DEFAULT SYSTIMESTAMP,
    updated_on TIMESTAMP DEFAULT SYSTIMESTAMP,
    status VARCHAR2(20) DEFAULT 'active' CHECK (status IN ('active', 'inactive', 'abscond'))
);

CREATE SEQUENCE employee_seq START WITH 1 INCREMENT BY 1;



CREATE TABLE employee_additional_information (
    emp_basic_info_id NUMBER PRIMARY KEY,
    employee_id NUMBER UNIQUE REFERENCES employee(employee_id) ON DELETE CASCADE,
    gender VARCHAR2(20) CHECK (gender IN ('Female', 'Male', 'Others')),
    emp_email VARCHAR2(150),
    linkedin_profile_url VARCHAR2(255),
    emergency_contact VARCHAR2(100),
    marital_status VARCHAR2(50),
    address_line_1 VARCHAR2(255),
    address_line_2 VARCHAR2(255),
    city VARCHAR2(100),
    state VARCHAR2(100),
    country VARCHAR2(100),
    zip_code VARCHAR2(20),
    created_by VARCHAR2(100),
    updated_by VARCHAR2(100),
    created_on TIMESTAMP DEFAULT SYSTIMESTAMP,
    updated_on TIMESTAMP DEFAULT SYSTIMESTAMP
);

CREATE SEQUENCE emp_basic_info_id_seq START WITH 1 INCREMENT BY 1;



CREATE TABLE salary (
    salary_id NUMBER PRIMARY KEY,
    employee_id NUMBER REFERENCES employee(employee_id) ON DELETE CASCADE,
    salary_amount NUMBER(10,2) NOT NULL,
    description VARCHAR2(100),
    status VARCHAR2(20) DEFAULT 'active' CHECK (status IN ('active', 'inactive')),
    created_by VARCHAR2(100),
    updated_by VARCHAR2(100),
    created_on TIMESTAMP DEFAULT SYSTIMESTAMP,
    updated_on TIMESTAMP DEFAULT SYSTIMESTAMP
);

CREATE SEQUENCE salary_id_seq START WITH 1 INCREMENT BY 1;
