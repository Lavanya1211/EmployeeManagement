-- DEPARTMENT Table
CREATE TABLE department (
    department_id SERIAL PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL,
    description VARCHAR(100),
    status VARCHAR(20) CHECK (status IN ('active', 'inactive')),
    created_by VARCHAR(100),
    updated_by VARCHAR(100),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- JOB_TITLE Table
CREATE TABLE job_title (
    job_title_id SERIAL PRIMARY KEY,
    job_title VARCHAR(100) NOT NULL,
    description VARCHAR(100),
    status VARCHAR(20) CHECK (status IN ('active', 'inactive')),
    created_by VARCHAR(100),
    updated_by VARCHAR(100),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE employee (
    employee_id SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    phone_number VARCHAR(20),
    joining_date DATE NOT NULL,
    department_id INT REFERENCES department(department_id),
    job_title_id INT REFERENCES job_title(job_title_id),
    manager_id INT,
    date_of_birth DATE NOT NULL,
    created_by VARCHAR(100),
    updated_by VARCHAR(100),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) CHECK (status IN ('active', 'inactive', 'abscond'))
);

-- EMPLOYEE_ADDITIONAL_INFORMATION Table
CREATE TABLE employee_additional_information (
    emp_basic_info_id SERIAL PRIMARY KEY,
    employee_id INT REFERENCES employee(employee_id),
    gender VARCHAR(20) CHECK (gender IN ('Female', 'Male', 'Others')),
    emp_email VARCHAR(150),
    linkedin_profile_url VARCHAR(255),
    emergency_contact VARCHAR(100),
    marital_status VARCHAR(50),
    address_line_1 VARCHAR(255),
    address_line_2 VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    country VARCHAR(100),
    zip_code VARCHAR(20),
    created_by VARCHAR(100),
    updated_by VARCHAR(100),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);



-- SALARY Table
CREATE TABLE salary (
    salary_id SERIAL PRIMARY KEY,
    employee_id INT REFERENCES employee(employee_id),
    description  VARCHAR(100),
    status VARCHAR(20) CHECK (status IN ('active', 'inactive')),
    created_by VARCHAR(100),
    updated_by VARCHAR(100),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);