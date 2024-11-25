package TypeCasting;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        // wideing ---> implicit
        int b = 30;
        double a = b;
        System.out.println(a);

        //widening ---> Explicit

        int b1 = 30;
        double a1 =(double) b1 ;
        System.out.println(a1);

        //Narrowing ---> Explicit

        double a2 = 600.65;
        int b2 =(int) a2;
        System.out.println(b2);



    }
}
