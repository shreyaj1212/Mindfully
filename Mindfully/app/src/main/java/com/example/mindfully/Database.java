package com.example.codeabode;

import java.util.Scanner;
import java.io.*;

public class Database {

    public static void createNewPerson(String name) {
        createFile("persons/"+name+".txt");
    }

    private static Scanner createScanner(String inPath1) {
        Scanner input = null;
        File file1 = new File(inPath1);
        try {
            input = new Scanner(file1);
        }
        catch(FileNotFoundException ex) {
            System.out.println("Cannot open Input 1 file. Sorry :(");
            System.exit(1);
        }
        return input;
    }

    private static PrintWriter createPW(String outPath) {
        File output = new File(outPath);
        PrintWriter outputter = null;
        try {
            outputter = new PrintWriter(output);
        }
        catch (FileNotFoundException ex) {
            System.out.println("Cannot find file at " + outPath);
            System.exit(1);
        }
        return outputter;
    }

    public static void main(String[] args) {
        createNewPerson("Cannon");
        addEmotionToPerson("Cannon", "anger", "1570901375");
    }

    public static void createFile(String path) {
        File output = new File(path);
        PrintWriter outputter = null;
        try{
            if(output.createNewFile()) System.out.println("Created new file successfully");
            else System.out.println("File already exists");
        }
        catch(IOException ex) {
            System.out.println("IOEXCEPTION ERROR");
        }
    }

    public static void addEmotionToPerson(String name, String emotion, String datetime) {
        PrintWriter writer = createPW("persons/"+name+".txt");
        writer.println(emotion + "-" + datetime);
    }

    public static ArrayList<String> getEmotionList(String person) {
        Scanner file = createScanner("persons/"+person+".txt");
        ArrayList<String> emotions = new ArrayList<String>();
        String line;
        while(file.hasNextLine()) {
            line = file.nextLine();
            emotions.add(line.substring(0, line.indexOf("-")));
        }
        return emotions;
    }
}