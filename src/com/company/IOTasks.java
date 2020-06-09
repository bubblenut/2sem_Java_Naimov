package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintStream;

public class IOTasks {

    public static int fileSum(String name) throws Exception {
        Path fin = Paths.get(name);
        int sum = 0;
        try (Scanner nums = new Scanner(fin, "utf8")) {

            while (nums.hasNext()) {
                if (nums.hasNextInt()) {
                    int num = nums.nextInt();
                    sum += num;
                } else nums.next();
            }
        }
        return sum;
    }

    public static void lineWriter(String name, String[] lines) throws Exception {
        try (PrintStream writer = new PrintStream(name, "utf8")) {
            for (String line : lines) {
                writer.println(line);
            }
        }
    }

    public static void caseFixer(String namein, String nameout) throws Exception{
        Path fin = Paths.get(namein);

        boolean punct = true;
        String words = "";


        try (Scanner scan = new Scanner(fin, "utf8")){
            while(scan.hasNext()){
                String word = scan.next().toLowerCase();
                if(punct){
                    words += (Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
                }
                else {
                    words += (word + " ");
                }

                if (word.matches("([А-я]+)(\\.|\\?|!)")){
                    punct = true;
                }
                else{
                    punct = false;
                }
            }
        }
        try (PrintStream writer = new PrintStream(nameout, "utf8")){
            writer.println(words);
        }
    }

}



