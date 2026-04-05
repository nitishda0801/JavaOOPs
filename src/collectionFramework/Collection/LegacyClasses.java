package collectionFramework.Collection;

import java.util.Stack;
import java.util.Vector;

public class LegacyClasses {// introduced in Java 1.0 version
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(1);
        v.add("nitish");
        v.add(19.45);
        System.out.println(v);

        Stack s = new Stack();
        s.push("nitis");
        s.push(11);
        s.push(10.2);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search(11));
    }
}
