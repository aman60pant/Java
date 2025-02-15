import java.util.*;

class chk_vote {
    void func(int age) {
        if(age>18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("Oops! You are not elegible to vote.");
        }
    }
}

public class Check_vote {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        chk_vote obj = new chk_vote();
        obj.func(age);
        scan.close();
    }
    
}
