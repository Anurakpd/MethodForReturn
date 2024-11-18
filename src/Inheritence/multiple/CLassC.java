package Inheritence.multiple;

public class CLassC implements interfaceA,inerfaceB {

  public void method1(){
      System.out.println(" this is method1");
  }
    public void mathod2(){
        System.out.println(" this is method2");
    }

    public static void main(String[] args) {
        CLassC obj = new CLassC();
        obj.mathod2();
        obj.method1();
    }
}
