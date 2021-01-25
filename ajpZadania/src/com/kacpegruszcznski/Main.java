package com.kacpegruszcznski;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        Employee john = new Employee("John", 2000);
        Employee ela = new Employee("Ela", 10000);
        Employee tim = new Employee("Tim", 1000);
        Employee garry = new Employee("Garry", 35000);
        Employee howard = new Employee("Howard", 2400);

        Employee[] employees = new Employee[5];
        employees[0]= john;
        employees[1]= ela;
        employees[2]= tim;
        employees[3]= garry;
        employees[4]= howard;

//        System.out.println("Average payCheck of employees in array employees is " + Employee.average(employees));
//        System.out.println("Max payCheck of employees in array employees is "+ ((Employee)Employee.largest(employees)).getName());

//        String aString = "That's a string superclass || ";
//        System.out.println(aString+aString.getClass().getSuperclass());
//        Scanner in = new Scanner(System.in);
//        System.out.println("That's a scanner superclass || "+in.getClass().getSuperclass());
//        ImageOutputStream ios = new FileImageOutputStream(new File("C:/niematakiego"));
//        System.out.println("That's an ImageOutputStream superclass || " +ios.getClass().getSuperclass());

//        Greeter greeter = new Greeter(10,"Kacper");
//        greeter.run();

//        int[] intSequence = IntSequence.of(1,2,3,4,5,6);
//        for (int i: intSequence) {
//            System.out.println(i);
//        }

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(4);
//        arrayList.add(2);
//        arrayList.add(5);
//        arrayList.add(3);

//        luckySort(arrayList, Integer::compareTo);
//        printList(arrayList);

//        Stream<Integer> infiniteStream = IntSequence.constant(10);
//        infiniteStream
//                .limit(5)
//                .forEach(System.out::println);

//        List<String> findCatalogs = findCatalogs("E:\\UWM\\semestr III\\Programowanie Obiektowe\\ZadaniaPO");
//        findCatalogs.forEach(System.out::println);

//        System.out.println("===============================================");
//        List<String> findFilesExtension = findFilesWithExtension("E:\\UWM\\semestr III\\Programowanie Obiektowe\\ZadaniaPO\\JavaProgrammingMC\\LambdaChallenges\\src\\com\\kacpegruszcznski","java");
//        findFilesExtension.forEach(System.out::println);

        File file = new File("C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2020.3.1\\bin");
        List<String> filesWithExe = findFilesWithExtension(file.getPath(),"exe");
        List<String> filesWithJava = findFilesWithExtension(file.getPath(),"bat");
        System.out.println("FILES WITH BAT INSIDE "+file.getPath());
        filesWithJava.forEach(System.out::println);
        System.out.println("FILES WITH EXE INSIDE "+file.getPath());
        filesWithExe.forEach(System.out::println);



    }

    public static void runTogether( Runnable... task) {
        Arrays.stream(task).parallel().forEach(Runnable::run);
    }

    public static void runInOrder(Runnable... task) {
        Arrays.stream(task).forEach(Runnable::run);
    }

    public static List<String> findCatalogs(String path) {
        File mainCatalog = new File(path);
        File[] catalogs = mainCatalog.listFiles(File::isDirectory);
//        File[] catalogs = mainCatalog.listFiles(newFile -> newFile.isDirectory());
//        File[] catalogs = mainCatalog.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory();
//            }
//        });
        assert catalogs != null;
        return Stream.of(catalogs).map(File::getName).collect(Collectors.toList());
    }

    public static List<String> findFilesWithExtension(String path, String extension) {
        File mainCatalog = new File(path);
        String[] filesInside = mainCatalog.list();
        assert filesInside != null;
        return Stream.of(filesInside)
                .filter(s -> s.endsWith(extension))
                .collect(Collectors.toList());
    }

    public static <T>void luckySort(ArrayList<T> strings, Comparator<T> comp){
        List<T> stringSorted = new ArrayList<>(strings);
        stringSorted.sort(comp);
        int numTry = 1;
        while(!strings.equals(stringSorted)) {
            System.out.println("That was my "+numTry+" attempt at sorting the list");
            Collections.shuffle(strings);
            numTry++;
        }
        // numTry dodałem dla samego siebie
    }
}
