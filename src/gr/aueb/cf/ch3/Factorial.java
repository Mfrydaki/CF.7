package gr.aueb.cf.ch3;

import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.Scanner;

//* Calculate n! */

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i=1;
        int factorial=1;
        int inputNum=0;

        System.out.println("Please insert input num.");
        inputNum= scanner.nextInt();

        while (i<= inputNum){
            factorial= i *factorial;
            i++;
        }
        System.out.println(" The result is: "+factorial);


    }

}
