package OverLoading;

public class area {
    static int Area(int n)
    {
        return n*n;
    }
    static int Rect(int l , int b , int high){
        return l*b*high;
    }

    public static void main(String[] args) {
        System.out.println(Area(5));
        System.out.println(Rect(10 , 20 , 30 ));
    }
}
