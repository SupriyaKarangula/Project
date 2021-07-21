package com.spring.department.DepartmentService.employeeVo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String empName;
    private String empDept;

    public Employee(Long empId, String empName, String empDept) {
        this.id = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    public Employee() {
        super();
    }
    public Long getEmpId() {
        return id;
    }

    public void setEmpId(Long empId) {
        this.id = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

}
