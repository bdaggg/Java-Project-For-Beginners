package control;
import java.util.Scanner;

public class control {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[] group = {1,2,3,4,5,6};
        System.out.println("please enter a number");
        int number=girdi.nextInt();
        int x=0;
        for(int a = 0;a<group.length;a++) {
            if(group[a]==number) {
                x=1;
                continue;
            }

        }

        if(x==1){
            System.out.println("the number you entered is a of group element");
        }

         else {
            System.out.println("the number you entered is not a of group element");

        }

    }

}
