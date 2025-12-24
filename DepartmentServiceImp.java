package com.DataModeling.modeling.Service;

import com.DataModeling.modeling.Model.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService{

    private List<Department> departments = new ArrayList<>();
    private Long idCounter = 1L;


    @Override
    public Department create(Department department) {
        department.setId(idCounter++);
        departments.add(department);
        return department;
    }

    @Override
    public List<Department> findAll() {
        return departments;
    }

    @Override
    public Department update(Long id, Department department) {
        for(Department d: departments){
            if(d.getId().equals(id)){
                d.setName(department.getName());
                d.setAddress(department.getAddress());
                return d;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        departments.removeIf(d ->d.getId().equals(id) );
    }
}
