package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class PublicGroup extends Group {

    public boolean visible;

    public PublicGroup(String id, String name, User userAdmin) {
        super(id, name, userAdmin);

        visible = true;
    }

    public boolean isVisible() {
        return visible;
    }
}
