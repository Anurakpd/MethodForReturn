package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataClass {
    Properties properties;

    public DataClass() throws IOException {

// 1.  Properties ---> object ---> property file

         properties = new Properties();

//2. FileInputStream ---> object ---> (inside this) specify the path

        FileInputStream fis = new FileInputStream("src/PropertyFiles/datamanagment.properties");

//3. property ---> load the object of fileinputstream

        properties.load(fis);

    }
    public String getProperties(String data){

        return  properties.getProperty(data);

    }

}
