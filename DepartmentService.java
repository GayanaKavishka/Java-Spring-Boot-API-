package com.DataModeling.modeling.Service;

import com.DataModeling.modeling.Model.Department;

import java.util.List;

public interface DepartmentService {
    Department create (Department department);
    List<Department> findAll();
    Department update(Long id,Department department);
    void delete(Long id);
}
