//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstno = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondno = scanner.nextInt();

        System.out.println(isSixtyFive(firstno, secondno));

        scanner.close();
    }

    public static boolean isSixtyFive(int firstno, int secondno) {
        return (firstno == 65 || secondno == 65 || firstno + secondno == 65);


        /*QUESTION2
        Scanner sentence  = new Scanner(System.in)
        if (sentence == null || sentence.length == 0) {
            System.out.println("The list is empty.");
            return;
        }

        String longestWord = "";
        for (String sentence : sentence) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the words separated by spaces:");
        String inputLine = scanner.nextLine();
        String[] wordArray = inputLine.split("\\s+");

        longest(wordArray);

        scanner.close();*/
//END
            }
        }






