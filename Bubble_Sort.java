// JC Austin 2025
import java.util.Scanner;
import java.util.Arrays;


public class Bubble_Sort {


public static void main (){

    int[] array;

    System.out.println("Hello! This is a bubble sort example/demonstration");

    bubbleSort(array);

    System.out.println("Here is your new sorted array");

}


private void bubbleSort(array) {
    int[] array;

    bool swap;

    for (i = 0; i < n; i++) {
        swap = false;

        // Checks if the element or number is greater than the next
        for (j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {

                [array[j], array[j + 1]] = [array[j + 1], array[j]];

                swap = true;
            }
        }

        if (!swap) {
            break;
        }
    }
}

}