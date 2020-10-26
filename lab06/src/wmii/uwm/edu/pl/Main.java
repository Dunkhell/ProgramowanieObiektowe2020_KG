package wmii.uwm.edu.pl;

public class Main {

    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver1.wypiszSaldo();
        saver2.obliczMiesieczneOdsetki();
        saver2.wypiszSaldo();
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        saver1.wypiszSaldo();
        saver2.wypiszSaldo();



        IntegerSet setA = new IntegerSet();
        IntegerSet setB = new IntegerSet();
        setA.instertElement(1);
        setA.instertElement(2);
        setA.instertElement(3);
        setB.instertElement(4);
        setB.instertElement(2);
        setB.instertElement(3);
        System.out.println("Zbiór A:");
        System.out.println(setA);
        System.out.println("Zbiór B:");
        System.out.println(setB);
        System.out.println("Union on setA setB");
        System.out.println(IntegerSet.union(setA,setB));
        System.out.println("Intersection on setA setB");
        System.out.println(IntegerSet.intersection(setA,setB));
        setA.deleteElement(1);
        setB.deleteElement(2);
        System.out.println("Zbiór A:");
        System.out.println(setA);
        System.out.println("Zbiór B:");
        System.out.println(setB);
        IntegerSet setAcopy = new IntegerSet();
        setAcopy.instertElement(2);
        setAcopy.instertElement(3);
        System.out.println("SetA equal to setB: ");
        System.out.println(setA.equals(setB));
        System.out.println("setA equal to setAcopy: ");
        System.out.println(setA.equals(setAcopy));
    }
}
