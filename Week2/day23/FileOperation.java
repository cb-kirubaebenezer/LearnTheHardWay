package day23;
import util.*;
import java.util.*;


import java.io.*;
public class FileOperation{
    public void doFileOperation(){
       String dirName = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay";
       printFileWithExtensions(listFiles(dirName, new ArrayList<File>()));
    }
    private void printFileWithExtensions(ArrayList<File> files){
        try {
            ArrayList<String> extensions = new ArrayList<String>();
            HashMap<String,LinkedList<String> > extCount = new HashMap<String, LinkedList<String> >();
            for (File file : files) {
                String ext = file.getAbsolutePath().split("\\.")[file.getAbsolutePath().split("\\.").length - 1];
                if(extensions.contains(ext)){
                    extCount.get(ext).add(file.getAbsolutePath());;
                }else{
                    extensions.add(ext);
                    LinkedList<String> filePath = new LinkedList<String>();
                    filePath.add(file.getAbsolutePath());
                    extCount.put(ext, filePath);
                }
            }
            Util.print("Printing all the extensions of the file");
            for (String ext : extensions) {
                Util.print(ext);
            }
            Util.print("Printing all the files with the extensions.");
            for (Map.Entry rEntry : extCount.entrySet()) {
                Util.print(rEntry.getKey().toString());
                Util.print(rEntry.getValue().toString());
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        
    }
    private ArrayList<File> listFiles(String directoryName, ArrayList<File> files) {
        File directory = new File(directoryName);
        // Get all the files from a directory.
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                listFiles(file.getPath(), files);
            }
        }
        return files;
    }
    
}