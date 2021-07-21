package com.spring.department.DepartmentService.repository;

import com.spring.department.DepartmentService.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDeartmentId(Long id);
}
