package com.company;

public class ExpWithTransliterator {
    public static void main(String[] args) {
        char[] rus = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};

        char nums[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] texts = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
//Создаем транслитератор на основе двух массивов одинаковой длины.

        Transliterator t = new Transliterator(rus, eng);
        System.out.println(t.translateOneSymbol('я')); // ia
        System.out.println(t.translateOneSymbol('$')); // $
        System.out.println(t.translate("экзамен")); // ekzamen
        System.out.println(t.translate("моё имя")); // ilia


        Transliterator secondt = new Transliterator(nums, texts);
        System.out.println(secondt.translateOneSymbol('1'));
        System.out.println(secondt.translateOneSymbol('$'));
        System.out.println(secondt.translate("1 4 8 8"));
        System.out.println(secondt.translate("моё имя"));

        System.out.println(t.translateOneSymbol('Р')); // R
        System.out.println(t.translateOneSymbol('Я')); // Ia
        System.out.println(t.translateOneSymbol('Ь')); //
        System.out.println(t.translate("Моё имя")); // Ilia
        System.out.println(t.translate("Яблоко")); // Iabloko
        System.out.println(t.translate("ПАРАШЮТ")); // PARAShIuT
    }
}
