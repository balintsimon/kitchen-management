package com.kitchen.management.staff;

public abstract class Cooker extends Staff {
     private boolean knifeReceived = false;

     public boolean isKnifeReceived() {
          return knifeReceived;
     }

     public void setKnifeReceived() {
          if (!knifeReceived) {
               this.knifeReceived = true;
          }
     }

     protected Cooker(String name, int birthDate, int salary) {
          super(name, birthDate, salary);
     }

     public String cook() {
          return "dirt my hands";
     }
}
