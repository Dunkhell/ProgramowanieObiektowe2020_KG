package Z1;

import java.util.Arrays;

public class ArrayUtil {

    public static<T extends Comparable<? super T>> boolean isSorted (T[] array) {
        return Arrays.equals(Arrays.stream(array).sorted().toArray(), array);
    }
}
