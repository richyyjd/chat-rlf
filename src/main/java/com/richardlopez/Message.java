package main.java.com.richardlopez;

/**
 * Created by Richard on 10/06/2017.
 */
public class Message {

    public String content;
    public String userID;

    public Message(String content, String userID) {
        this.content = content;
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
