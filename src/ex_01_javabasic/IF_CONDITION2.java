package ex_01_javabasic;

public class IF_CONDITION2 {
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a==b && b==c && c==a)
        {
        System.out.println("triangle");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("isosceles");
        }
        else
        {
            System.out.println("scalene");
        }
}}
