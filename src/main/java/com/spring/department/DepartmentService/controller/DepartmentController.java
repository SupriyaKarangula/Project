package com.spring.department.DepartmentService.controller;

import com.spring.department.DepartmentService.employeeVo.DepartmentEmployeeVo;
import com.spring.department.DepartmentService.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.department.DepartmentService.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/dept/{Id}")
    public DepartmentEmployeeVo findByDepartment(@PathVariable("Id") Long id) {
         return departmentService.findByDepartment(id);

    }
}
