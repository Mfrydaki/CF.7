package gr.aueb.cf.ch5;

public class Project01 {

    public static void main(String[] args) {
        int[] arr = {10, 13, 7, 35, 23, 6, 87, 9, 30, 4, 7};
        int[] sortedlist = project(arr);

//Εκτύπωση Ταξινομημένης Λίστας
        System.out.print(" O ταξινομήμένος πίνακας είναι: " );
        for (int el : sortedlist) {
        System.out.print(el + " ");}


 // Εύρεση όλων των δυνατών εξαδων
        //List<int[]> combinations = generateCombinations(sortedlist, 6);

 // Εκτύπωση των εξαδων
        System.out.println("\n Όλες οι δυνατές εξαδες: \n");
        generateCombinations(arr);
        }


    public static int[] project(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
// Βρίσκει το ελάχιστο
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
//Αναταλλαγή-Κατάταξη
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void generateCombinations(int[]arr){
        int n= arr.length;

    // Δημιουργία συνδυασμών
    for ( int i=0; i<n-5 ;i++){
        for(int j=i+1; j<n-4; j++){
            for(int k=j+1; k<n-3 ; k++){
                for( int l=k+1 ; l<n-2 ;l++){
                    for( int m=l+1 ; m<n-1; m++){
                        for (int x=m+1 ; x< n; x++){
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l] + " " + arr[m] + " " + arr[x]);
                        }
                    }

                }
            }
        }
    }

    }
}

