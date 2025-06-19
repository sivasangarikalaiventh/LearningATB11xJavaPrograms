

package ex_01_javabasic;

public class Lap10 {
    public static void main(String args[]) {
        String age1=args[0];
        System.out.println(age1 instanceof String);
        int age=Integer.parseInt(age1);
        String result=(age>=18)?"Minor":(age<=65)?"Major":"Senior";
        System.out.println(result);


    }}