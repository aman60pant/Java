import java.util.*;

class find_gcd {
    public void func(int a, int b) {
        int gcd = 0;
        for(int i = 1; i < a; i++) {
            if(a % i == 0) {
                if (b % i == 0){
                    gcd = i;
                }
            }
        }
        System.out.println("The GCD of given numbers is : " + gcd);
    }
}

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        find_gcd obj = new find_gcd();
        obj.func(a, b);
        scan.close();
    }
}
