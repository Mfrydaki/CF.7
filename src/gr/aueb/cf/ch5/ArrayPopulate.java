package gr.aueb.cf.ch5;

public class ArrayPopulate {
    public static void main(String[] args) {

    int [] ages= new int[5];
    

    ages[0] = 10;
    ages[1] = 12;
    ages[2] = 13;
    ages[3] = 15;
    ages[4] = 16;

       for (int i=1; i< ages.length ; i++){
           System.out.print(ages[i]+ " ");
        }

}
}
