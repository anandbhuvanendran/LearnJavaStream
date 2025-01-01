package stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamFilterDemo3 {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("book", null, "pen", null, "pencil", "rubber");

        wordList.stream().filter(w -> w != null).forEach(System.out::println);

       List<String> nullRemoved = wordList.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(nullRemoved);

        System.out.println("Sample 1");
        System.out.println("Sample 2");
        System.out.println("Sample 3");
    }
}
