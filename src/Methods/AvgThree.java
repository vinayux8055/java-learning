package Methods;

public class AvgThree {
    public double Average(int a , int b , int c)
    {
        return  (a + b+ c) / 3.0;

    }

    public static void main(String[] args) {
        AvgThree obj = new AvgThree();
        double result = obj.Average(10 , 20 , 30);

        System.out.println(result);
    }
}
