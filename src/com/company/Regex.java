package com.company;

public class Regex {

    public static boolean checkEmail(String email){
        return email.matches("[\\da-zA-Z.-]*@[a-z.-]*\\.[a-z][a-z]([a-z]|)");
    }

    public static String commafix(String wrongs){
        return wrongs.replaceAll("\\s,", ",");
    }

    public static String partReplace(String vagina){
        return vagina.replaceAll("([а-яА-Я]+)-([а-яА-Я]+)", "$2-$1");
    }

}
