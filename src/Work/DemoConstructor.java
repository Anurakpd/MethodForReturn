package Work;

public class DemoConstructor {
    String Designation;
    String Salary;

    public void DemoConstructor(String Designation,String Salary){

        System.out.println("The designation is "+ Designation + " and salary is " + Salary);
    }

    public static void main(String[] args) {
        DemoConstructor obj=new DemoConstructor();
        obj.DemoConstructor("QA Specialist","1000K");
    }
}
