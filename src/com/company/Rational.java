package com.company;

public class Rational {
    private double numerator;
    private double denominator;

    Rational(double n, double d){
        double tmpn = n;
        double tmpd = d;
        while (tmpd !=0) {
            double tmp = tmpn % tmpd;
            tmpn = tmpd;
            tmpd = tmp;
        }
        this.numerator = n / tmpn ;
        this.denominator = d / tmpd;
    }

    Rational(int n){
        this.numerator = n;
        this.denominator = 1;
    }

    public String toString(){
        if (this.denominator == 0){
            return "Denominator = 0, fuck you";
        }else if(this.numerator == 0){
            return "0";
        }else if(this.denominator == 1){
            return (this.numerator + "");
        }else{
            return (this.numerator + "/" + this.denominator);
        }
    }

    public double toDouble(){
        return numerator/denominator;
    }


    private static double nod(double n, double d){
        while (d !=0) {
            double tmp = n % d;
            n = d;
            d = tmp;
        }
        return n;
    }

    public Rational add(Rational r2){
         Rational r3 = new Rational(this.numerator * r2.denominator + this.denominator * r2.numerator, this.denominator * r2.denominator);
         return r3;
    }

    public void addInPlace(Rational r2){
        double tmpn = this.numerator * r2.denominator + this.denominator * r2.numerator;
        double tmpd = this.denominator * r2.denominator;
        double tmpnod = nod(tmpn, tmpd);
        r2.numerator = tmpn / tmpnod;
        r2.denominator = tmpd / tmpnod;
    }



}
