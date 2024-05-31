package com.explorejava.streams;import com.explorejava.model.Product;import java.util.ArrayList;import java.util.List;import java.util.stream.Collectors;public class StreamsFilterExamples {    public static void main(String[] args) {        //filter implementation        List<Product> resultList = getProducts().stream().filter((product) -> product.getPrice() > 25000f).collect(Collectors.toList());        resultList.forEach(System.out::println);        System.out.println("*******************");        //alternative method using filter        getProducts().stream().filter((product -> product.getPrice() > 25000f)).forEach(System.out::println);    }    private static List<Product> getProducts() {        List<Product> prodList = new ArrayList<Product>();        prodList.add(new Product(1, "HPLaptop", 25000f));        prodList.add(new Product(2, "Dell Laptop", 30000f));        prodList.add(new Product(3, "Azus Laptop", 18000f));        prodList.add(new Product(4, "Lenova Laptop", 35000f));        prodList.add(new Product(5, "Apple Laptop", 50000f));        return prodList;    }}