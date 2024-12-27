package gr.aueb.cf.ch5;

public class ArraySelectionSort {
    public static void main(String[] args) {


        int[]arr = {2,6,10,4};

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Ταξινομημένος πίνακας:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}




