package com.kacpegruszcznski;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Employee implements Measurable{
    private final String name;
    private final double payCheck;

    public Employee(String name, double payCheck) {
        this.name = name;
        this.payCheck = payCheck;
    }

    public String getName() {
        return name;
    }

    public double getPayCheck() {
        return payCheck;
    }

    public static double average(Measurable[] objects) {
        Stream<Measurable> employeePayCheck = Arrays.stream(objects);
        return employeePayCheck
                .mapToDouble(Measurable::getMeasure)
                .average()
                .orElse(0.0);
    }

    public static Measurable largest (Measurable[] objects) {
        Stream<Measurable> employeeStream = Arrays.stream(objects);
        return employeeStream
                .map(Employee.class::cast)
                .max(Comparator.comparing(Employee::getPayCheck))
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public double getMeasure() {
        return payCheck;
    }
}
