package stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;

    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class StreamFilterDemo4 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"HP",20000));
        productList.add(new Product(2,"Lenova",22000));
        productList.add(new Product(3,"Sony",24000));
        productList.add(new Product(4,"Acer",21000));
        productList.add(new Product(5,"Apple",25000));

        productList.stream()
                .filter(prdt -> prdt.price > 22000)
                .forEach(pr -> System.out.println(pr.name));
    }
}
