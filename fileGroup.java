import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class fileGroup {
    //Constructors
    String name;
    ArrayList<File> fileGroup = new ArrayList<>();
    Scanner reader = new Scanner("groups.dat");


    //Getters
    public String getName()                       {return name;}
    public ArrayList<File> getFileGroup()         {return fileGroup;}
    public Scanner getReadFile()                  {return reader;}


    //Setters
    public void setFiles(ArrayList<File> filegroup)       {this.fileGroup.addAll(fileGroup);}
    public void setName (String name)                     {this.name = name;}

    //Create group
    public fileGroup(String n, ArrayList<File> files) throws IOException{
        setName(n);
        setFiles(files);

        FileWriter writer = new FileWriter(name + ".txt");
        String s = files.get(0).getName();
        System.out.println(s);
        writer.write(s);


        Object[] group = {name, fileGroup};
        System.out.println(this.getName());
    }

    public fileGroup(String n) throws IOException{
        setName(n);

        Object[] group = new Object[2];
        group[0] = name;

        FileWriter writer = new FileWriter(name + ".txt");
        writer.close();
    }

    //Add file to group
    public void addToGroup(File file){
        fileGroup.add(file);
    }
    
    //Remove file from group
    public void removeFromGroup(String n){
        for (int i = 0; i < fileGroup.size(); i++){
            if (fileGroup.get(i).getName().equals(n + "txt")){
                fileGroup.remove(i);
            }
        }
    }

    
}