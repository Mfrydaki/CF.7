package gr.aueb.cf.Projects;

public class Project01 {

    public static void main(String[] args) {
        int[] arr = {10, 13, 7, 35, 23, 6, 87, 9, 30, 4, 7};
        int[] sortedlist = project(arr);

       // Print the sorted list.
        System.out.print("The sorted array is: " );
        for (int el : sortedlist) {
        System.out.print(el + " ");}

        // Print all possible combinations of six elements
        System.out.println("\nAll possible combinations of six elements:\n");
        generateCombinations(arr);
        }


    public static int[] project(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap elements to place the minimum in its correct position
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void generateCombinations(int[]arr){
        int n= arr.length;

        // Generate combinations
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

