package PropertyFiles;

import java.io.IOException;

public class HussainClass {
    public static void main(String[] args) throws IOException {
        DataClass obj = new DataClass();
       String a = obj.getProperties("number");
        System.out.println(a);
    }
}
