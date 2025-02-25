package com.juaracoding;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int result = 100/0;
            System.out.println(result);
        } catch (Exception e) {

            //ketika development
            e.printStackTrace();
            //Membuat info Error ketika prod
            //System.err.println("Error 500");
        }

        System.out.println("Next Statement");

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
