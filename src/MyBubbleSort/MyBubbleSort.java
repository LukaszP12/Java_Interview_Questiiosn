package MyBubbleSort;
//Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
//comparing each pair of adjacent items and swapping them if they are in the wrong order.

public class MyBubbleSort {

    public static void bubble_sort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--){
            for (int i=0; i<n - 1; i++){
                k = i + 1;
                if(array[i] > array[k]){
                    swapNumbers(i,k,array);
                }
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array){

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {

        for (int i=0; i< input.length;i++){
            System.out.println(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_sort(input);
    }

}