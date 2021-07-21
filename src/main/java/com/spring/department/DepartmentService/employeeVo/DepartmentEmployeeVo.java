package com.spring.department.DepartmentService.employeeVo;

import com.spring.department.DepartmentService.entity.Department;

public class DepartmentEmployeeVo {
    private Employee employee;
    private Department department;

    public DepartmentEmployeeVo() {
        super();
    }

    public DepartmentEmployeeVo(Employee employee, Department department) {
        this.employee = employee;
        this.department = department;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
