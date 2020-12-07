package pl.edu.uwm.obiektowe.s156031.kolo2;

public interface IMozeCofac {
    default void cofaj(){
        System.out.println("Uwaga, cofam...");
    }
}
