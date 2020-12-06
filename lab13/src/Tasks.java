import java.util.Objects;

public class Tasks implements Comparable<Tasks>{
    private String name;
    private double importance;

    public Tasks(String nName, double nImportance){
        this.name=nName;
        this.importance=nImportance;
    }

    public String getName(){
        return this.name;
    }

    public double getImportance(){
        return this.importance;
    }

    public void setName(String nName){
        this.name=nName;
    }

    public void setImportance(double nImportance){
        this.importance=nImportance;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks task = (Tasks) o;
        return Double.compare(task.importance,importance) == 0 &&
                Objects.equals(name, task.name);
    }

    @Override
    public int compareTo(Tasks o){
        int result = 0;
        if(Double.compare(this.getImportance(),o.getImportance())>0)
            result = -1;
        if(Double.compare(this.getImportance(),o.getImportance())<0)
            result = 1;
        return result;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,importance);
    }

    @Override
    public String toString(){
        return "Task "+name+" of importance: "+importance;
    }
}
