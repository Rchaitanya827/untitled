package org.example.java8;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class SecondHighestSalaryEmpFromDept {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee("chaitanya","CP",500),
                new Employee("avinash","PT",700),
                new Employee("akshay","PT",300),
        new Employee("vitthal","CP",400)
        );

        /*Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy
                (Employee::getDept, Collectors.reducing
                        (BinaryOperator.maxBy
                                (Comparator.comparing(Employee::getSalary)))));


      *//*  Employee employee=employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1).findFirst().get();
        System.out.println("second higest salary employee"+employee.toString());
*//*

        employees.stream().filter((s)-> s.getDept().contains("P"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1).findFirst();


        Map<String, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDept));*/


        employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.reducing
                        (BinaryOperator.maxBy
                                (Comparator.comparing(Employee::getSalary)))));
    }


}
