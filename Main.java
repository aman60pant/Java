import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();

        // Displaying the entered numbers
        System.out.println("You entered:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Third Number: " + num3);

        // Adding and displaying addition of three numbers
        int add = num1+num2+num3;
        System.out.println("Addition of the given numbers is : " + add);

        scan.close();
    }
}