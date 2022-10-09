package br.iesb.calc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Number {
    private int value;

    String regex = "[0-9]+[\\.]?[0-9]*";
    public Number() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> list(String string) {
        List<Integer> listNumber = new ArrayList<Integer>();
        String[] line = string.split(" ");

        for (int i = 0; i < line.length; i++) {
            if (Pattern.matches(regex, line[i])) {
                listNumber.add(Integer.parseInt(line[i]));
            }
        }
        return listNumber;
    }
}
