import java.util.*;

public class Strings_reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("Entered string is: " + str);
        StringBuilder strblder = new StringBuilder();

        //Reversing a string without using .reverse()
        for(int i = (str.length() - 1); i >= 0; i--) {
            strblder.append(str.charAt(i));
        }
        System.out.println("Reversed String: " + strblder);
        
        scan.close();
    }
}
