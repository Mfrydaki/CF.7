package gr.aueb.cf.ch3;

/** Υπολογίζει το γινόμενο των 10 πρώτων ακεράιων*/

public class MulApp {
    public static void main(String[] args) {

        int i= 1;
        int mul= 1;

        while (i <= 10)
        {
            mul*=i;
            i++;

        }
        System.out.println("The result is : "+mul);
    }
}
