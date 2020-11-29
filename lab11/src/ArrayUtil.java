import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> o){
        ArrayList<T> copyTemp = new ArrayList<>(o);
        Collections.sort(copyTemp);
        return o.equals(copyTemp);
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T>tab, T o) {
        int index = -1;
        int first =0;
        int last = tab.size()-1;
        int mid;
        while (first <= last) {
            mid = (first + last) / 2;
            if (tab.get(mid).compareTo(o) < 0) {
                first = mid + 1;//
            } else if (tab.get(mid).compareTo(o) > 0) {
                last = mid - 1;
            } else if (tab.get(mid).compareTo(o)== 0) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab){
        for (int i = 0; i < tab.size()-1 ; i++) {
            int index =i;
            for (int j = i+1; j < tab.size(); j++) {
                if(tab.get(j).compareTo(tab.get(index)) < 0){
                    index = j;
                }
            }
            T theSmallerOne = tab.get(index);
            tab.set(index,tab.get(i));
            tab.set(i, theSmallerOne);
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> tab){
        System.out.println("work in progress!");
    }

}
