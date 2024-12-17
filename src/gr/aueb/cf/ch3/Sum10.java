package gr.aueb.cf.ch3;

/** Υπολογίζει το άθροισμα των 10 πρώτων αριθμών, από 1-10*/

public class Sum10 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i<=10)
        { sum= sum+i;
            i++;}

System.out.println("The sum is :"+sum);
    }
}
