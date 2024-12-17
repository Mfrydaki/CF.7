package gr.aueb.cf.ch3;

import java.util.Scanner;

//*Δικαίωμα ψήφου για ηλικίες άνω των 18/*


public class Voting {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        boolean isEligible= false;
        final int votingAge =18;
        int age =  0;

        System.out.println("Enter your age");
        age= scanner.nextInt();

        isEligible = age >= votingAge;


        System.out.println("You are eligible : "+ isEligible);







    }
}
