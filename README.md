ERD 

EMPLOYEE
- employee_id(PK)
- first_name
- last_name
- email
- phone_number
- hire_date
- department_id(FK)
- job_title_id(FK)
- manager_id
- date_of_birth
- created_by
- updated_by
- created_at
- updated_at
	 
EMPLOYEE_ADDITIONAL_INFORMATION
 - employee_additional_information_id(PK)
 - employee_id(FK)
 - gender
 - personal_email
 - linked_profile_url
 - emergency_contact
 - marital_status
 - address_line_1
 - address_line_2
 - city
 - state
 - country
 - zip_code
 - created_by
 - updated_by
 - created_at
 - updated_at
	 
DEPARTMENT
 - department_id
 - department_name
 - description
 - status
 - created_by
 - updated_by
 - created_at
 - updated_at
	 
JOB_TITLE
- job_title_id
- job_title
- description
- status
- created_by
- updated_by
- created_at
- updated_at
	 
SALARY
- salary_id
- employee_id(FK)
- description
- status
- created_by
- updated_by
- created_at
- updated_at



