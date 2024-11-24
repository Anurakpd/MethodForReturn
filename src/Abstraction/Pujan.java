package Abstraction;

public class Pujan {

    public static void main(String[] args) {
        Hussain knowledge = new Himanshi(); //---> upcasting

        knowledge.teach();
        knowledge.git();

        Hussain knowledge1 = new Anura();

        knowledge1.teach();
        knowledge1.git();
    }
}
