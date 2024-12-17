package gr.aueb.cf.ch4;

import static java.util.Collections.swap;

public class SwapApp {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        System.out.printf("a=%d  b=%d\n" ,a , b);

        int temp=a;
        a=b;
        b=temp;
        System.out.printf("a=%d  b=%d\n" ,a , b);


    }
}
