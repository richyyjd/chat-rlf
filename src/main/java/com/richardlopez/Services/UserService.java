package main.java.com.richardlopez.Services;

import main.java.com.richardlopez.User;

import java.util.List;

/**
 * Created by Richard on 11/06/2017.
 */
public interface UserService {

    User addUser(User account);
    void removeUser(Integer id);

    User getById(Integer Id);
    List<User> getByName(String name);
    List<User> findAll();
}
