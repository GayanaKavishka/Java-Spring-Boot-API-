package com.DataModeling.modeling.Controller;

import com.DataModeling.modeling.Model.User;
import com.DataModeling.modeling.Service.UserServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserServiceImp userServiceImp;
    UserController(UserServiceImp userServiceImp){
        this.userServiceImp = userServiceImp;
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userServiceImp.create(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return userServiceImp.getById(id);
    }

    @GetMapping
    public List<User> getAll(){
        return userServiceImp.getAll();
    }

    @PutMapping("/{id}")
    public User update(
            @PathVariable Long id,
            @RequestBody User user
    ){
        return userServiceImp.update(id,user);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
       userServiceImp.delete(id);
       return "Delete Successfully";
    }

}
