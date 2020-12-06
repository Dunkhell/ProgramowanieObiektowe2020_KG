import java.util.Objects;

public class Studenci  implements Comparable<Studenci>{
    private String name;
    private String grade;

    public Studenci(String nImie, String nGrade){
        this.name = nImie;
        this.grade = nGrade;
    }

    public String getName(){
        return this.name;
    }

    public String getGrade(){
        return this.grade;
    }

    public void setName(String nName){
        this.name = nName;
    }

    public void setGrade(String nGrade){
        this.grade = nGrade;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Studenci student = (Studenci) o;
        return Objects.equals(name,student.name) &&
                Objects.equals(grade,student.grade);
    }

    @Override
    public int compareTo(Studenci o){
        int result = 0;
        if (getName().compareTo(o.getName())> 0)
            result = 1;
        if (getName().compareTo(o.getName())< 0)
            result = -1;
        return result;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,grade);
    }

    @Override
    public String toString(){
        return name+": "+grade;
    }
}
