
// JC Austin 2025
import java.util.Arrays;


public class Bubble_Sort {


public static void main (String[] args){

    // Statement that gives our array some data
    int[] array = {34, 12, 45, 10, 5, 90, 37};

    System.out.println("Hello! This is a bubble sort example/demonstration");

    // Message for the original or current code
    System.out.println("The original array: " + Arrays.toString(array));

    // Calls the bubbleSort function/method
    bubbleSort(array);

    // Message displaying the new code
    System.out.println("Here is your new sorted array!" + "\nNew array: " + Arrays.toString(array));

}


    private static void bubbleSort(int[] array) {
        
        int n = array.length;

        boolean swapping;

        for (int i = 0; i < n - 1; i++) {
            swapping = false;

            
            for (int j = 0; j < n - i - 1; j++) {
                // Checks if the element or number is greater than the next
                if (array[j] > array[j + 1]) {
                    
                    // Creates the temporary variable swaps
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapping = true;
                }
            }

            if (!swapping) {
                break;
            }
        }
    }

}