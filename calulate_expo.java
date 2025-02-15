import java.util.*;

class calculate_exponent {
    public void func(int x, int n) {
        int result = 1;
        for(int i = 0; i<n; i++) {
            result = result * x;
        }
        System.out.println(x + "^" + n + " = " + result);
    }
}

public class calulate_expo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scan.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        calculate_exponent obj = new calculate_exponent();
        obj.func(x, n);
        scan.close();
    }
}
