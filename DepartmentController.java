package com.DataModeling.modeling.Controller;

import com.DataModeling.modeling.Model.Department;
import com.DataModeling.modeling.Service.DepartmentService;
import com.DataModeling.modeling.Service.DepartmentServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    final private DepartmentServiceImp departmentServiceImp;
    DepartmentController(DepartmentServiceImp departmentServiceImp){
        this.departmentServiceImp = departmentServiceImp;
    }

    @PostMapping
    public Department create(@RequestBody Department department){
        return departmentServiceImp.create(department);
    }

    @GetMapping
    public List<Department> getAll(){
        return departmentServiceImp.findAll();
    }

    @PutMapping("/{id}")
    public Department update(
            @PathVariable Long id,
            @RequestBody Department department){
      return departmentServiceImp.update(id, department);
    }

    @DeleteMapping
    public String delete(@PathVariable Long id){
        departmentServiceImp.delete(id);
        return "Delete successfully";
    }
}
