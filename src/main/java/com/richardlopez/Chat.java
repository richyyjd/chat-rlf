package main.java.com.richardlopez;

import main.java.com.richardlopez.Controllers.UserController;

import java.util.List;

/**
 * Created by Richard on 10/06/2017.
 */
public class Chat {


    public void execute() {
        UserController userController = new UserController();
        userController.createUser(new User("Richard", "Lopez", "richyyjd@gmail.com", "rlopez", "123456", "Free"));
        userController.createUser(new User("Martin", "Torrico", "m.torrico@gmail.com", "mtorrico", "123456", "Premium"));

        List<User> users =  userController.getAllUsers();

        for (User item: users){
            System.out.println(item.toString());
        }
    }
}
