import input.MessageInput;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("application-context.xml");

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
