import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class StudentMap implements Comparable<StudentMap>{
    HashMap<String, String> students= new HashMap<>();


    public StudentMap(){
    }

    public void add(Studenci o){
        students.put(o.getName(),o.getGrade());
    }

    public void remove(String name){
        this.students.remove(name);
    }

    public void changeGrade(String name,String grade){
        this.students.replace(name,grade);
    }

    public String getGrade(String name){
        return students.get(name);
    }

    @Override
    public String toString(){
        StringBuilder stringReturn = new StringBuilder();
        final List<String> allKeys = new ArrayList<>(students.keySet());
        final String separator = ": ";
        Collections.sort(allKeys);
        for (final String key: allKeys){
            final String value = students.get(key)+"\n";
            stringReturn.append(key);
            stringReturn.append(separator);
            stringReturn.append(value);

        }
        return stringReturn.toString();
    }

    @Override
    public boolean equals(Object o){
        if ( o instanceof StudentMap) return this.compareTo((StudentMap) o)==0;
        return false;
    }

    @Override
    public int compareTo(StudentMap o){
        return this.hashCode()-o.hashCode();
    }

    @Override
    public int hashCode(){
        return getKeyValue(this.students).hashCode();
    }

    private static String getKeyValue(final Map<String, String> map){
        final StringBuilder KeyValuePair = new StringBuilder();

        final String KeyValueSeparator = "=";
        final String listSeparator = "^";

        if (map != null){
            final List<String> allKeys = new ArrayList<>(map.keySet());
            Collections.sort(allKeys);

            for (final String key: allKeys){
                final String value = map.get(key);
                KeyValuePair.append(listSeparator);
                KeyValuePair.append(key);
                KeyValuePair.append(KeyValueSeparator);
                KeyValuePair.append(null == value?"": value);
            }
        }
        return 0 == KeyValuePair.length() ? "" : KeyValuePair.substring(listSeparator.length());
    }

}
