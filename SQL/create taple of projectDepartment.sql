DROP TABLE IF EXISTS employee,department;

DROP TYPE IF EXISTS sex;

CREATE TYPE sex                    AS ENUM ('FEMALE','MALE','UNDECIDED');    --crea un enum

CREATE TABLE department
(
    id_department            BIGINT NOT NULL,
    name                    VARCHAR(32) NOT NULL,
    address                    VARCHAR(100) NOT NULL,
    max_capacity            INT NOT NULL,
    CONSTRAINT PK_department PRIMARY KEY(id_department)
);

CREATE SEQUENCE department_sequence
  start 1
  increment 1
  OWNED BY department.id_department;

CREATE TABLE employee
(
      id_employee            BIGINT NOT NULL,
      name                VARCHAR(32) NOT NULL,
      surname                VARCHAR(32) NOT NULL,
    hire_date              DATE NOT NULL,
      sex                    sex NOT NULL,
      id_department          BIGINT NOT NULL,
      CONSTRAINT PK_employee PRIMARY KEY(id_employee),
    CONSTRAINT FK_employee_department FOREIGN KEY(id_department)
        REFERENCES department(id_department)
);

CREATE SEQUENCE employee_sequence
  start 1
  increment 1
  OWNED BY employee.id_employee;