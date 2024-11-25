public class Main {
    public static void main(String[] args) {
        Main.Sum(5, 7);
        Main.Sub(12, 11);
        Main.mul(50, 7);
        Main.div(8, 2);
        System.out.println(Main.Sum1(50, 7));
        System.out.println(Main.Sub1(12, 1));
        System.out.println(Main.mul1(5, 7));
        System.out.println(Main.div1(8, 4));
    }

    public static void Sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void Sub(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }

    public static void mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }

    public static void div(int a, int b) {
        int div = a / b;
        System.out.println(div);
    }

    public static int Sum1(int a, int b) {
        return a + b;
    }

    public static int Sub1(int a, int b) {
        return a - b;
    }

    public static int mul1(int a, int b) {
        return a * b;
    }

    public static int div1(int a, int b) {
        return a / b;
    }
}