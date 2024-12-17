package gr.aueb.cf.ch3;


import java.util.Scanner;

import static java.lang.System.in;

public class StarCount {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(in);

        int i=1;
        int n=0;

        System.out.println("Insert number or iterations.");
        n= scanner.nextInt();

        while(i<=n){
            System.out.println("*");
            i++;
        }
    }
}
