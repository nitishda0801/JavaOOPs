package java8Feature;

import java.util.Optional;

public class MainAppOptional {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional nameOpt = Optional.of("Nitish");

        // Checking if value is present
        if(nameOpt.isPresent()){
            System.out.println(nameOpt.get());
        }

        // Using ifPresent()
        nameOpt.ifPresent(name-> System.out.println("Hello, "+name));

        // Optional with null value
        Optional emptyOpt = Optional.ofNullable(null);
        System.out.println(emptyOpt);
        if(emptyOpt.isPresent()){
            System.out.println(emptyOpt.get());
        }

        // Using orElse()
        Object name1  = emptyOpt.orElse("DefaultName");
        System.out.println(name1);

        // Using map() and filter()
        Optional result = nameOpt.filter(name->name.toString().startsWith("Niti"))
                .map(name->name.toString().toUpperCase());
        result.ifPresent(System.out::println);


    }
}
