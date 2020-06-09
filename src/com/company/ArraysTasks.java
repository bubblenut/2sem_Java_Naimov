package com.company;

import java.util.Arrays;

public class ArraysTasks {

    public static int[] EvenToNum(int num){
        int[] Evens = new int[(num / 2) + 1];
        int step = 0;
        for(int i = 0; i < num + 1; i++){
            if ((i % 2) == 0){
                Evens[step] = i;
                step++;
            }
        }
        return Evens;
    }

    public static boolean hasSimilar(int[] arr){
        for (int i = 0; i < arr.length + 1; i++){
            //не видит сходства если схожий элемент стоит последним
            for(int j = i + 1; j < arr.length - i; j++){
                if (arr[i] == arr[j])
                        return true;
            }
        }
        return false;
    }

    public static int Average(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum/arr.length;
    }

    public static int[] sortReverse(int[] arr){
        int[] ReverseArr = new int[arr.length];
        Arrays.sort(arr);
        //ReverseArr = arr;
        for(int i = 0; i < arr.length; i++){
          ReverseArr[i] = arr[arr.length - i - 1];
        }
        return ReverseArr;
    }

}
