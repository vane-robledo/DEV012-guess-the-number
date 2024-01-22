import java.util.Scanner;
public class HumanPlayer extends Player {
public HumanPlayer(){
    inputName();
}
    @Override
    public int makeGuess() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            this.getGuesses().add(playerGuess);
            return playerGuess;
        }
    public void inputName() {
        System.out.println("Write your name: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        setName(playerName);
    }dsfsdfss

    }