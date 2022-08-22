package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Department;
import com.masai.model.DeptName;
@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {
Department findByDeptName(DeptName deptName);

}
