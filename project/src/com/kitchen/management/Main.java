package com.kitchen.management;

public class Main {
    public static void main(String[] args) {
        boolean enoughIngerdients = true;
        Restaurant restaurant = new Restaurant();

        restaurant.hireStaff(10, 10, 10);
        while (enoughIngerdients) {
            enoughIngerdients = restaurant.runKitchen();
        }
    }
}
