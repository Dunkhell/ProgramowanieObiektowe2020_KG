import java.util.*;

public class StudentMapID implements Comparable<StudentMapID>{
    HashMap<StudenciID, String> students= new HashMap<>();


    public StudentMapID(){
    }

    public void add(StudenciID o,String grade){
        students.put(o, grade);
    }

    public void remove(int ID){
        final List<StudenciID> allKeys = new ArrayList<>(students.keySet());
        for (StudenciID st : allKeys){
            if (st.getID()  == ID){
                this.students.remove(st);
            }
        }
    }

    public void changeGrade(int ID ,String grade){
        final List<StudenciID> allKeys = new ArrayList<>(students.keySet());
        for (StudenciID st : allKeys){
            if (st.getID()  == ID){
                this.students.replace(st,grade);
            }
        }
    }

    public String getGrade(int ID){
        final List<StudenciID> allKeys = new ArrayList<>(students.keySet());
        for (StudenciID st : allKeys){
            if (st.getID()  == ID){
                return this.students.get(st);
            }
        }
        return "ERROR: No such student!";
    }

    @Override
    public String toString(){
        StringBuilder stringReturn = new StringBuilder();
        final List<StudenciID> allKeys = new ArrayList<>(students.keySet());
        final String separator = ": ";
        Collections.sort(allKeys);
        for (final StudenciID key: allKeys){
            final String value = students.get(key)+"\n";
            stringReturn.append(key.toString());
            stringReturn.append(separator);
            stringReturn.append(value);

        }
        return stringReturn.toString();
    }

    @Override
    public boolean equals(Object o){
        if ( o instanceof StudentMapID) return this.compareTo((StudentMapID) o)==0;
        return false;
    }

    @Override
    public int compareTo(StudentMapID o){
        return this.hashCode()-o.hashCode();
    }

    @Override
    public int hashCode(){
        return getKeyValue(this.students).hashCode();
    }

    private static String getKeyValue(final HashMap<StudenciID, String> map){
        final StringBuilder KeyValuePair = new StringBuilder();

        final String KeyValueSeparator = "=";
        final String listSeparator = "^";

        if (map != null){
            final List<StudenciID> allKeys = new ArrayList<>(map.keySet());
            Collections.sort(allKeys);

            for (final StudenciID key: allKeys){
                final String value = map.get(key);
                KeyValuePair.append(listSeparator);
                KeyValuePair.append(key.toString());
                KeyValuePair.append(KeyValueSeparator);
                KeyValuePair.append(null == value?"": value);
            }
        }
        return 0 == KeyValuePair.length() ? "" : KeyValuePair.substring(listSeparator.length());
    }

}
