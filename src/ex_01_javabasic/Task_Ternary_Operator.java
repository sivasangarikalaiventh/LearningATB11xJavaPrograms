package ex_01_javabasic;
import java.util.Scanner;

public class Task_Ternary_Operator {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a=input.nextInt();
        System.out.println("Enter b value: ");
        int b=input.nextInt();
        int max_value=(a>b)?a:b;
        System.out.println("max value: "+max_value);


    }
}
