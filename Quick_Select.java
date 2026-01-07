// Jerard A 2025

public class Quick_Select {
    
    public static void main(String[] args) {
        
        int[] dataArr = {23, 34 , 17, 78, 56, 28, 19, 9 ,89};

        int k = 4;

        System.out.println("This is an example/demonstration of the Quick Select technique");

        System.out.println("Here is the original array!");
        printingArray(dataArr);

        int final_results = select(dataArr, 0, dataArr.length - 1, k);

        System.out.println("Here is your new array!");
        printingArray(dataArr);

        System.out.println("The " + k + "th smallest element in the array is " + final_results);
    }

    public static void printingArray(int[] array){

        for (int i : array) {
            System.out.println(i + "");
        }

        System.out.println("");
    }

    private static int quickSelect(int[] array, int low, int high, int k){

        while (low <= high){
            int pivIndex = partition(array, low, high);

            if (pivIndex == k){
                return array[pivIndex];
            }

            else if (pivIndex > k) {
                return quickSelect(array, low, pivIndex - 1, k);
            }

            else{
                return quickSelect(array, pivIndex + 1, high, k);
            }
        }

        return -1;
    }

    private static int partition(int[] array, int low, int high){

        int piv = array[high];

        int i = low;

        for (int j = low; j < high; j++){
            if (array[j] <= piv){
                swapping(array, i, j);
                i++;
            }
        }
        swapping(array, i, high);
        return i;

    }

    public static int select(int[] array, int high, int low, int k){
        return quickSelect(array, 0, array.length - 1, k - 1);
    }

    private static void swapping(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
