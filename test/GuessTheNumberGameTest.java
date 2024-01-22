import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


public class GuessTheNumberGameTest {

    @Test
    public void testTargetNumberInRange() {
        GuessTheNumberGame.generateRandomNumber();

        assertTrue(GuessTheNumberGame.targetNumber >= 1 && GuessTheNumberGame.targetNumber <= 100,
                "Target number is not within the range");
    }

    @Test
    public void checkGuessTest(){
        Player humanPlayerMock = mock(HumanPlayer.class);
        Player computerPlayerMock = mock(ComputerPlayer.class);

        when(humanPlayerMock.getName()).thenReturn("Vane");
        when(humanPlayerMock.makeGuess()).thenReturn(58);
        when(computerPlayerMock.makeGuess()).thenReturn(10);

        boolean computerGuessResult = GuessTheNumberGame.checkGuess(computerPlayerMock);
        boolean humanGuessResult = GuessTheNumberGame.checkGuess(humanPlayerMock);


        assertFalse(computerGuessResult, "Guess is incorrect!");
        assertFalse(humanGuessResult, "The guess is incorrect");
    }




    }