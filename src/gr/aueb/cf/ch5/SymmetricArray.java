package gr.aueb.cf.ch5;

public class SymmetricArray {

    public static void main(String[] args) {

    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;


        for (int i = 0, j = arr.length - 1; i<j; i++, j--){
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;

            }
        }
        return isSymmetric;
    }
}
