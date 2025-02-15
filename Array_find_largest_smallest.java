import java.util.*;

public class Array_find_largest_smallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in array: ");
        int size = scan.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Entered array is : ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        int largest = array[0];
        int smallest = array[0];
        for(int i = 0; i < size; i++) {
            if(array[i] > largest) {
                largest = array[i];
            }
            if(array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The smallest number in the array is: " + smallest);
        System.out.println("\nThe largest number in the array is: " + largest);
        scan.close();
    }
}
