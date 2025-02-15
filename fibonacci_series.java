import java.util.*;

class fib_num {
    public void fun(int num) {
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series in given range is:");
        do {
            System.err.print(a + ", " + b + ", ");
            a = a + b;
            b = a + b;
        } while(a < num || b < num);
    }
}

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the maximum range: ");
        int num = scan.nextInt();
        fib_num obj = new fib_num();
        obj.fun(num);
        scan.close();
    }    
}
