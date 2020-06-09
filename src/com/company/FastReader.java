package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FastReader {

    public static void Read(String name) throws Exception{
        Path fin = Paths.get(name);
        try (Scanner scan = new Scanner(fin, "utf8")) {
            while (scan.hasNext()){
                System.out.print(scan.next());
                System.out.print('\r');
                System.out.flush();
                Thread.sleep(600);
            }
        }
    }

}
