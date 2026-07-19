package Recursion;

public class Factorial {
    static int FFactorial(int Number)
    {
        if(Number == 0 || Number == 1)
            return 1 ;
        return  Number * FFactorial(Number-1);
    }
    public static void main(String[] args) {

        System.out.println( FFactorial(5));
    }
}
