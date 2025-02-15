import java.util.*;

class find_average{
    public void func(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average of given numbers is : " + average);
    }
    
}

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();


        find_average avg = new find_average();
        avg.func(num1, num2, num3);
        
        scan.close();
    }
}
