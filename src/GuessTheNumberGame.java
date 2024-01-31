
import java.util.Random;

public class GuessTheNumberGame {

// se genera el numero random y lo devuelve.
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1, 100) + 1;
    }

//revisamos la suposiscion del jugador y la comparamos con el targetNumber
    public static boolean checkGuess(Player player, int targetNumber) {
//se obtiene la suposicion de jugador
        int guess = player.makeGuess();
            if (guess < targetNumber) {
                System.out.println("Too Low!");
            } else if (guess > targetNumber) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct!");
                return true;

            }
            return false;
    }
    public static void main(String[] args) {
        int targetNumber = generateRandomNumber();
        //System.out.println("Target Number " + targetNumber);
        System.out.println("Welcome to Guess the Number Game!");

        //creamos las instancias de los jugadores.
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();
         //turnos
        do{
            System.out.println("----- Player 1 -----");
            if (checkGuess(humanPlayer, targetNumber)){
                System.out.println(humanPlayer.getName() + " guessed the number in " + humanPlayer.getGuesses().size() + " attempts.");
                System.out.println("Attempts: " + humanPlayer.getGuesses().toString());

                break;
            }
            System.out.println("----- Computer Player -----");
            if (checkGuess(computerPlayer, targetNumber)) {
                System.out.println("Computer Player guessed the number in " + computerPlayer.getGuesses().size() + " attempts.");
                System.out.println("Attempts: " + computerPlayer.getGuesses().toString());

                break;
            }
        }

        while(true);
    }
}