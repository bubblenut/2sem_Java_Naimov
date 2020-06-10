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
        System.out.println((this.hours + ":" + this.minutes));
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

    public String sayHello(){
        if (isMorning()){
            return ("Доброе утро");
        }else if(isDay()){
            return ("Добрый день");
        }else{
            return ("Доброй ночи");
        }
    }

    public void add(int min){
        this.minutes += min;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }
}
