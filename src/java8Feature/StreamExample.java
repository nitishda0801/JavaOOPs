package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<Boolean,List<Integer>> map = numbers
                .stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(map);

        List<String> name = Arrays.asList("diksha", "rahul", "amit", "deepesh", "neha", "priya", "deepak");

        List<String> res = name.stream().filter(s->s.startsWith("d"))
                        .map(String::toUpperCase)
                                .sorted().collect(Collectors.toList());
        System.out.println(res);
        List<String> sortedName = name.stream().sorted().toList();
        System.out.println(sortedName);


    }
}
