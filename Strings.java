import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: " + name);
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        scan.close();
    }
}