package stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo1 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);
        //List<Integer> evenList=new ArrayList<>();

        List<Integer> evenList = numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);
        numberList.stream().filter(n->n%2 !=0).forEach(x-> System.out.println(x));
        //numberList.stream().filter(n->n%2 !=0).forEach(System.out::println);
        System.out.println("Sample 1");
        System.out.println("Sample 2");
        System.out.println("Sample 3");


        System.out.println("Sample 6");
        System.out.println("Sample 7");
        System.out.println("Sample 8");


    }
}
