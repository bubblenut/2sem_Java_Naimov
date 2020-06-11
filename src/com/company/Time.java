package com.company;

public class Time {
    int hours;
    int minutes;

    Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
        System.out.println("Здравствуйте, уважаемый");
    }

    Time(){
        System.out.println("Ахахахыхвзащыхащ помогите я дебил");
    }

    public void show(){
        if (this.minutes < 10){
            System.out.println(this.hours + ":0" + this.minutes);
        }else {
            System.out.println((this.hours + ":" + this.minutes));
        }
    }

    public boolean isMorning(){
        return (this.hours < 12);
    }

    public boolean isDay(){
        return ((this.hours >= 12)&&(this.hours < 21));
    }

    public boolean isNight(){
        return(this.hours >= 21);
    }

    public void sayHello(){
        if (isMorning()){
            System.out.println("Доброе утро");
        }else if(isDay()){
            System.out.println("Добрый день");
        }else{
            System.out.println("Доброй ночи");
        }
    }

    public void add(int min){
        this.minutes += min;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }
}
