package streamAPICodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        double ans = list.stream().filter(n-> n%2==0).collect(Collectors.averagingInt(n->n));

        double averageEven = list.stream().filter(n->n%2==0).mapToInt(n->n).average().orElse(0.0);

        System.out.println(ans);
        System.out.println(averageEven);

        Map<Boolean,Double> average = list.stream().collect(Collectors.partitioningBy(n -> n%2 == 0,Collectors.averagingInt(n->n)));
        System.out.println(average);

        Map<Boolean,List<Integer>> oddEven = list.stream().collect(Collectors.partitioningBy(n -> n%2 == 0,Collectors.toList()));

        System.out.println(oddEven);





    }
}
