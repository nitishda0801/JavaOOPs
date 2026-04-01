package streamAPICodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aa","Ba","Nk","Pk","Pk","Pk","Ba","Ba","Aa");
        
        Map<String, Long> res = list.stream().collect(Collectors.groupingBy(str->str, Collectors.counting()));
        System.out.println(res);
    }
}
