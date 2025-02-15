import java.util.*;

public class Array_search_element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.err.print("Enter the size of array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Entered array is : ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter the element you want to search in array: ");
        int temp = scan.nextInt();
        boolean Found = false;
        for (int i = 0; i < size; i++) {
            if(temp==arr[i]) {
                System.out.println("The element \'" + temp + "\' found at index " + i );
                Found = true;
                break;
            }
        }
        if(Found == false) {
            System.out.println("Oops! Entered element not found in array.");
        }

        scan.close();
    }
}
