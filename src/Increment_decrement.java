public class Increment_decrement {
    public static void main(String args[]) {
        int a = 10;
       /* System.out.println(a++ + ++a);
        a++-> expA=10, now a=11
        ++a->11+1->12 so expB= 12, now a=12
        a++ + ++a->  expA+expB= 10+12-> 22
       System.out.println(++a + ++a);
        ++a-> expA=11, now a=11
        ++a->11+1->12 so expB= 12, now a=12
        ++a + ++a->  expA+expB= 11+12-> 23 */


        /*preDecrement
        int result=--a;
        //EXP=9, a=9
        System.out.println(result);
        System.out.println(a);*/



        //PostDecrement
        int result=a--;
        //EXP=10, a=9,
        System.out.println(result);
        System.out.println(a);


    }
}



