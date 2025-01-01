package stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Sachin");
        nameList.add("Sanju Samson");
        nameList.add("Virat Kohli");
        nameList.add("Rohit Sharma");

        nameList.stream().filter(n->n.length()>5&&n.length()<10).forEach(System.out::println);


        System.out.println("Sample 1");
        System.out.println("Sample 2");
        System.out.println("Sample 3");

        System.out.println("Addded by x");

    }
}
