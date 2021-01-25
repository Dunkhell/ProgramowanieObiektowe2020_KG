package com.kacpegruszcznski;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class IntSequence {

    public static int[] of (int... integers) {
        return Arrays.stream(integers).toArray();

    }

    public static Stream<Integer> constant(int i){
        return Stream
                .iterate(i, a -> i);
    }

}
