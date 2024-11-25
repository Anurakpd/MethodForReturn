package Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // ---> super class
        Dog d1 = new Dog();
        Cat c1 = new Cat();


        StimulatorClass.ansim(d1);
        StimulatorClass.ansim(c1);


    }
}
