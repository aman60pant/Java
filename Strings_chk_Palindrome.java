import java.util.Scanner;

public class Strings_chk_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        StringBuilder strblder = new StringBuilder(scan.nextLine());
        System.out.println("Entered string is: " + strblder);
        
        String str = strblder.toString();
        String reversed_str = strblder.reverse().toString();
        if((str.compareTo(reversed_str))==0) {
            System.out.println("The Given string is palindrome.");
        }
        else {
            System.out.println("The entered string is not palindrome.");
        }
        
        scan.close();
    }
}
