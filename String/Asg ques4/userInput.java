import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your word");

        String name = scanner.nextLine();
        System.out.println("your word is "+ name);
    scanner.close();
    }
}
