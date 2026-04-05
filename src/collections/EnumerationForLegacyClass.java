package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationForLegacyClass {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add(12.23);
        v.add("nitish");

        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
