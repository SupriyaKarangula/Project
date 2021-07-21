package com.spring.department.DepartmentService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deartmentId;
    private String depName;
    private Long deptCode;

    public Department() {
        super();
    }

    public Department(Long depId, String depName, Long deptCode) {
        this.deartmentId = depId;
        this.depName = depName;
        this.deptCode = deptCode;
    }

    public Long getDepId() {
        return deartmentId;
    }

    public void setDepId(Long depId) {
        this.deartmentId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Long getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(Long deptCode) {
        this.deptCode = deptCode;
    }
}
