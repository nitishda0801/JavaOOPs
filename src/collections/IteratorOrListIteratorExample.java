package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorOrListIteratorExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("nitish");
        list.add(10);
        list.add(10.7);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ListIterator litr = list.listIterator();
        while ((litr.hasNext())){
            System.out.println(litr.next());
        }

        System.out.println("Reverse Order: ");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        litr.set(90);

        while ((litr.hasNext())){

            System.out.println(litr.next());
        }
    }
}
