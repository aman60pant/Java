import java.util.*;

public class Strings_count_vowels_consonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String you want to input: ");
        String str= scan.nextLine();
        
        System.out.println("The entered string is: " + str);

        int vowels = 0;
        int consonants = 0;
        String str2 = str.toLowerCase();
        for(int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u'  ) {
                vowels++;
            }
            else if(str2.charAt(i) == ' ') {
                
            }
            else {
                consonants++;
            }
        }

        System.out.println("Entered vowels count is: " + vowels);
        System.out.println("Entered consonantscount is: " + consonants);
        
        scan.close();
    }
}
