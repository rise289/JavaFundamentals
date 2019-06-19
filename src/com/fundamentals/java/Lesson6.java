package com.fundamentals.java;

/* The contents of this class is for the Lesson 6 Slide Deck.
Strings & More
* */

public class Lesson6 {

    String myString = "LaMars";

    //Method shows String method for charAt
    public void exampleCharAt() {
        char myChar = myString.charAt(2);
        System.out.println(myChar);
}

    //Method shows String method for Concat
    public void exampleConcat(String value) {

        String happy = myString.concat(value);
        System.out.println(happy);
    }

    //Method shows String method for Equals
    public void exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
    }

    //Method shows String method for Lower Case
    public String exampleLowerCase(){
        return myString.toLowerCase();
    }

    //Method shows String method for Upper Case
    public String exampleUpperCase(){
        return myString.toUpperCase();
    }

    //Method shows String method for Length
    public void exampleLength(){
        int length = myString.length();
        System.out.println(length);
    }

    /*Method shows String method for Builder with 2 values,
      a string and integer.
      It also uses multiple append statements.*/
    public void exampleBuilder(String food, int value) {
        StringBuilder build = new StringBuilder();
        build.append("My favorite food is ");
        build.append(food).append(" and I ate ")
                .append(value).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);
    }

    /* Method shows example of Char method using a literal string
       and unicode values. */
    public void exampleChar() {
        char c1 = 't';
        char c2 = '\u00A7';
        System.out.println(c2);
    }

    /*Methods shows examples of the Escape method inserting
      an apostrophe, a tabulation, and a new line.*/
        public void exampleEscape() {
            System.out.println("That\'s a cool toy.\tCan I\nplay with it?");
    }

}
