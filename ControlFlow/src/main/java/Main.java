import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Good morning! What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Nice to me you " + userName + ".");
    }
}
