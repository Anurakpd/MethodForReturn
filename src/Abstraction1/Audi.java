package Abstraction1;

public class Audi implements Car{
    @Override
    public void accelerator() {
        System.out.println("the max speed --->80kmph");
    }

    @Override
    public void gear() {
        System.out.println("here we have 3 gears");
    }

    @Override
    public void brake() {
        System.out.println(" Here we have disc brake");
    }

    @Override
    public void stearing() {
        System.out.println("it is in round");
    }
}
