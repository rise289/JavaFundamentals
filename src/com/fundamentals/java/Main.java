package com.fundamentals.java;
import com.fundamentals.lesson10.Lesson10;
/*
This class is the starting class of this project.
        This is an example of a multi-line comment.
        */
public class Main {

    public static void main(String[] args) {
        TruckLab();
        //Lesson11Example();
        //Lesson10Example();
        //Lesson9Examples();
        //Lesson8Examples2();
        //Lesson8Examples();
        //beerSong();
        //Lab2Example();
        //GreenBookExamples();
        //Lesson7Examples();
        //moreLesson6();
        //Lesson6Examples();
        //Lesson5Examples();
        //houseExample();
    } // end main method

    public static void TruckLab(){
        Truck myTruck = new Truck();
        myTruck.moveDrive();
        //myTruck.setwheelType();
        //myTruck.setwindowType();
        //myTruck.setbodyColor();
        //myTruck.setboxbedSize();
        myTruck.getwheelType();
        myTruck.getwindowType();
        myTruck.getbodyColor();
        myTruck.getboxbedSize();

    }

    public static void Lesson11Example(){
        House house1 = new House();

        House house2 = new House("Creamy Peach");

    }

    public static void Lesson10Example(){
        // Try to see a private method in another class.
        Lesson6 myLesson6 = new Lesson6(); // An object instance of this class
        //myLesson6.examplePrivate(); // cannot access
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        //song.lesson10Private(); // cannot access
        Lesson10 myLesson = new Lesson10();
        //myLesson.showLesson();  // cannot access
        //myLesson.showProtected(); // cannot access
    }

    public static void Lesson9Examples() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicStringArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }

    public static void beerSong(){
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();

    }



    /*public static void Lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(2, 2);
        myLesson8.basicIfElseExample(6, 6);
        myLesson8.basicIfElseChainExample(31);
        myLesson8.basicIfAndOrExample(83);
        myLesson8.basicSwitchExample(7);
    }*/
        /*public static void Lesson8Examples2() {
        myLesson8.basicWhileExample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchingExample();
        }

       public static void Lesson7Examples () {
            Lesson7 myLesson7 = new Lesson7();
              myLesson7.basicMath();
              myLesson7.exampleModulus();
              myLesson7.addTwoNumbers();
              myLesson7.exampleAssignment1();
              myLesson7.exampleAssignment2();
              myLesson7.exampleRelational();
              myLesson7.exampleIncrement();
              myLesson7.exampleDecrement();
        }

        //{
        // Initializing a variable
        //public static void GreenBookExamples () {

            //Initializing a variable
            // long z = 100000000;
            //long y = -45000000;

            //Displaying the variable
            //System.out.println("The value of z is " + z);
            //System.out.println("The value of y is " + y);
            //float x = 10.11F;
            //float w = -45.44F;

            //Displaying the variable
            //System.out.println("The value of x is " + x);
            //System.out.println("The value of w is " + w);

            //Method shows String method for Concat
           // String meString = ("Bonjour, Je suis ");
           // String me = meString.concat("Ris");
           // char rr1 = '\u00EB';
           // System.out.println(me + rr1);

     /*   public static void Lab2Example() {
        Week2Lab Lab2 = new Week2Lab();
        Lab2.myWeek2Lab();
        }*/

      /*  public static void moreLesson6 () {
            Lesson6 myOtherLesson6 = new Lesson6();
            myOtherLesson6.exampleBuilder("shrimp", 2);
            myOtherLesson6.exampleChar();
            myOtherLesson6.exampleEscape();
        }*/

      /*  public static void Lesson6Examples () {
            Lesson6 myLesson6 = new Lesson6();
            myLesson6.exampleCharAt();
            myLesson6.exampleConcat(" has awesome donuts");
            myLesson6.exampleEquals("LaMars");
            String myLower = myLesson6.exampleLowerCase();
            System.out.println(myLower);
            String myUpper = myLesson6.exampleUpperCase();
            System.out.println(myUpper);
            myLesson6.exampleLength();
        }*/

        /*public static void Lesson5Examples () {
            Lesson5 myLesson5 = new Lesson5();
            myLesson5.showLocalExample();
            myLesson5.showLocalWithParameter(10, 12);
            int example = myLesson5.showLocalWithReturn(15, 8);
            System.out.println(example);
            myLesson5.showInstanceVariable();
            myLesson5.showConversions();
        }*/


    /*public static void houseExamples() {
        System.out.println("Welcome to Java");
        House myHouse = new House();
        myHouse.doorOpenClose();
    }*/
}