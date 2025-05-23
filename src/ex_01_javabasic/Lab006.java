package ex_01_javabasic;

public class Lab006 {
    public static void main(String args[])
    {
        int x=10,y=10,z=10;
        int expression= (x*x)+(y*y)-(Math.abs(z));
        Double cuberoot= Math.cbrt(expression);

        System.out.println(cuberoot);

    }
}
