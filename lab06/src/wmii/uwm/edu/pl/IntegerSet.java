package wmii.uwm.edu.pl;

public class IntegerSet {
    private final boolean[] tablica;

    public IntegerSet(){
        this.tablica= new boolean[100];
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet nowaTablica = new IntegerSet();
        for (int i=0;i<100;i++){
            if (a.tablica[i] || b.tablica[i]){
                nowaTablica.tablica[i]= true;
            }
        }
        return nowaTablica;
    }
    public static IntegerSet intersection (IntegerSet a, IntegerSet b){
        IntegerSet nowaTablica = new IntegerSet();
        for (int i=0;i<100;i++){
            if (a.tablica[i] && b.tablica[i]){
                nowaTablica.tablica[i]= true;
            }
        }
        return nowaTablica;
    }
    public void instertElement(int a){
        this.tablica[a-1]=true;
    }
    public void deleteElement(int a){
        this.tablica[a-1]=false;
    }
    public String toString(){
        StringBuilder odp = new StringBuilder();
        for (int i=0;i<100;i++){
            if (this.tablica[i])
                odp.append(i+1).append(" ");
        }
        return odp.toString();
    }
    public boolean equals(IntegerSet a){
        for (int i = 0; i < 100; i++) {
            if (this.tablica[i] != a.tablica[i])
                return false;
        }
        return true;
    }
}
