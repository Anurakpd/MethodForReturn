package Work;

public class Returnwithif {
    int a=14;
    int b=5;

    public static void main(String[] args) {
        Returnwithif obj = new Returnwithif();
        int add = obj.add(obj.a, obj.b);
        if (obj.add(obj.a, obj.b)==50){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
        public int add(int a, int b){
           return(a*b);
        }
}

