package com.fundamentals.java;

import com.fundamentals.lesson10.Lesson10;
/*
This class is the starting class of this project.
        This is an example of a multi-line comment.
        */
public class Main {

    public static int num = 0;

    static {
        System.out.println("Static block 1");
        num = 42;
    }// end static block

     static {
         System.out.println("Static Block 2");
         num = 62;
        }//end static block


    // List of methods
    public static void main(String[] args) {
        lesson18Example();
        //lesson17Example();
        //lesson16Examples();
        //lesson15Example();
        //lesson14Examples();
        //lab3Examples();
        //suvExample();
        //lesson12Example();
        //truckExample();
        //Lesson11Example();
        //Lesson10Example();
        //Lesson9Examples();
        //Lesson8Examples2();
        //lesson8Examples();
        //beerSong();
        //Lab2Example();
        //GreenBookExamples();
        //Lesson7Examples();
        //moreLesson6();
        //Lesson6Examples();
        //Lesson5Examples();
        //houseExample();
    } // end main method


    public static void lesson18Example() {
        Lesson18 myLesson18 = new Lesson18(); //an obj of Lesson18
        myLesson18.exampleException();
        myLesson18.myArrayException();
    }


    public static void lesson17Example(){
        Lesson17 myLesson17 = new Lesson17();
        //myLesson17.exampleArrayList1();
        //myLesson17.exampleArrayList2();
        //myLesson17.exampleHashSet();
        myLesson17.exampleHashMap();

    }
    public static void lesson16Examples() {
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnum();
        myLesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors.PEACH);

        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for(DaysOfTheWeek day: d1) {
           System.out.println(day +" at index" +day.ordinal());
        }

    }

    //Can't create and object of an abstract class?  No, but you can create an object instance using a child.

    //Object instance of BlackBerry
    public static void lesson15Example(){
        int[] myKeys = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        BlackBerry myBlackBerry = new BlackBerry(25, myKeys, 0,"Color Screen");
        myBlackBerry.receiveCall(); //obj instance of blackberry
        AbstractCellPhone myOldPhone = new BlackBerry(30, myKeys, 1, "Monochrome");
        myOldPhone.receiveCall(); // obj instance from the child to the parent
        myOldPhone.endCall();
    }//end method

    public static void lesson14Examples() {
        //Lesson14.MY_FIRST_FINAL = 10;
        // Can not change the value of the final.
        // Multiple ways to run Static methods
        //1
        int total = Lesson14.MY_FIRST_FINAL * 35;
        System.out.println(total);

        // Can change the value of a non-final static
        //2
        Lesson14.myFirstStatic = 98; // original is 35
        System.out.println(Lesson14.myFirstStatic);
        //3
        Lesson14.myFirstStaticMethod(10);

        System.out.println("Block number was " + num);
        Lesson14.MyInnerClass test = new Lesson14.MyInnerClass();
        test.myInnerMethod();
    }


   /* public static void lab3Examples() {
        Lab3 myLab3 = new Lab3();
        //myLab3.switchLab3();
        myLab3.basicDoWhileLab3();
    }*/

    public static void suvExample() {
        SUV mySUV = new SUV();
        mySUV.driving();
    }


    public static void lesson12Example(){
        Condo myCondo = new Condo();
        myCondo.doorOpenClose();
        Condo mySecondCondo = new Condo("railing","orange",32,"composite", "steel");
        System.out.println((mySecondCondo.getDoorColor()));

        House myHouse = new Condo();
        myHouse.doorOpenClose();
    }

    public static void truckExample() {
        TruckExample myTruckExample = new TruckExample("Chrome","Tinted", "Short", "Hunter Green" );
        myTruckExample.setColor("candy cane");
        myTruckExample.setBoxBed("long");
        System.out.println(myTruckExample.getWheels());
        System.out.println(myTruckExample.getWindow());
        System.out.println(myTruckExample.getBoxBed());
        System.out.println(myTruckExample.getColor());



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

   public static void lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(2, 2);
        myLesson8.basicIfElseExample(6, 6);
        myLesson8.basicIfElseChainExample(31);
        myLesson8.basicIfAndOrExample(83);
        myLesson8.basicSwitchExample(7);
    }
        public static void Lesson8Examples2() {
        Lesson8 myOtherLesson8 = new Lesson8();
        myOtherLesson8.basicWhileExample();
        myOtherLesson8.basicDoWhileExample();
        myOtherLesson8.basicForLoopExample();
        myOtherLesson8.basicBranchingExample();
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