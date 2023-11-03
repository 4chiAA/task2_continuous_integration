package bootcamp.neuefische;

import java.util.Objects;

public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String input) {
        if (input.equals("w")) {
            y++;
        } else if (input.equals("s")) {
            y--;
        } else if (input.equals("d")) {
            x++;
        } else if (input.equals("a")) {
            x--;
        }
    }
}
