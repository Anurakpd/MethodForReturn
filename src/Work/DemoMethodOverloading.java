package Work;

public class DemoMethodOverloading {


    public static void main(String[] args) {
        DemoMethodOverloading obj=new DemoMethodOverloading();
        System.out.println(obj.add(3,9));
        System.out.println(obj.add(3,9, 8));
        System.out.println(obj.add(5f,6f));
    }
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a,double b,double c){
        return a+b+c;
    }
    public float add(float b,float c){
        return b+c;
    }
}
