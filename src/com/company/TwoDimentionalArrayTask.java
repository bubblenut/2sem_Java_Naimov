package com.company;
import java.util.Arrays;

public class TwoDimentionalArrayTask {

    public static char[][] createTable(int num, char mean){
        char[][] Table = new char[num][num];
        for (char[] line : Table){
            Arrays.fill(line,mean);
        }
        return Table;
    }

    public static void printTable(char[][] arr){
        for (char[] line : arr){
            for(char elem : line){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void fillFirstAndLastLines(char[][] arr, char mean){
        char[] rows = new char[arr.length];
        Arrays.fill(rows, mean);
        arr[0] = rows;
        arr[arr[0].length - 1] = rows;
    }

    public static void fillFirstAndLastColumns(char[][] arr, char mean){
        for (int i = 0; i < arr[0].length; i++){
            arr[i][0] = mean;
            arr[i][arr.length - 1] = mean;
        }
    }

}
