package br.iesb.calc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Calc {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Number number = new Number();
        Operator operator = new Operator();

        System.out.println("Insira a notação polonesa");
        String line = scan.nextLine();

        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        operators = operator.list(line);
        numbers = number.list(line);

        System.out.println("Numeros");
        System.out.println(numbers);
        System.out.println("Operadores");
        System.out.println(operators);

        int result = 0;
        for (int i = 0; i < operators.size(); i++) {
            if(i == 0) {
                result = operator.calc(numbers.get(i), operators.get(i), numbers.get(i + 1));
            }
            else {
                result = operator.calc(result, operators.get(i), numbers.get(i + 1));
            }
        }

        System.out.println(result);

    }

}
