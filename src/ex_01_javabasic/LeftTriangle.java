package ex_01_javabasic;

public class LeftTriangle {
    public static void main(String[] args) {
        int Rows=5;
        for(int i=1;i<=Rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
