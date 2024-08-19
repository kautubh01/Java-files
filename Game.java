import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors");
        int userinput = sc.nextInt();
        System.out.println("The user input: " + userinput);

        Random random = new Random();
        int computerinput = random.nextInt(3);
        System.out.println("The computer input: " + computerinput);

        if (userinput == computerinput) {
            System.out.println("DRAW");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
            System.out.println("You Win");
        } else {
            System.out.println("YOU LOSE");
        }

        
    }
}
