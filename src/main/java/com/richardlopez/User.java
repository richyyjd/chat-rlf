package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class User extends Person {

    public String email;
    public String nickname;
    public String password;
    //public String typeOfUser;

    public User() {
    }


    public User(String name, String lastname, String email, String nickname, String password) {
        super(name, lastname);
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
