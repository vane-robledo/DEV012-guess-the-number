import java.util.ArrayList;
import java.util.List;

abstract public class Player {
    private String name;
    private final List<Integer> guesses = new ArrayList<>();

    public abstract int makeGuess();

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGuesses() {
        return guesses;
    }



}
