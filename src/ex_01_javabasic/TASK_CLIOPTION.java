package ex_01_javabasic;
//import java.util.Scanner;

public class TASK_CLIOPTION {
    public static void main(String args[])
    {
    /*Scanner input=new Scanner(System.in);


     System.out.println("Enter Your Name:");
     String name=input.next();
        System.out.println("Enter Your age:");
     int age=input.nextInt();
        System.out.println("Enter Your Salary:");

     int Salary=input.nextInt();
     System.out.println("my name is: "+name+" and age is: "+age+" and salary is: "+Salary);

     */
        String name=args[0];
        String age1=args[1];
        String salary1=args[2];
        int age=Integer.parseInt(age1);
        int salary=Integer.parseInt(salary1);
        System.out.println("my name is: "+name+" and age is: "+age+" and salary is: "+salary);



    }

}
