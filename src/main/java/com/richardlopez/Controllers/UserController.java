package main.java.com.richardlopez.Controllers;

import main.java.com.richardlopez.Services.UserServiceImpl;
import main.java.com.richardlopez.User;

/**
 * Created by Richard on 11/06/2017.
 */
public class UserController {

    UserServiceImpl userServiceImpl;

    public UserController() {
        userServiceImpl = new UserServiceImpl();
    }

    public void createUser(User user) {
        try{
            userServiceImpl.addUser(user);
            System.out.println("-- USER has been Created: "+"ID: "+user.getId()+" Name: "+user.getName()+" - "+user.getTypeOfUser()+" --------");
        }catch (RuntimeException ex){}
    }
}
