package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 8, 9, 6, 3, 5);
        //print no greter than 4
        l.stream().filter((t) -> t > 4).collect(Collectors.toList())
                .stream().forEach(System.out::println);
        System.out.println("sorted list ++++++++++++++++++++++++++++++++++++++++++===");

        l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        int i=l.stream().sorted(Comparator.reverseOrder())
                .skip(2).
                findFirst().get();
        System.out.println("second hight number is :: "+i);
    }
}
