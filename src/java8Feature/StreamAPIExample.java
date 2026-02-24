package java8Feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,67,8,9,1);

        Stream<Integer> stream = list.stream();
        List<Integer> even = stream.filter(n->n%2==0).map(n->n*n).toList();
        System.out.println(even);
        list.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);

        List<String> names= Arrays.asList("diksha", "rahul", "amit", "deepesh", "neha", "priya", "deepak");

        List<String> sortedNames = names.stream()
                .filter(str->str.startsWith("d"))
                .map(str->str.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedNames);



    }
}
