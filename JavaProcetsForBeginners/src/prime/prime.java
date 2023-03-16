package prime;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = girdi.nextInt();
        boolean isprime = true;
        int entry;

        if(number==1) {
            System.out.println("number is not prime");
            return;
        }
        if(number < 1) {
            System.out.println("inoperative number");
            return;
        }


        for(int x=2;x<number;x++) {
            entry = number % x;
            if(entry==0 )	{
                isprime = false;
            }
        }
        if(isprime==false) {
            System.out.println("number is not prime");
        }
        else {
            System.out.println("number is prime");
        }

    }
}

