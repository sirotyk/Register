package entity;

import java.security.SecureRandom;
import java.util.Random;

public class RandomizedCustomer extends RandomizedHuman implements Customer {

    @Override
    public int putGoodsOnTheLine() {
        return randomAction ();
    }

    @Override
    public int passMoneyToCashier() {
        return randomAction ();
    }
}
