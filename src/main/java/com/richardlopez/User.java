package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class User extends Person {

    public int id;
    public String email;
    public String nickname;
    public String password;
    public String typeOfUser;

    public User() {
        this.id = 0;
    }

    public User(String name, String lastname, String email, String nickname, String password, String typeOfUser) {
        super(name, lastname);
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.typeOfUser = typeOfUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }
}
