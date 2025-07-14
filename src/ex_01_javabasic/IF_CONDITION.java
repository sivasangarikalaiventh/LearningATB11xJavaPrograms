package ex_01_javabasic;
import java.util.Scanner;

public class IF_CONDITION {
    public static void main(String args[])
    {
        //int number=Integer.parseInt(args[0]);// input get from CLI Concept
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=input.nextInt();

        if(number%2==0)
        {
            System.out.println("Even number");
        }else
        {
            System.out.println("Odd number");
        }
    }
}
