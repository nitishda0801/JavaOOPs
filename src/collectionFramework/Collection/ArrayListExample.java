package collectionFramework.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListExample {

    public static void main(String[] args) {

        HashSet set = new HashSet();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.add(null));

        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Asdfgh");
        list.add(10.3);
        System.out.println(set);
    }
}
