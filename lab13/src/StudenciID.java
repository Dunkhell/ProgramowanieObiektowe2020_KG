import java.util.Objects;

public class StudenciID implements Comparable<StudenciID>{

    private String name;
    private String nazwisko;
    private int ID;


    public StudenciID(String nImie, String nNazwisko, int nID){
        this.name = nImie;
        this.nazwisko=nNazwisko;
        this.ID = nID;
    }

    public String getName(){
        return this.name;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public int getID(){
        return this.ID;
    }

    public void setName(String nName){
        this.name = nName;
    }

    public void setNazwisko(String nNaziwsko){
        this.nazwisko=nNaziwsko;
    }

    public void setID(int nID){
        this.ID = nID;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        StudenciID student = (StudenciID) o;
        return Objects.equals(name,student.name) &&
                Objects.equals(nazwisko,student.nazwisko);
    }

    @Override
    public int compareTo(StudenciID o){
        int result = 0 == getNazwisko().compareTo(o.getNazwisko())? 0 : (getNazwisko().compareTo(o.getNazwisko()));
        if (result == 0){
            result = 0 == getName().compareTo(o.getName())? 0: -1*(getName().compareTo(o.getNazwisko()));
        }
        if (result == 0){
            result = Integer.compare(getID(),o.getID());
        }
        return result;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nazwisko,name,ID);
    }

    @Override
    public String toString(){
        return ID+": "+name+" "+nazwisko;
    }
}
