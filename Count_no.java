import java.util.*;

public class Count_no {
    public static void main(String[] args) {
        int negative = 0;
        int positive = 0;
        int zeros = 0;
        int s = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int n = scan.nextInt();
            if(n<0) {
                negative += 1;
            } else if(n==0) {
                zeros ++;
            } else {
                positive ++;
            }
            System.out.print("Enter '1' to continue or '0' to exit: ");
            s = scan.nextInt();
            do {
                if(s>1||s<0) {
                    System.out.println("Oops! You have entered an wrong choice");
                    System.out.print("Enter '1' to continue or '0' to exit: ");
                    s = scan.nextInt();
                }
            }while(s>1||s<0);
        }while(s==1);
        scan.close();
        System.out.println("You have entered: ");
        System.out.println("Negative: " + negative);
        System.out.println("Positive: " + positive);
        System.out.println("Zeros: " + zeros);
    }
}
