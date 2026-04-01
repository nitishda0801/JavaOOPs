package streamAPICodingQuestions;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,9,3,4,5,2,5,7,8,6,9,5,3);
        System.out.println(list);
        //Method 1--> O(N*N) time
        List<Integer> res = list.stream()
                .filter(i-> Collections.frequency(list,i)>1).distinct()
                .collect(Collectors.toList());
        System.out.println(res);

        //Method 2, taking extra space
        Set<Integer> set = new HashSet<>();
        List<Integer> res1 = list.stream()
                        .filter(i->!set.add(i)).distinct()
                                .toList();
        System.out.println(res1);

        // Method 3
        List<Integer> res2 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey).toList();
        System.out.println(res2);

        List<Integer> res3 = list.stream().sorted()
                .toList();
        System.out.println(res3);
        List<Integer> res4 = list.stream().sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Descending Order"+ res4);

        List<Integer> l = list.stream().distinct().toList();
        System.out.println(l);
        int sum = list.stream().mapToInt(n -> n).sum();

        List<Integer> even2 = list.stream().filter(n->n%2==0).map(n->n*2).toList();
        System.out.println(even2);
    }
}
