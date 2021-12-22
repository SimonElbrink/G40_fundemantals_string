package se.lexicon;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        startingWithString();
//        charAtExample();
//        indexOfExample();
//        substringExample();
//        equalsExample();
//        comparingExamples();


        String name = "\n \t      \tSimon Elbrink   ";

        System.out.println("name = " + name);


        System.out.println("name = " + name.trim());



    }

    private static void comparingExamples() {
        String welcomeMessage = "Hello And Welcome To Java Course";

        welcomeMessage.startsWith("Hello"); //true

        welcomeMessage.endsWith("e"); // true

        welcomeMessage.startsWith("And"); //false

        boolean come_to = welcomeMessage.contains("come To");

        boolean o_j = welcomeMessage.contains("o j");

        System.out.println("come_to = " + come_to);
        System.out.println("o_j = " + o_j);
    }

    private static void equalsExample() {
        String welcomeMessage = "Hello And Welcome To Java Course";
        String welcomeMessageCombo = "HELLO and Welcome tO Java cOuRsE";

        boolean notEqual  =welcomeMessage.equals(welcomeMessageCombo);
        System.out.println("notEqual = " + notEqual);

        String s = welcomeMessage.toLowerCase();

        String s1 = welcomeMessageCombo.toLowerCase();

        boolean equals = s.equals(s1);
        System.out.println("equals = " + equals);

        System.out.println(welcomeMessage.equalsIgnoreCase(welcomeMessageCombo));
    }

    private static void substringExample() {
        String welcomeMessage = "Hello And Welcome To Java Course";


        System.out.println(welcomeMessage.substring(10)); // "Welcome To Java Course"
        System.out.println(welcomeMessage.substring(10, 17)); // "Welcome"
//        System.out.println(welcomeMessage.substring(10, 50)); // Out of Bounds
    }

    private static void indexOfExample() {
        String welcomeMessage = "Hello And Welcome To Java Course";

        int w = 0x57; //Hex for W
        System.out.println("w = " + w);
        int indexOfFirstW = welcomeMessage.indexOf(87); // Decimal W

        int welcomeFoundAtIndex = welcomeMessage.indexOf("Welcome");

        int java = welcomeMessage.indexOf("Java");

        System.out.println("w = " + w);
        System.out.println("indexOfFirstW = " + indexOfFirstW);
        System.out.println("welcomeFoundAtIndex = " + welcomeFoundAtIndex);
        System.out.println("Java = " + java);

        //Finding all E's
        System.out.println(welcomeMessage.indexOf("e"));
        System.out.println(welcomeMessage.indexOf("e", 2));
        System.out.println(welcomeMessage.lastIndexOf("e"));
    }

    private static void charAtExample() {
        String name = "Simon";

        System.out.println(name);

        for (int i = 0; i < name.length(); i++) {
            //sout
//            System.out.println(name[i]);
            System.out.println(name.charAt(i));
        }
    }

    private static void startingWithString() {
        int integer = 90;
//      integer.length();

        String myString = "";

        String string1 = new String();

        int length = "Hello This is a message".length();

        System.out.println("length = " + length);
    }
}
