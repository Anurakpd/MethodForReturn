package TypeCasting.ClassTypeCasting;

public class MainClass {

    public static void main(String[] args) {


        System.out.println("This is upcasting");
        SuperDemo1 d1 = new SubDemo2(); //subclass object ----> new SubDemo2
        System.out.println(d1.a);

        System.out.println("This is Downcasting");
        SubDemo2 d2 = (SubDemo2) d1; //super object ---> d2
        System.out.println(d2.a);
        SubDemo2.disp();
    }
}
