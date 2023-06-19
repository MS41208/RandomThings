import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class guessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        out.println("Welcome ya' scallywag");
        out.print("Enter a whole number from 1 to 10. Guess right and ye be awarded the One Piece: ");
        int inputNumber = input.nextInt();
        numberOfGuesses++;

        while (inputNumber != randomNumber) {
            out.println("YAAAARRRGGGHHHHHH! Ye be wrong ya land lover. Try again");
            out.print("Enter a whole number from 1 to 10. Guess right and ye be awarded the One Piece: ");
            inputNumber = input.nextInt();
            numberOfGuesses++;
        }
        out.print("You won the One Piece after only ");
        out.println(numberOfGuesses + " guesses. Ya scallywags.");
        input.close();
    }
}