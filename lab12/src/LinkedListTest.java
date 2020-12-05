import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> listaLiczb = new LinkedList<>();
        ListIterator<Integer> iterLiczb = listaLiczb.listIterator();
        iterLiczb.add(0);
        iterLiczb.add(1);
        iterLiczb.add(2);
        iterLiczb.add(3);
        iterLiczb.add(4);
        iterLiczb.add(5);
        iterLiczb.add(6);
        iterLiczb.add(7);
        LinkedList<String> lista1 = new LinkedList<>();
        ListIterator<String> iter = lista1.listIterator();
        iter.add("Ala ");
        iter.add("i ");
        iter.add("Adam ");
        iter.add("maja ");
        iter.add("kota ");
        iter.add("rudego ");
        iter.add("i ");
        iter.add("bialego ");
//        LinkedListUtil.print(lista1);
        LinkedListUtil.redukuj(lista1,2);
        System.out.println("zredukowana lista :\n"+lista1);
//        LinkedListUtil.print(listaLiczb);
        LinkedListUtil.redukuj(listaLiczb,3);
        System.out.println("zredukowana lista liczb: \n"+listaLiczb);
        LinkedListUtil.odwroc(listaLiczb);
        System.out.println("Odwrócona lista liczb: \n"+listaLiczb);
        LinkedListUtil.odwroc(lista1);
        System.out.println("Odwrócona lista: \n"+lista1);
//        LinkedListUtil.odwrocZdanie();
//        LinkedListUtil.wypiszLiczbe();
//        LinkedListUtil.eratostenes();
    }
}
