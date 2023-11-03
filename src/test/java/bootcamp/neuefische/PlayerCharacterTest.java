package bootcamp.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerCharacterTest {

    @Test
    void getX_whenStarted_thenReturnZero() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);

    }

    @Test
    void getY_whenStarted_thenReturnZero() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }


    @Test
    void move_whenInputW_thenYPlus1() {
        // GIVEN
        int yAktuell = PlayerCharacter.getY();
        int expected = yAktuell + 1;
        String input = "w";
        // WHEN
        PlayerCharacter.move(input); // Press Button W
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);

    }

    @Test
    void move_whenInputS_thenYMinus1() {
        // GIVEN
        int yAktuell = PlayerCharacter.getY();
        int expected = yAktuell -1;
        String input = "s";
        // WHEN
        PlayerCharacter.move(input);
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_whenInputA_thenXPlus1() {
        // GIVEN
        int xAktuell = PlayerCharacter.getX();
        int expected = xAktuell +1;
        String input = "d";
        // WHEN
        PlayerCharacter.move(input);
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_whenInputA_thenXMinus1() {
        // GIVEN
        int xAktuell = PlayerCharacter.getX();
        int expected = xAktuell -1;
        String input = "a";
        // WHEN
        PlayerCharacter.move(input);
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }
}
