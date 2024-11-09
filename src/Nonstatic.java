public class Nonstatic {
    int a = 50;
    int b = 30;
        public static void main(String[] args) {
            Nonstatic obj=new Nonstatic();
            obj.add(obj.a,obj.b);
            obj.sub(obj.a,obj.b);
            obj.mul(obj.a,obj.b);
            obj.div(obj.a,obj.b);
        }
            public void add(int a,int b){
                int sum=a+b;
                System.out.println(sum);
            }
             public void sub(int a,int b){
                int sub=a-b;
                 System.out.println(sub);
            }
            public void mul(int a,int b) {
                int mul = a * b;
                System.out.println(mul);
            }
            public void div(int a,int b) {
                int div = a / b;
                System.out.println(div);
            }

}
