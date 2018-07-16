package com.chargebee.app.week2.day23.fileoperation;
import com.chargebee.app.week2.util.*;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileOperation {
    private static final String DIRECTORY_NAME = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay";
    private static final String MOVE_FROM_FOLDER_PATH = "/Users/cb-kiruba/Documents/GitHub/Example3";
    private static final String MOVE_TO_FOLDER_PATH = "/Users/cb-kiruba/Documents/GitHub/Example3";
    private static final String COUNT_ALL_WORDS_INPUT_FILE_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/sample.txt";
    private static final String COUNT_ALL_WORDS_OUTPUT_FILE_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/out.txt";
    private static final String SEARCH_COUNT_INPUT_FILE_PATH = "/Users/cb-kiruba/Documents/GitHub/LearnTheHardWay/sample.txt";
    public void doFileOperation() {
        try {
            
            printFileWithExtensions(listFiles(DIRECTORY_NAME, new ArrayList<File>()));
           
            move(new File(MOVE_FROM_FOLDER_PATH), new
            File(MOVE_TO_FOLDER_PATH));
            
            countAllWordsToAFile(new
            File(COUNT_ALL_WORDS_INPUT_FILE_PATH),
            COUNT_ALL_WORDS_OUTPUT_FILE_PATH);
           
            searchCount(new File(SEARCH_COUNT_INPUT_FILE_PATH), "Lorem");
            
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }

    private void printFileWithExtensions(ArrayList<File> files) {
        try {
            ArrayList<String> extensions = new ArrayList<String>();
            HashMap<String, LinkedList<String>> extCount = new HashMap<String, LinkedList<String>>();
            for (File file : files) {
                String ext = file.getAbsolutePath().split("\\.")[file.getAbsolutePath().split("\\.").length - 1];
                if (extensions.contains(ext)) {
                    extCount.get(ext).add(file.getAbsolutePath());
                    ;
                } else {
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
        try {
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
        } catch (Exception e) {
            Util.print(e.getMessage());
        }

        return files;
    }

    private boolean move(File sourceFile, File destFile) {
        try {
            Files.move(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.ATOMIC_MOVE);
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        return false;
    }

    private void countAllWordsToAFile(File file, String outFile) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] word = line.split("\\s+");
                for (String w : word) {
                    if (words.containsKey(w)) {
                        words.put(w, words.get(w) + 1);
                    } else {
                        words.put(w, 1);
                    }
                }
            }
            FileWriter fstream;
            BufferedWriter out;

            fstream = new FileWriter(outFile);
            out = new BufferedWriter(fstream);
            for (Map.Entry rEntry : words.entrySet()) {
                out.write(rEntry.getKey().toString() + " - " + rEntry.getValue().toString() + "\n");
            }
            out.close();
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }

    public static int searchCount(File file, String fileWord) {
        int count = 0;
        try {
            fileWord = fileWord.trim();
            Scanner scanner = new Scanner(file);
            int lineCount = 1;
            while (scanner.hasNextLine()) {
                String nextWord = scanner.nextLine().trim();
                if (nextWord.contains(fileWord)) {
                    Util.print("Word " + fileWord + " found at line " + String.valueOf(lineCount) + " positioning at "
                            + String.valueOf(nextWord.indexOf(fileWord)));
                }
                lineCount++;
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        return count;
    }
}