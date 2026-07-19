package Recursion;

public class fibonacci {
    static int Fiba(int n )
    {
        if(n==0)
            return 0 ;
        if (n==1)
            return 1;
    return Fiba(n-1) + Fiba(n-2);

    }

    public static void main(String[] args) {
        for(int i = 0 ; i<10 ; i++)
        {
            System.out.println(Fiba(i));
        }
    }
}
