public class StudentsIDTest {
    public static void main(String[] args) {
        StudentMapID students = new StudentMapID();
        students.add(new StudenciID("Adam","Nowak",156031),"bdb");
        students.add(new StudenciID("Ewa","Kowalska",221345),"dop");
        students.add(new StudenciID("Joe","Smith",122022),"db");
        students.add(new StudenciID("Carl","Wozniak",146032),"dop");
        students.add(new StudenciID("James","Adobe",154022),"dst+");
        students.add(new StudenciID("Anne","Adobe",245052),"dop+");
        students.add(new StudenciID("Anne","Adobe",218802),"dop+");
        System.out.println(students);
        students.changeGrade(156031,"db-");
        students.changeGrade(122022,"dst+");
        System.out.println(students.getGrade(156031));
        System.out.println(students.getGrade(122022));
        System.out.println(students);
        students.remove(146032);
        System.out.println(students);
    }
}
