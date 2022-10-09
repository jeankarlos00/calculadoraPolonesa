package br.iesb.calc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Operator {
    private char operator;

    public Operator() {
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    private boolean isOperator(char caracter) {
        boolean isOperator = false;
        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
            isOperator = true;
        }
        return isOperator;
    }

    public int calc(int number, char operator, int number2) {
        int result = 0;

        if (operator == '+') {
            result = number + number2;
        } else if (operator == '-') {
            result = number - number2;
        } else if (operator == '/') {
            result = number / number2;
        } else if (operator == '*') {
            result = number * number2;
        }
        return result;
    }

    public List<Character> list(String string) {
        List<Character> listOperator = new ArrayList<Character>();
        String[] line = string.split(" ");

        for (int i = 0; i < line.length; i++) {
            if (isOperator(line[i].charAt(0))) {
                listOperator.add(line[i].charAt(0));
            }
        }

        return listOperator;
    }
}
