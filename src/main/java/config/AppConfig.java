package config;

import input.ConsoleMessageInput;
import input.DefaultMessage;
import input.FileMessageInput;
import input.MessageInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "consoleMessageInput")
    public MessageInput getConsoleMessageInput() {
        return new ConsoleMessageInput();
    }

    @Bean(name = "fileMessageInput")
    public MessageInput getFileMessageInput() {
        return new FileMessageInput();
    }

    @Bean(name = "defaultMessage")
    public MessageInput getDefaultMessage() {
        DefaultMessage defaultMessage = new DefaultMessage();
        defaultMessage.setDefaultMessage("Default message");
        return defaultMessage;
    }
}
