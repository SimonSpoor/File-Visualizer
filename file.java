import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file{
    String name;
    String content;
    File file;

    public File getFile()           {return file;}
    public void setFile(File file)  {this.file = file;}

    public String getName()           {return name;}
    public void setName(String name)  {this.name = name;}


    public file(String name) throws IOException{
        file = new File(name + ".txt");
        try (FileWriter writer = new FileWriter(name + ".txt")) {}
    }

    public file(String name, String content) throws IOException{
        file = new File(name + ".txt");
        try (FileWriter writer = new FileWriter(name + ".txt")) {
            writer.write(content);
        }
  
    }

}