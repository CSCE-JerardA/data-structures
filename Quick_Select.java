// Jerard A 2025

public class Quick_Select {
    
    public static void main(String[] args) {
        
        int[] dataArr = {23, 34 , 17, 78, 56, 28, 19};

        System.out.println("This is an example/demonstration of the Quick Sort technique");

        System.out.println("Here is the original array!");
        printingArray(dataArr);

        quickSelect(dataArr);

        System.out.println("Here is your new array!");
        printingArray(dataArr);
    }

    public static void printingArray(int[] array){

        for (int i : array) {
            System.out.println(i + "");
        }

        System.out.println("");
    }

    private static void quickSelect(int[] array){

        int n = array.length;

        for (int i = 1; i < n; ++i){

        }
    }
}
