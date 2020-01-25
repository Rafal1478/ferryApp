package pl.exercise.ferry.basket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Writer {



    final String path = "C:\\Users\\rnwk\\Desktop\\Writer\\bilety";

    public Writer() throws IOException {

    }
    public File createFile(){
        String newPath = path + new Date().getTime() + ".txt";
        return  new File(newPath);


    }


}
