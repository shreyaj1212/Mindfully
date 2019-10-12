package com.example.codeabode;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * @author Shreya Jain
 */

public class Registration {

    public static void main(String[] args) {
        Scanner input = createScanner("../../../../app/src/main/res/");

    }

    private static void getEmail(Scanner input) {

    }

    public static Scanner createScanner(String inPath1) {
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


}
