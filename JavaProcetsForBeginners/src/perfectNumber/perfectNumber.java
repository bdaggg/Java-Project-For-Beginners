package perfectNumber;

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("please enter number");
        int number=girdi.nextInt();
        int total=0;
        for(int a=1;a<number;a++) {
            if(number % a ==0) {
                total = total+a;
            }
        }


        if(number % total==0) {
            System.out.println("the number you entered is a perfect number");
        }

        if (number % total !=0){
            System.out.println("the number you entered is not a perfect number");
        }

    }

}
