package gr.aueb.cf.ch4;

import java.util.Scanner;

/** Διαβάζει από το χρήστη έναν ακέραιο αριθμό, ένα σύμβολο πράξης
 * και ένα ακόμα ακέραιο και εκτελεί την πράξη,
 * ανάλογα με το σύμβολο που θα δοθεί*/

public class CalculatorApp {
        public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num1= 0;
        int num2= 0;
        int result =0;
        boolean isError = false;
        char operator= ' ';

        System.out.println(" Please insert an int, an operation and a second int");

        num1 = scanner.nextInt();
        operator = scanner.next().charAt(0);
        num2 =   scanner.nextInt();


        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Error");
                isError = true;
                break;
        }
            if (!isError) {
                System.out.printf("%d %c %d = %d", num1 , operator , num2, result);}





        }

    }

