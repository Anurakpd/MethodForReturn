package Abstraction1;

public class Customer {

    public static void main(String[] args) {
        Car obj = new Audi();
        obj.gear();
        obj.accelerator();
        obj.brake();
        obj.stearing();

        Car obj1 = new BMW();
        obj1.stearing();
        obj1.brake();
        obj1.gear();
        obj1.accelerator();
    }
}
