package main.java.com.richardlopez.Services;

import main.java.com.richardlopez.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Richard on 11/06/2017.
 */
public class UserServiceImpl implements UserService{

    public Map<Integer, User> users = new HashMap<>();

    @Override
    public User addUser(User userAccount) {
        int my_id = getRandomID();
        userAccount.setId(my_id);
        users.put(my_id, userAccount);
        return userAccount;
    }

    @Override
    public void removeUser(Integer id) {

    }

    @Override
    public User getById(Integer Id) {
        return null;
    }

    @Override
    public List<User> getByName(String name) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<User>(users.values());
    }


    public int getRandomID(){
        int randomNum = ThreadLocalRandom.current().nextInt(1,  99 + 1);
        return randomNum;
    }
}
