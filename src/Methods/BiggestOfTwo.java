//package Methods;
//
//public class BigestOfThree {
//    public int Bigest(int a , int b , int c)
//    {
//        if(a>b){
//            System.out.println("a is big");
//        } else if (b>c) {
//            System.out.println("b is big");
//        }
//        else {
//            System.out.println("c is big");
//        }
//        return 0 ;
//    }
//
//    public static void main(String[] args) {
//        BigestOfThree obj = new BigestOfThree();
//
//        obj.Bigest(10 , 20 , 30);
//
//    }
//}
//

package Methods;

public class BiggestOfTwo{

    public int biggest(int a, int b) {

        if (a >= b ) {
            return a;
        }
         else {
            return b;
        }
    }

    public static void main(String[] args) {

        BiggestOfTwo obj = new BiggestOfTwo();

        int result = obj.biggest(10, 20);

        System.out.println("Biggest Number = " + result);
    }
}