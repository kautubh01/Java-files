import java.util.Scanner;
import java.util.Random;

class Game {
    private int number;
    private int inputNumber;
    private int noOfGuesses = 0;

    void generateNumber() {
        Random rand = new Random();
        number = rand.nextInt(100);
    }

    void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (0-99): ");
        inputNumber = sc.nextInt();
    }

    // Method to check if the user's guess is correct
    boolean isCorrect() {
        noOfGuesses++;
        if (number == inputNumber) {
            System.out.format("The number was %d and you guessed it correctly in %d attempts.%n", number, noOfGuesses);
            return true;
        } else if (number < inputNumber) {
            System.out.println("The number is too high.");
        } else {
            System.out.println("The number is too low.");
        }
        return false;
    }
}

public class Game2 {
    public static void main(String[] args) {
        Game gm = new Game();
        gm.generateNumber();

        boolean guessedCorrectly = false;
        while (!guessedCorrectly) {
            gm.takeInput();
            guessedCorrectly = gm.isCorrect();
        }
    }
}
