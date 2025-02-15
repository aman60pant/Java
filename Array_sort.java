import java.util.*;

public class Array_sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
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

        //To swap in acending order
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int temp = arr[i];
                if(arr[j]>temp) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nArray after swapping in acending order: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        //To swap in descending order
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int temp = arr[i];
                if(arr[j]<temp) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nArray after swapping in decending order: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }    
}
