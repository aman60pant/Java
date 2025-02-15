import java.util.*;


public class Array_sum_average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Entered array is: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        float average = (float) sum/size;
        System.out.println("\nSum of all elements of the array is: " + sum);
        System.out.println("Average of all elements of the array is: " + average);
        scan.close();
    }
}
