package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

       //create

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple"); //allow duplicates

        //read
        System.out.println("List : "+ list);

        //update
        list.set(0,"orange");

        System.out.println("After update : "+ list);

        //Delete
        list.remove("apple");

        System.out.println("After deletion : "+ list);

    }
}
