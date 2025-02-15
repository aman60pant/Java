import java.util.*;

public class Array2dTtranspose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of rows and columns in array: ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int arr[][] = new int[rows][columns];

        System.out.println("Enter the elements of array :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element of index [" + i + "," + j + "]: ");
                arr[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("\nGiven array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int arr2[][] = new int[columns][rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0 ; j < columns; j++) {
                arr2[j][i] = arr[i][j];
            }
        }

        System.out.println("\nTransposed Array is: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
