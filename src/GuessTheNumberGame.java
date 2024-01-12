import java.util.Arrays;
import java.util.Random;

public class GuessTheNumberGame {
    private static int targetNumber;

    private static boolean checkGuess(Player player) {
        int guess = player.makeGuess();
        if (player instanceof HumanPlayer) {
            if (guess < targetNumber) {
                System.out.println("Too Low!");
            } else if (guess > targetNumber) {
                System.out.println("Too High!");
            } else {
                return true;
            }
        } else if (player instanceof ComputerPlayer) {
            if (guess < targetNumber) {
                System.out.println("Too Low!");
            } else if (guess > targetNumber) {
                System.out.println("Too High!");
            } else {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        System.out.println(STR."Target Number \{targetNumber}");
        System.out.println("Welcome to Guess the Number Game!");

        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();

        boolean guessed = false;
        do{
            System.out.println("----- Player 1 -----");
            if (checkGuess(humanPlayer)){
                System.out.println(STR."Correct! \{humanPlayer.getName()} guessed the number");
                System.out.println(STR."Guesses: \{humanPlayer.getGuesses().toString()}");
                System.out.println(STR."Total guesses: \{humanPlayer.getGuesses().size()}");
                guessed = true;
                break;
            }
            System.out.println("----- Computer Player -----");
            if (checkGuess(computerPlayer)) {
                System.out.println("Correct! Computer Player guessed the number.");
                System.out.println(STR."Guesses: \{computerPlayer.getGuesses().toString()}");
                System.out.println(STR."Total guesses: \{computerPlayer.getGuesses().size()}");
                guessed = true;
                break;
            }
        }

        while(!guessed); //variable que sea true
    }
}