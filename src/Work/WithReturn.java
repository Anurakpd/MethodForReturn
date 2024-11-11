package Work;

public class WithReturn {
    int a = 50;
    int b = 30;
    public static void main(String[] args) {
        WithReturn obj=new WithReturn();
        int add = obj.add(obj.a,obj.b);
        System.out.println("Addition is:"+ add);

    }
    public int add(int a,int b){
        return(a+b);
    }

}
