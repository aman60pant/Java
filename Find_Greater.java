import java.util.*;

class Find_Greater_class {
    public int func(int a, int b) {
        if(a>b) {
            return a;
        }
        else {
            return b;
        }
    }
}

public class Find_Greater {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        Find_Greater_class obj = new Find_Greater_class();
        int greater = obj.func(num1,num2);
        System.out.println("Greater number is : " + greater);
        scan.close();
    }
}
