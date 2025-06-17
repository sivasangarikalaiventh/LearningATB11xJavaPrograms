package ex_01_javabasic;
import java.util.Scanner;

public class Lap008 {
    public static void main(String args[]) {
         /*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:More actions

    A: 90-100

    B: 80-89

    C: 70-79

    D: 60-69

    F: 0-59 */

      Scanner input=new Scanner(System.in);
        System.out.println("Enter Your age:");
      int a=input.nextInt();

      String Result=(a<=59)?"F":((a<=69)?"D":(a<=79)?"C":(a<=89)?"B":(a<=100)?"A":
              "Invaild age");
      System.out.println(Result);

    }}