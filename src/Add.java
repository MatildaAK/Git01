import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello, what´s your name: ");
        String name = scanner.next();
        System.out.println("Your name is " + name + ".");
    }

}
