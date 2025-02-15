import java.util.*;

public class Array_reverse {
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

        for(int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        System.out.print("\nArray after reversing all elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scan.close();
    }
}
