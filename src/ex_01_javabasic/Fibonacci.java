package ex_01_javabasic;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
}
