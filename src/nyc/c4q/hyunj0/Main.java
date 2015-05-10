package nyc.c4q.hyunj0;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("Quispe"));
        System.out.println(uppercaseWords("i love java"));
        System.out.println(reverseWords("Java Love I"));
    }

    // Reverse - "Quispe" -> "epsiuQ"
    public static String reverse (String text) {
        String newText = "";
        for (int i = text.length()-1; i >= 0; i--) {
            newText += text.charAt(i);
        }
        return newText;
    }

    // Uppercase words - "i love java" -> "I Love Java"
    public static String uppercaseWords (String words) {
        Scanner read = new Scanner (words);
        ArrayList<String> word = new ArrayList<String>();
        String newLine = "";
        while (read.hasNext()) {
            word.add(read.next());
        }
        for (int i = 0; i < word.size(); i++) {
            newLine += word.get(i).toUpperCase().charAt(0) + word.get(i).substring(1) + " ";
        }
        return newLine;
    }

    // Reverse words - "Java Love I" -> "I Love Java"
    public static String reverseWords (String words) {
        Scanner read = new Scanner(words);
        ArrayList<String> word = new ArrayList<String>();
        String newLine = "";
        while (read.hasNext()) {
            word.add(read.next());
        }
        for (int i = word.size()-1; i >= 0; i--) {
            newLine += word.get(i) + " ";
        }
        return newLine;
    }

    // TODO Parse Addition Expression - "3 + (4 + 2)" -> "9". Assume that the only operations are "+" and parentheses.
    public static int parseAddition (String expression) {
        Scanner parse = new Scanner(expression);

        while (parse.hasNextInt()) {

        }
        for (int i = 0; i < expression.length(); i++) {
            if (Character.isDigit(expression.charAt(i))) {

            }
        }

        return -1;
    }
}
