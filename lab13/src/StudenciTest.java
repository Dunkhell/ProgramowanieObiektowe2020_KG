import java.util.*;

public class StudenciTest {
    public static void main(String[] args) {
        StudentMap students = new StudentMap();
        students.add(new Studenci("Carl","db+"));
        students.add(new Studenci("Joe","db"));
        students.add(new Studenci("Susan","bdb"));
        students.add(new Studenci("Adam","dost"));
        students.add(new Studenci("Wozniak","dop+"));
        System.out.println(students);
        students.remove("Joe");
        students.remove("Adam");
        System.out.println(students);
        students.changeGrade("Wozniak","dost");
        System.out.println(students.getGrade("Wozniak"));
    }
}
