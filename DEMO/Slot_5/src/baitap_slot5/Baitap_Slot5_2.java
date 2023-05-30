import java.util.Arrays;
import java.util.Scanner;
public class Baitap_Slot5_2 {
        
    public static void displayArray(int[] arr) {
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

   
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input 
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display 
        displayArray(numbers);

        // Sort
        sortArray(numbers);
        System.out.println("Array elements after sorting in ascending order:");
        displayArray(numbers);

        // maximum value
        int max = findMax(numbers);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
