package com.kacpergruszczynski;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> findFilesExtension = findFilesWithExtension(
                "E:\\UWM\\semestr III\\Programowanie Obiektowe\\ZadaniaPO\\lab13\\src","java");
        findFilesExtension.forEach(System.out::println);

    }

    public static List<String> findFilesWithExtension(String path, String extension) {
        File mainCatalog = new File(path);
        String[] filesInside = mainCatalog.list();
        assert filesInside != null;
        return Stream.of(filesInside)
                .filter(s -> s.endsWith(extension))
                .collect(Collectors.toList());
    }

}
