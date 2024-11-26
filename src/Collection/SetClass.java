package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {

        //Create
        Set<String> set = new HashSet<>();
        set.add("Math");
        set.add("Science");
        set.add("Math");

        //read
        System.out.println("Set : "+ set);

        //update
        set.remove("Science");
        set.add("History");

        System.out.println("After update : "+ set);

        //delete
        set.remove("Math");
        System.out.println("After deletion : "+ set);
    }
}
