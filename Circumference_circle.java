import java.util.*;

class find_circumference {
    public void fun(double radious) {
            System.out.println("Given radious is: " + radious);
            double circumference = (double) (2 * radious * 3.14) ;
            System.out.println("Circumference of the circle with radious " + radious + " is " + circumference);
        }
    }
    
    public class Circumference_circle {
        public static  void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the radious of the circle: ");
            double radious = scan.nextInt();
            find_circumference obj = new find_circumference();
            obj.fun(radious);
        scan.close();
    }
}