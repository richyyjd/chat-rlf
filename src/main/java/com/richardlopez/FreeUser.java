package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class FreeUser extends User {

    public FreeUser() {
    }

    public FreeUser(String name, String lastname, String email, String nickname, String password) {
        super(name, lastname, email, nickname, password);
    }

    public void createNewPublicGroup(){
        System.out.println("-- New PUBLIC Group has been created by: ");
    }
}
