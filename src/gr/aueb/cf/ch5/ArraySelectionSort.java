package gr.aueb.cf.ch5;

public class ArraySelectionSort {
    public static void main(String[] args) {

        int[] arr = {32, 53, 1, 9};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIn = i;


            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIn]) {
                    minIn = j;

                }
            }
            int temp = arr[minIn];
            arr[minIn] = arr[i];
            arr[i] = temp;
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }


    }}

