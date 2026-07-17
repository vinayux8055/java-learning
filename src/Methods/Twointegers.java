package Methods;

public class Twointegers {
    public int sum(int a , int b )
    {
        int sum = a+b;
        return sum;

    }

    public static void main(String[] args) {
        Twointegers obj = new Twointegers();
        int result = obj.sum(10 , 20);
        System.out.println(result);
    }
}
