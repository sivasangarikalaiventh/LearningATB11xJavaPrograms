package ex_01_javabasic;
import java.util.Scanner;

public class interview_coding {
    public static void main(String args[])
    {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter your name:");
      String name=input.nextLine();
      System.out.println("Enter your age:");
      int age=input.nextInt();
      System.out.println("Enter your salary:");
      Double salary=input.nextDouble();

      System.out.println(name+" "+age+" "+salary+" ");
      input.close();
    }
}
