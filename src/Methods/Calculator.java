package Methods;

public class Calculator {

    // add method
    public  int Adding(int a , int b){
        return  a+ b ;
    }

    // subtract method
    public  int subtract (int a , int b){
        return  a -  b ;
    }

    // multiply method
    public  int  multiply  (int a , int b){
        return  a *   b ;
    }
    // divide method
    public  int  divide  (int a){
        return  a /  3 ;
    }
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int adding = obj.Adding(10 , 20);
        int subtract = obj.subtract( 20 , 30 );
        int multiply = obj.multiply(10 , 10);
        int divide = obj.divide(10);
        System.out.println(adding);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

    }
}