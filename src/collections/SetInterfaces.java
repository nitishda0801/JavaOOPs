package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetInterfaces {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(10);
        set.add("nitish");
        set.add(10.3);
        System.out.println(set);
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(set.contains("nitish"));

        TreeSet treeSet = new TreeSet(); //stores same data-type or Homogeneous type data

        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(2);
//        treeSet.add("name");// stores same data type only
//        treeSet.add(null); can't store null values, it compares each value internally to store in sorted order
        System.out.println(treeSet);

    }
}
