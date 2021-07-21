package com.spring.department.DepartmentService.service;


import com.spring.department.DepartmentService.employeeVo.DepartmentEmployeeVo;
import com.spring.department.DepartmentService.employeeVo.Employee;
import com.spring.department.DepartmentService.entity.Department;
import com.spring.department.DepartmentService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private RestTemplate restTemplate;


    public Department saveDepartment(Department deartment) {
        return departmentRepository.save(deartment);
    }

    public DepartmentEmployeeVo findByDepartment(Long id) {
        DepartmentEmployeeVo vo = new DepartmentEmployeeVo();
        Department department = departmentRepository.findByDeartmentId(id);
        Employee emp = restTemplate.getForObject("http://EMPLOYEE-SERVICE/employee/" + department.getDepId(), Employee.class);
        vo.setDepartment(department);
        vo.setEmployee(emp);
        return vo;
    }
}
