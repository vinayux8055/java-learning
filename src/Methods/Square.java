//package Methods;
//
//public class Square {
//    public int SquareOFNumber(int number )
//    {
//
//        int sqaure = number * number;
//        return sqaure;
//    }
//
//    public static void main(String[] args) {
//        Square obj = new Square();
//        int result = obj.SquareOFNumber(10);
//        System.out.println(result);
//    }
//}

package Methods;

public class Square {

    public int squareOfNumber(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Square obj = new Square();

        int result = obj.squareOfNumber(10);

    }
}
