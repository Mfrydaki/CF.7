package gr.aueb.cf.ch1;

import java.util.Scanner;
        //* insert 3 integers and display date/month/year/
// *

public class DateMonthYear {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int day=0;
        int month=0;
        int years=0;
        int formatted_year=0;



        System.out.println("Please insert three integers for day, month, year: ");
        day= scanner.nextInt();
        month=scanner.nextInt();
        years= scanner.nextInt();
        formatted_year=years % 100;

        System.out.printf("%02d/%02d/%2d\n", day, month, formatted_year);



    }
}
