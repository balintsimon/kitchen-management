package com.kitchen.management.staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Chef extends Cooker {

    @Override
    public String cook() {
        ArrayList<String> shoutWord = new ArrayList<String>();
        shoutWord.add("carrot");
        shoutWord.add("potato");
        shoutWord.add("meat");
        shoutWord.add("yell");
        shoutWord.add("yell");
        shoutWord.add("yell");

        Random rand = new Random();
        int actualWordNumber = rand.nextInt(shoutWord.size());

        return shoutWord.get(actualWordNumber);
    }

    public Chef(String name, int birthDate, int salary) {
        super(name, birthDate, salary);
    }
}
