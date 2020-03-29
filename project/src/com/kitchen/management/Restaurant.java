package com.kitchen.management;
import com.kitchen.management.staff.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Restaurant {
    ArrayList<Cooker> cookers = new ArrayList<>();
    ArrayList<Helper> helpers = new ArrayList<>();

    protected void hireStaff(int numberOfChefs, int numberOfCooks, int numberOfHelpers) {
        for (int i = 0; i < numberOfChefs; i++) {
            Staff chef = new Chef("chef " + i, 1980 + i, 20);
            cookers.add((Chef) chef);
        }
        for (int i = 0; i < numberOfCooks; i++) {
            Staff cook = new Cook("cook " + i, 1980 + i, 15);
            cookers.add((Cook) cook);
        }
        for (int i = 0; i < numberOfHelpers; i++) {
            Staff helper = new Helper("helper " + i, 1980 + i, 10);
            helpers.add((Helper) helper);
        }
    }

    protected boolean runKitchen() {
        boolean weHaveEnoughIngredients = true;
        String ingredients = "carrot potato meat";

        for (Cooker cook : cookers) {
            String yellWord = cook.cook();
            System.out.println(cook.getName() + " yelled: " + yellWord);

            if (ingredients.contains(yellWord)) {
                boolean anyHelperHasIngredient = isAnyHelperHasIngredient(yellWord);
                if (weHaveEnoughIngredients && !anyHelperHasIngredient) {
                    return false;
                }
            }
            if (!cook.isKnifeReceived()) {
                receiveKnife(cook);
            }
        }
        return weHaveEnoughIngredients;
    }

    protected boolean isAnyHelperHasIngredient(String ingredient) {
        for (Helper helper : helpers) {
            if (helper.giveIngredient(ingredient)) {
                return true;
            }
        }
        for (Helper helper : helpers) {
            helper.yellAllOut();
        }
        return false;
    }

    protected void receiveKnife(Cooker cook) {
        Random rand = new Random();
        int chance = rand.nextInt(100)+1;

        if (chance > 70) {
            cook.setKnifeReceived();
            System.out.println(cook.getName() + " received a knife.");
        }
    }
}
