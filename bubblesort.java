/**
 * bubblesort implementation
 */

public class bubblesort {

    public static void main(String args[]) {

        int arr[] = { 10, 15, 9, 11, 6, 2 };

        // BUBBLE SORT
        for (int i = 0; i < arr.length; i++) { // outer loop for number of passes
                                               // n-1

            for (int j = 0; j < arr.length - i - 1; j++) { // inner loop for arranging elements in a sorted manner
                                                           // n-i-1

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}