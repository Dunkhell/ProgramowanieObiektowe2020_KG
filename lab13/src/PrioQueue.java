import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrioQueue {
//    private static PriorityQueue<Tasks> zadania;
//
//
//    public PrioQueue(){
//        zadania = new PriorityQueue<>();
//    }
//
//    public static void dodaj(String opis, double Prio){
//        Tasks newTask = new Tasks(opis,Prio);
//        zadania.add(newTask);
//    }
//
//    public static void nastepne(){
//        System.out.println(zadania.remove());
//    }
    public static void main(String[] args) {
        PriorityQueue<Tasks> zadania = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        String toDo;
        String opis;
        double prio;
        while(true){
            System.out.println("Czy chcesz wpisać nowe zadanie? TAK|NIE");
            toDo = in.nextLine();
            while(toDo.equals("TAK")|| toDo.equals("tak")) {
                System.out.println("podaj opis zadania: ");
                opis = in.nextLine();
                System.out.println("Podaj priorytet tego zadania: ");
                prio = in.nextDouble();
                Tasks zadanie = new Tasks(opis, prio);
                zadania.add(zadanie);
                toDo = in.nextLine();
            }
            if (toDo.equals("NIE") || toDo.equals("nie"))
                break;
        }
        while(!zadania.isEmpty()){
            System.out.println(zadania.remove());
        }
    }
}
