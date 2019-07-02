package com.fundamentals.java;

/*
* This class was used for Lesson16 content
* and Enumerations*/
public class Lesson16 {

  public enum IceCreamFlavors{VANILLA, CHOCOLATE, STRAWBERRY, ROCKY_ROAD, PEACH}

  public void showEnum(){
      DaysOfTheWeek d1 = DaysOfTheWeek.TUE;
      System.out.println(d1);
      System.out.println(IceCreamFlavors.ROCKY_ROAD);
      System.out.println(DaysOfTheWeek.THU);

  }// end of method

    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String message = "My favorite flavor is ";
        switch (flavors) {
            case VANILLA:
                message += "Vanilla";
                break;
            case CHOCOLATE:
                message += "Chocolate";
                break;
            case STRAWBERRY:
                message += "Strawberry";
                break;
            case ROCKY_ROAD:
                message += "Rocky Road";
                break;
                default:
                    message += "All Flavors";
                    break;
        }
        System.out.println(message);
    } //end method
} //end class
