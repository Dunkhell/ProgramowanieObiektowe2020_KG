package com.kacpergruszczynski;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface IntSequence {

     static IntSequence of (int... integers) {
        return new IntSequence(){
            private int pointer = 0;
            private final int[] arrayToReturn = Arrays.stream(integers).toArray();

            @Override
            public boolean hasNext() {
                return arrayToReturn.length > pointer;
            }

            @Override
            public int next() {
                return arrayToReturn[pointer++];
            }
        };

    }

    static Stream<Integer> constant(int i){
        UnaryOperator<Integer> streamOfI = a -> a = i;
        return Stream
                .iterate(i, streamOfI);
    }


    boolean hasNext();
    int next();
}
