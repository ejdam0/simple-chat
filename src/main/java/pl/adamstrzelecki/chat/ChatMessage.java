package pl.adamstrzelecki.chat;

public class ChatMessage {

    // message exchanged between broker and client
    private String value;
    private String user;
    private String userColor;

    public ChatMessage(String value) {
        this.value = value;
    }

    public ChatMessage() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserColor() {
        return userColor;
    }

    public void setUserColor(String userColor) {
        this.userColor = userColor;
    }
}
