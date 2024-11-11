package Work;

public class Demo2 {
    public static void main(String[] args) {
        Demo2 obj = new Demo2(23);
        obj.substraction(8,10);
    }

    public Demo2(int num1,int num2){
        
    }
    public Demo2(int num2){

    }
    public Demo2(int num1,String str){

    }
    public boolean check(int num1, int num2){
        if(num1>num2){
            return true;
        }
        else return false;
    }

    public void substraction(int num1,int num2){
        if(check(num1, num2)){
           int sum = num1 -num2;
            System.out.println(sum);
        }
        else {
            int sum = num2 - num1;
            System.out.println(sum);
        }
    }
}
