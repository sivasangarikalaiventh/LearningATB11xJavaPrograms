package ex_01_javabasic;
import  java.util.Scanner;

public class switchcase1 {
    public static void main(String args[]) {
        //String browser = args[0];//CLI Method
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the browser:");
        String browser=input.next();



        switch (browser) {
            case ("Chrome"):
                System.out.println("run the chrome browser");
                System.out.println("continue the testcase..");
                break;
            case ("edge"):

                System.out.println("Run the edge browser");

            default:
            System.out.println("we dont have this browser");

        }}
    }

