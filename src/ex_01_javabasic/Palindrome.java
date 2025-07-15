package ex_01_javabasic;

public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);

        }
        System.out.println(str);
        System.out.println(rev);

    if(str.equals(rev))
    {
        System.out.println("palindrom");
    }
    else
    {
        System.out.println("String");
    }

}}
