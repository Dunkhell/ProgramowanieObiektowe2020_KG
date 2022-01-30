package com.kacpergruszczynski;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {

    public static<T extends Comparable<? super T>> boolean isSorted (ArrayList<T>list) {
        ArrayList<T> copyTemp = new ArrayList<>(list);
        Collections.sort(copyTemp);
        return list.equals(copyTemp);
    }
}
