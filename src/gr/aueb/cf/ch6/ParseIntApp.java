package gr.aueb.cf.ch6;

import java.util.Scanner;

public class ParseIntApp {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert an integer.");
        s= in.nextLine();
        num=Integer.parseInt(s);

    }
}
