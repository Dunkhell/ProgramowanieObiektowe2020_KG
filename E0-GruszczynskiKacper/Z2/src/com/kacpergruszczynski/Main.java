package com.kacpergruszczynski;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        IntSequence intSequence = IntSequence.of(1,2,3,4,5,6);

        while(intSequence.hasNext()) {
            System.out.println(intSequence.next());
        }

        Stream<Integer> infiniteStream = IntSequence.constant(10);
        infiniteStream
                .limit(5)
                .forEach(System.out::println);
    }
}
