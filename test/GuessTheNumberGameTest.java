import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class GuessTheNumberGameTest {
    private ByteArrayOutputStream consoleOutput;
    @BeforeEach
    public void setUp(){
        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));
    }
    @Test
    public void guessEqualToTarget(){
        String expectedHint = "Correct!";
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        int targetNumber = 26;

        when(humanPlayerMock.getName()).thenReturn("Juan");
        when(humanPlayerMock.makeGuess()).thenReturn(26);

        assertTrue(GuessTheNumberGame.checkGuess(humanPlayerMock, targetNumber), "Guess is not correct!");
        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));

        System.setOut(System.out);

        GuessTheNumberGame.checkGuess(humanPlayerMock, targetNumber);

        assertTrue(expectedHint.trim().equalsIgnoreCase(consoleOutput.toString().trim()));

}

    @Test
    public void guessHigherThanTarget()  {
        String expectedHint = "Too High!";
        ComputerPlayer computerPlayerMock = mock(ComputerPlayer.class);
        int targetNumber = 20;
        when(computerPlayerMock.makeGuess()).thenReturn(80);

        assertFalse(GuessTheNumberGame.checkGuess(computerPlayerMock, targetNumber));

        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));

        System.setOut(System.out);

        GuessTheNumberGame.checkGuess(computerPlayerMock, targetNumber);

        assertTrue(expectedHint.trim().equalsIgnoreCase(consoleOutput.toString().trim()));
    }

    @Test
    public void guessLowerThanTarget(){
        String expectedHint = "Too Low!";
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        int targetNumber = 32;

        when(humanPlayerMock.makeGuess()).thenReturn(25);

        assertFalse(GuessTheNumberGame.checkGuess(humanPlayerMock, targetNumber));

        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));

        System.setOut(System.out);

        GuessTheNumberGame.checkGuess(humanPlayerMock, targetNumber);

        assertTrue(expectedHint.trim().equalsIgnoreCase(consoleOutput.toString().trim()));
    }
    }
