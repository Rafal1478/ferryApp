package pl.exercise.ferry.basket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Writer {

    public String getId() {
        return id;
    }

    String id;
    final String path = "C:\\Users\\rnwk\\Desktop\\Writer\\";

    public Writer() throws IOException {
    }
    public File createFile(){
        id = String.valueOf(new Date().getTime());
        String newPath = path + id + ".txt";
        return  new File(newPath);
    }


}
