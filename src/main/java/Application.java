import config.AppConfig;
import input.MessageInput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageInput consoleMessageInput=(MessageInput)
                context.getBean("consoleMessageInput");
        MessageInput fileMessageInput=(MessageInput)
                context.getBean("fileMessageInput");
        MessageInput defaultMessage=(MessageInput)
                context.getBean("defaultMessage");

        String consoleMessage=consoleMessageInput.getInputMessage();
        System.out.println("from console - "+consoleMessage);

        String fileMessage=fileMessageInput.getInputMessage();
        System.out.println("from file - "+fileMessage);

        String messageByDefault=defaultMessage.getInputMessage();
        System.out.println("default message - "+messageByDefault);


    }
}
