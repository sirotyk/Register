package entity;

import java.security.SecureRandom;
import java.util.Random;


public class RandomizedHuman {
    private final Random random = new SecureRandom();
    protected int randomAction (){
        return random.nextInt(15);
    }
}
