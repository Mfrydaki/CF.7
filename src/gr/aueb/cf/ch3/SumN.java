package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int i = 1;
        int n = 0;
        int sum = 0;

        System.out.println("Please insert n." );
        n= scanner.nextInt();

        while (i <= n )
        {
            sum = i+sum;
            i++;
        }
        System.out.println(" The sum is :"+ sum);
    }
}
