package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class PremiumUser extends User {

    public PremiumUser(String name, String lastname, String email, String nickname, String password) {
        super(name, lastname, email, nickname, password);
    }

    public void createNewPrivateGroup(){
        System.out.println("-- New PRIVATE Group has been created by: ");
    }
}
