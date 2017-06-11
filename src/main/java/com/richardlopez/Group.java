package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class Group {

    public String id;
    public String name;
    public User userAdmin;
    //public String typeOfGroup;


    public Group(String id, String name, User userAdmin) {
        this.id = id;
        this.name = name;
        this.userAdmin = userAdmin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(User userAdmin) {
        this.userAdmin = userAdmin;
    }
}
