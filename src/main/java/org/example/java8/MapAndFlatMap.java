package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        User user=new User("chaitanya","8806569671", Arrays.asList("abc","nkk"));
        User user1=new User("akshay","9763172955",Arrays.asList("fgh","dfghj"));
        List<User> l=Arrays.asList(user,user1);
        l.stream().map((s)->"first Name "+s.getName()).collect(Collectors.toList())
                .forEach(System.out::println);
        l.stream().flatMap((s)->s.getEmail().stream()).forEach(System.out::println);
    }
}
