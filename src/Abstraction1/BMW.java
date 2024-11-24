package Abstraction1;

public class BMW implements Car{
    @Override
    public void accelerator() {
        System.out.println("the max speed --->100kmph");
    }

    @Override
    public void gear() {
        System.out.println("here we have 5 gears");
    }

    @Override
    public void brake() {
        System.out.println(" Here we have drum brake");
    }

    @Override
    public void stearing() {
        System.out.println("it is in square");
    }
}
