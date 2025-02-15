import java.util.Scanner;


class sum_odd_no {
    int find_sum(int n) {
        int sum=0;
        for (int i=1; i<=n; i++) {
            if(i % 2 != 0) {
                sum = sum+i;
            }
        }
        return sum;
    }
}


public class sum_odd_numbers {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to stop : ");
        int n = scan.nextInt();

        sum_odd_no obj = new sum_odd_no();
        int sum = obj.find_sum(n);
        System.out.println("The sum of all odd numbers in given range is : " + sum);

        scan.close();
   }
}
