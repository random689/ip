import java.util.*;

public class Duke {
    public static void main(String[] args) {
        String welcomeLine = "Hello! I'm Duke\n" + "What can I do for you?\n";
        String goodbyeLine = "Bye. Hope to see you again soon!";
        System.out.println(welcomeLine);
        boolean isRunning = true;
        String input;
        String[] listArray = new String[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            input = sc.nextLine();
            if (input.equals("bye")) {
                isRunning = false;
                System.out.println(goodbyeLine);
            } else if (input.equals("list")) {
                for (int i = 0; i < count; i++) {
                    System.out.println(i+1 + ". " + listArray[i]);
                }
            } else {
                listArray[count++] = input;
                System.out.println("added: " +  input);
            }
        } while (isRunning);
    }
}
