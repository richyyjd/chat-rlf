package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class PrivateGroup extends Group {

    public boolean visible;
    public long limitOfUsers;
    public String password;

    public PrivateGroup(String id, String name, User userAdmin, boolean visible, long limitOfUsers, String password) {
        super(id, name, userAdmin);
        this.visible = visible;
        this.limitOfUsers = limitOfUsers;
        this.password = password;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public long getLimitOfUsers() {
        return limitOfUsers;
    }

    public void setLimitOfUsers(long limitOfUsers) {
        this.limitOfUsers = limitOfUsers;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
