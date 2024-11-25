package PropertyFiles;

import java.io.IOException;

public class AnuraClass {

    public static void main(String[] args) throws IOException {
        DataClass obj = new DataClass();
        String a = obj.getProperties("name");
        System.out.println(a);
    }
}
