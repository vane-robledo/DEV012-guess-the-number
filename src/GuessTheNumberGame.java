
import java.util.Random;

public class GuessTheNumberGame {
    public static int targetNumber;

    public static int generateRandomNumber() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        return targetNumber;
    }

    public static boolean checkGuess(Player player) {
        int guess = player.makeGuess();
        if (player instanceof HumanPlayer) {
            if (guess < targetNumber) {
                System.out.println("Too Low!");
            } else if (guess > targetNumber) {
                System.out.println("Too High!");
            } else {
                return true;
            }
            return false;
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
        System.out.println("Target Number " + generateRandomNumber());
        System.out.println("Welcome to Guess the Number Game!");

        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();

        do{
            System.out.println("----- Player 1 -----");
            if (checkGuess(humanPlayer)){
                System.out.println("Correct! " + humanPlayer.getName() + " guessed the number in " + humanPlayer.getGuesses().size() + " attempts.");
                System.out.println("Attempts: " + humanPlayer.getGuesses().toString());

                break;
            }
            System.out.println("----- Computer Player -----");
            if (checkGuess(computerPlayer)) {
                System.out.println("Correct! Computer Player guessed the number in " +computerPlayer.getGuesses().size() + " attempts.");
                System.out.println("Attempts: " + computerPlayer.getGuesses().toString());

                break;
            }
        }

        while(true); //variable que sea true
    }
}