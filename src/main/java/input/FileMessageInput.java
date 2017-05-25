package input;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMessageInput implements MessageInput {
    public String getInputMessage() {

        String message = "";
        try {
            message = new String(Files.readAllBytes(Paths.get(ClassLoader.getSystemResource("inputMessage.txt").toURI())));
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return message;
    }
}
