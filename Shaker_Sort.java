// Jerard Austin 2025

public class Shaker_Sort {

    public static void main(String[] args) {

        int[] dataA = {12, 34, 45, 17, 42, 33, 29, 82, 47, 65, 51};

        System.out.println("Here is the original array!");
        printArray(dataA);

        shakerSort(dataA);

        System.out.println("Here is the new array!");
        printArray(dataA);

    }

    private static void shakerSort(int[] array) {
        boolean swapped = true;

        int startP = 0;
        int endP = array.length;

        while (swapped == true) {

            // Resets the flag placed
            swapped = false;

            for (int i = startP; i < endP - 1; ++i) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }

            swapped = false;

            endP = endP - 1;

            for (int i = endP - 1; i >= startP; --i) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }

            startP = startP + 1;
        }
    }

    public static void printArray(int[] array) {

        int n = array.length;
        for (int i : array) {
            System.out.println(i + "");
        }

        System.out.println();
    }
}
