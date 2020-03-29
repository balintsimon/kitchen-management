package com.kitchen.management.staff;

import java.util.HashMap;
import java.util.Random;

public class Helper extends Staff {
    HashMap<String, Integer> ingredients = new HashMap<>();

    public Helper(String name, int birthDate, int salary) {
        super(name, birthDate, salary);
        Random rand = new Random();
        ingredients.put("carrot", rand.nextInt(4));
        ingredients.put("potato", rand.nextInt(4));
        ingredients.put("meat", rand.nextInt(4));
    }

    public boolean giveIngredient(String ingredient) {
        if (ingredients.containsKey(ingredient)) {
            int amountOfIngredient = ingredients.get(ingredient);
            if ( amountOfIngredient > 0) {
                ingredients.replace(ingredient, amountOfIngredient-1);
                System.out.println(this.name + " gave 1 " + ingredient);
                return true;
            }
        }
        return false;
    }

    public void yellAllOut() {
        System.out.println("We're all out!");
    }
}
