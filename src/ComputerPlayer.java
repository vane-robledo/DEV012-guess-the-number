import java.util.Random;

class ComputerPlayer extends Player {
    @Override
    public int makeGuess() {
        Random random = new Random();
        int computerGuess = random.nextInt(100) + 1;
        System.out.println(STR."Player 2 guess: \{computerGuess}");
        this.getGuesses().add(computerGuess);
        return computerGuess;
    }
}