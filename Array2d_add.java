import java.util.*;

public class Array2d_add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no of rows and columns in array: ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int arr1[][] = new int[rows][columns];

        System.out.println("Enter the elements of first array :");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print("Enter element of index " + i + " , " + j + ": ");
                arr1[i][j] = scan.nextInt();
            }
        }

        int arr2[][] = new int[rows][columns];

        System.out.println("\nEnter the elements of second array :");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print("Enter element of index " + i + " , " + j + ": ");
                arr2[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nFirst array is: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nSecond array is: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        //Adding arr1 and arr2
        int arr3[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("\nAfter addition of both arrays: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
