// Jerard Austin 2025

import java.util.Arrays;

public class Insertion_Sort {
    
    public static void main(String[] args) {
        // My array of numbers
        int[] numA = {25, 19, 39, 9, 20, 63, 50};

        System.out.println("Hello!! This is an insertion sort example/demonstration");

        System.out.println("Here is the current array!" + "\nCurrent array: " + Arrays.toString(numA));
        // Calls to print array method to display the array
        printingArray(numA);
        // Calls to the insertion sort method to sort our array
        insertionSort(numA);

        

        System.out.println("Here is the new array!" + "\nNew array: " + Arrays.toString(numA));
        // Displays the new array after being sorted out
        printingArray(numA);
    }

    private static void insertionSort(int[] array){
        int n = array.length;

        for (int i = 1; i < n; ++i){
            int key = array[i];

            int j = i - 1;
            j = j - 1;


            while (j >= 0 && array[j] > key ) { 
                array[j + 1] = array[j];
                j = j - 1;


            }

            array[j + 1] = key;

        }
    }


    public static void printingArray(int[] array){

        for (int i : array){
            System.out.println(i + " ");
        }

        System.out.println("");
    }
}
