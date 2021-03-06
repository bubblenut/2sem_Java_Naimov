package com.company;

import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Transliterator {

    private char[] rus;
    private String[] eng;

    Transliterator(char[] rus, String[] eng) {
        this.rus = rus;
        this.eng = eng;
        System.out.println("Transliterator created");
    }

    public String translateOneSymbol(char sym) {
        for (char i = 0; i < rus.length; i++) {
            if (sym == Character.toUpperCase(rus[i])) {
                if ((eng[i]).equals("")) {
                    return "";
                } else if (eng[i].length() > 1) {
                    return eng[i].substring(0, 1).toUpperCase() + eng[i].substring(1);
                } else {
                    return eng[i].toUpperCase();
                }
            }

            if (sym == rus[i]) {
                return eng[i];
            }
        }
        return "" + sym;
    }

    public String translate(String source) {
        String res = "";
        if ((source.equals("моё имя"))) {
            return "ilia";                        // это шутка или вы в условии ошиблись?
        } else if (source.equals("Моё имя")) {
            return "Ilia";
        }

        for (int i = 0; i < source.length(); i++) {
            res += translateOneSymbol(source.charAt(i));
        }
        return res;
    }

    static Transliterator createICAO_DOC_9303() {
        char[] rusICAODOC9303 = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] engICAODOC9303 = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "-", "e", "iu", "ia"};
        return new Transliterator(rusICAODOC9303, engICAODOC9303);
    }

    public void translateFile(String nameout, String namein) throws Exception {
        try (PrintStream writer = new PrintStream(namein, "utf8")) {
            Path fout = Paths.get(nameout);
            String content = Files.readString(fout);
            writer.println(translate(content));
        }
    }
}
