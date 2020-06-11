package com.company;

public class ExperimentsWithRational {
    public static void main(String[] args) {
        System.out.println(progression(20));
    }

    public static double progression(double n){
        double sum = 0;
        for(double i = 1; i < n; i++){
            sum += 1/i;
        }
        return sum;
    }
}
