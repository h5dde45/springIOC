package input;

public class DefaultMessage implements MessageInput {

    private String defaultMessage;

    public String getInputMessage() {
        return defaultMessage;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
