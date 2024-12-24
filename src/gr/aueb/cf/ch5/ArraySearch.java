package gr.aueb.cf.ch5;

public class ArraySearch {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5};
        final int secret = 3;
        boolean found = false;

        for (int e : arr) {
            if (e == secret) {
                found = true;
                break;}
        }

        if (found) {
            System.out.println("Secret found!");}
           else {
                System.out.print("Try again");
            }

















        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == secret) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Secret found!");}
        else {System.out.println("Try again");

        }
    }

}
