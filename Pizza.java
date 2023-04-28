package org.example;

 class Pizza {
     private String dough = "";
     private String sauce = "";
     private String toppings = "";

     public void setDough(String _dough) {
         dough = _dough;
     }

     public void setSauce(String _sauce) {
         sauce = _sauce;
     }

     public void setToppings(String _toppings) {
         toppings = _toppings;
     }

     public String toString() {
         return "Dough:" + dough + ", Sauce:" + sauce + ", Toppings:" + toppings;
     }
}
