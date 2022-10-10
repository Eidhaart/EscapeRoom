package escaperoom.player;

import java.util.Random;

public class Dice {

    Random random = new Random();

    public Integer roll(int faces){
        return random.nextInt(faces)+1;
    }
}
