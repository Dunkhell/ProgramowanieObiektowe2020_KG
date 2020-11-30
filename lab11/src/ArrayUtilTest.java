import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(2);
        lista.add(3);
        lista.add(9);
        System.out.println(ArrayUtil.isSorted(lista));
        Collections.sort(lista);
        System.out.println(ArrayUtil.isSorted(lista));


        ArrayList<LocalDate> listaDat = new ArrayList<>();
        listaDat.add(LocalDate.of(2020,10,12));
        listaDat.add(LocalDate.of(2010,9,2));
        listaDat.add(LocalDate.of(2002,9,3));
        listaDat.add(LocalDate.of(2000,5,12));
        System.out.println(ArrayUtil.isSorted(listaDat));
        Collections.sort(listaDat);
        System.out.println(ArrayUtil.isSorted(listaDat));


        int o=22;
        System.out.println(lista.get(2).compareTo(o));

        System.out.println("Array we're looking into: ");
        for (Integer e : lista){
            System.out.println(e);
        }
        System.out.println("Element we're going to be looking for: "+ o+"\nThe element has been found at index: "+ ArrayUtil.binSearch(lista, o));


        Collections.sort(listaDat);
        LocalDate d = LocalDate.of(2020,10,12);
        System.out.println("Date array we're looking into: ");
        for (LocalDate e : listaDat){
            System.out.println(e);
        }
        System.out.println("Element we're going to be looking for: "+d+"\nThe elemnt has been found at index:  "+ArrayUtil.binSearch(listaDat,d));


        ArrayList<Integer> testSortList = new ArrayList<>();
        testSortList.add(15);
        testSortList.add(2);
        testSortList.add(44);
        testSortList.add(3);
        testSortList.add(10);
        System.out.println("Before sorting: ");
        for (Integer e: testSortList)
        {
            System.out.println(e+" ");
        }
        ArrayUtil.selectionSort(testSortList);
        System.out.println("After sorting: ");
        for (Integer e: testSortList){
            System.out.println(e+" ");
        }
        
        
        ArrayList<Integer> testMergeSort = new ArrayList<>();
        testMergeSort.add(22);
        testMergeSort.add(2);
        testMergeSort.add(4);
        testMergeSort.add(5);
        testMergeSort.add(154);
        testMergeSort.add(15);
        testMergeSort.add(21);
        testMergeSort.add(2);
        testMergeSort.add(9);
        ArrayUtil.mergeSort(testMergeSort);
        System.out.println("MergeSort algorithm: ");
        for (Integer e: testMergeSort){
            System.out.println(e);
        }
    }
}
