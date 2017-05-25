package input;

import java.util.Scanner;

public class ConsoleMessageInput implements MessageInput {
    public String getInputMessage() {
        System.out.println("input message: ");
        return new Scanner(System.in).nextLine();
    }
}
