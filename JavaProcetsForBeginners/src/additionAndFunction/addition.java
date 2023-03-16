package additionAndFunction;
import java.util.Scanner;

public class addition {

    public static void main(String[] args) {
        enterNumber();
        System.out.print("the entered you numbers's is: ");
        update();

    }

    public static void enterNumber() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int x=girdi.nextInt();
        System.out.println("please enter seconder number: ");
        int y = girdi.nextInt();
        addition(x,y);

    }

    public static void addition(int a,int b) {
        System.out.println("sum:"+(a+b));
    }


    public static int update() {
        System.out.println("the program was update");
        return 0;
    }

}
