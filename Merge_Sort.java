// Jerard Austin 2025

public class Merge_Sort {

    // Main method with driver
    public static void main(String[] args) {

        // Array containing the data
        int[] numA = {21, 32, 47, 84, 65, 59, 25, 19};

        System.out.println("Here is the original array");
        printArray(numA);

        merging(numA, left, mid, right);
        sorting(numA, 0, numA.length - 1);
        printArray(numA);





        System.out.println("");

    }

    // Method for merging the two arrays together
    private static void merging(int[] array, int left, int mid, int right) {

        int num1 = mid - left + 1;
        int num2 = right - mid;

        int[] leftA = new int[num1];
        int[] rightA = new int[num2];

        for (int i = 0; i < num1; ++i) {
            leftA[i] = array[left + i];
        }

        for (int j = 0; j < num2; ++j) {
            rightA[j] = array[j + mid + 1];
        }



        int i = 0;
        int j = 0;

        int k = left;

        while (i < num1 && j < num2) {
            
            if (leftA[i] <= rightA[j]) {
                array[k] = leftA[i];
                i++;
            }

            else {
                array[k] = rightA[j];
                j++;
            }

            k++;

            while (i < num1) {
                array[k] = leftA[i];
                i++;
                k++;
            }

            while (j < num2) {
                array[k] = rightA[j];
                j++;
                k++;
            }
        }

    }

    // Method for sorting the array 
    private static void sorting(int[] array, int left, int right) {

        if (left < right){

            // Creates the middle variable 
            int mid = (left + right) / 2;
            // Uses recursion to sort the left and mid variables in the array
            sorting(array, left, mid);
            // Uses recursion to sort through the mid and right variables in the array
            sorting(array, mid + 1, right);
            // Merges the two arrays
            merging(array, left, mid, right);
        }

    }
    // Method for printing/displaying the past and current state of the array 
    public static void printArray(int[] array) {

        for (int i : array){
            System.out.println(i + "");
        }

        System.out.println();
    }




}
