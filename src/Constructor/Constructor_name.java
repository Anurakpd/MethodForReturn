package Constructor;

public class Constructor_name {

    int a =10;
    int b = 20;

   //class name = method name
    //return type
    //non static


    public Constructor_name(int a, int b){
        this.a = a ;
        this.b = b;

    }

    public static void main(String[] args) {

        Constructor_name obj = new Constructor_name(100,200);
        //object ---> invoke the constructor
        System.out.println(obj.a);
        System.out.println(obj.b);

    }


}
