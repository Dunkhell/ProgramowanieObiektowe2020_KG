package Z3;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File[] findFilesExtension = findFilesWithExtension(
                "E:\\UWM\\semestr III\\Programowanie Obiektowe\\ZadaniaPO\\lab13\\src","exe");
        for (File file: findFilesExtension){
            System.out.println(file.getName());
        }

    }

    public static File[] findFilesWithExtension(String path, String extension) {
        File mainCatalog = new File(path);
        return mainCatalog.listFiles((x,y)->!y.endsWith(extension));
    }

}
