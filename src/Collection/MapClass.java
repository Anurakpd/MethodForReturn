package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"anura");
        map.put(2,"Hussain");
        map.put(3,"Himanshi");

        System.out.println(" Map : "+ map);

        map.put(2,"Pujan");
        System.out.println(" After update : "+ map);

        map.remove(1);
        System.out.println(" After deletion : "+ map);
    }
}
