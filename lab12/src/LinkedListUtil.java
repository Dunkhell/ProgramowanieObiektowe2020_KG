import java.util.*;
import java.util.function.Predicate;

public class LinkedListUtil{
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        ListIterator<T> it = pracownicy.listIterator();
        int moves = 0;
        while(it.hasNext()){
            while(moves!=n&&it.hasNext()){
                moves++;
                it.next();
            }
            if (moves==n)
                it.remove();
            moves=0;
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        for (int i = 0; i < lista.size()-1 ; i++) {
            T temp = lista.get(i);
            lista.set(i, lista.get(lista.size()-1-i));
            lista.set(lista.size()-i-1,temp);
        }
    }

    public static String capitalize(String str) {
        String sentence = str;
        StringBuilder result = new StringBuilder(sentence.length());
        boolean capitalize = true;

        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if(c == '.') {
                capitalize = true;
            }

            else if(capitalize && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                capitalize = false;
            }

            result.append(c);
        }
        return result.toString();
    }

    public static void odwrocZdanie(){
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadź swoje zdanie (oddzielone kropkom): \n");
        String zdanie = in.nextLine();
        String odwroconeZdanie = "";
        String wynik = "";
        StringBuilder oZb = new StringBuilder(odwroconeZdanie);
        StringBuilder wB = new StringBuilder(wynik);
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < zdanie.length(); i++) {
            char atI = zdanie.charAt(i);
            if (!Character.valueOf(atI).equals(' ') && !Character.valueOf(atI).equals('.')){
                if(!Character.valueOf(atI).equals(' '))
                    oZb.append(atI);
            }else{
                stack.push(oZb.toString());
                oZb.setLength(0);
            }
            if(Character.valueOf(atI).equals('.')){
                int x = stack.size();
                while(!stack.empty()) {
                    wB.append(stack.pop());
                    if(x!=1) {
                        wB.append(" ");
                        x--;
                    }
                }
                wB.append(". ");
            }
        }
        wynik = wB.toString().toLowerCase();
        wynik = capitalize(wynik);
        wynik = wynik.replaceAll(" . ",". ");
        System.out.println(wynik);
    }

    public static void wypiszLiczbe(){
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadź całkowita nieujemna liczbe: ");
        int podanaLiczba =-1;
        while(podanaLiczba<0){
            podanaLiczba = in.nextInt();
        }
        String result = Integer.toString(podanaLiczba);
        ArrayList<Integer> liczba = new ArrayList<>();
        for (int i = 0; i < (result.length()); i++) {
            char liczbaS = result.charAt(i);
            liczba.add(Character.getNumericValue(liczbaS));
        }
        for(Integer e: liczba ){
            System.out.print(e+" ");
        }
    }

    public static void eratostenes(){
        Scanner in = new Scanner(System.in);
        System.out.println("Do jakiej liczby szukać liczby pierwsze?: ");
        int n = in.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }
        Predicate<Integer> predicate = s -> s % 3==0 && s!=3;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            primes.removeIf(predicate);
            int finalI = i;
            predicate = s -> s% finalI == 0 & s!=finalI;
        }
        for (Integer e : primes){
            System.out.println(e+ " ");
        }
    }


    // DO POPRAWY BO NIE DZIAŁA :(
    public static <T extends Iterable<? super T>> void print(T[] object){
        for (T o: object){
            System.out.println(o+ ",");
        }
    }
}
