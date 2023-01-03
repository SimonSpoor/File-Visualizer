import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;


public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<File> files = new ArrayList<File>();

        files.add(new file("test2", "test2").getFile());
        System.out.println(files.toString());


        new fileGroup("group");
        new fileGroup("group2", files);

        
    }    
}