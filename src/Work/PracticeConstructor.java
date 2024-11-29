package Work;

public class PracticeConstructor {

    String School;
    String Location;
    public PracticeConstructor(String School, String Location){
        this.School=School;
        this.Location=Location;
    }

    public static void main(String[] args) {
        PracticeConstructor PC=new PracticeConstructor("S.S.Bharti","Navsari");
        System.out.println(PC.School +" "+ PC.Location);
        // System.out.println(PC.Location);

    }

}
