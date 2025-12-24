package com.DataModeling.modeling.Service;

import com.DataModeling.modeling.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User create(User user);
    User getById(Long id);
    List<User> getAll();
    User update(Long id,User user);
    boolean delete(Long id);
}
