import java.math.BigDecimal;
import java.util.Scanner;

public class Exercises {
//    public static void main(String[] args) {
//        Exercise 1
//                ==========
//        Write a program that reverses an array of Strings
//        Given ["you", "are", "how", "Hello"]
//        Print "hello how are you?""
//


        String[] strings = {"you", "are", "how", "Hello"};

        String[] stringsReversed = new String [strings.length];
        for (int i=strings.length-1; i>=0; i--) {
            System.out.println(strings[i]);
        }


    //        Exercise 2
//                ==========
//        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01" and either print a decimal or BigDecimal
//
//    public static void main(String[] args) {
//        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
//        String numbers[] = input.split(", ");   // Split the input string.
//        double sum = 0;
//        for (String number : numbers) {
//            var n = Double.parseDouble(number);
//            sum += n;
//        }
//        System.out.println(sum);
//    }
//}


    //        Exercise 3
//                ==========
//        Write a program that takes an input from the user. Either yes or no. If yes it displays a random joke and asks the same question. If no exit the program.
//

//    public static void main(String[] args) {
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Wanna hear a joke?");
//            String input = scanner.nextLine();
//
//            switch (input) {
//                case "yes":
//                    System.out.println("joke...");
//                    continue;
//                case "no":
//                    System.out.println("ok then...");
//                    break;
//                default:
//                    System.out.println("unknown input detected...");
//                    break;
//            }
//            System.out.println("program terminating");
//break;
//        }
//    }
//}


//                Exercise 4
//                ==========
//        Write a program that finds the longest string in any given array.
//        i.e. [] -> ""
//        i.e. ["hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
//
//        implement longestStrings method
//

    public static String getLongestString(String[] strings) {
        var currentMaxLength = 0;
        String longestString = null;
        for (String string : strings) {
            if (string.length() > currentMaxLength) {
                currentMaxLength = string.length();
                longestString = string;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] strings = {"Big Bird", "Fish","Small","A very long string","Foo"};
        String longestString = getLongestString(strings);

        for (int i=0; i<strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("Longest string: " + longestString);
    }
}

//    }
//}
