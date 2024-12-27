package gr.aueb.cf.ch5;

public class SelectionSort
{
    public static void main(String[] args) {

        int[]arr={24,35,4,21,67};
        int min;
        int minPosition;
        int tmp;

        for(int i=0; i< arr.length -1; i++) {

            min = arr[i];
            minPosition = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
                tmp = arr[i];
                arr[i] = min;
                arr[minPosition] = tmp;

            }

            for (int el : arr) {
                System.out.println(el + " ");
            }
        }


        }





