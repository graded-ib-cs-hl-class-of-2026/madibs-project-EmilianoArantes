import java.awt.Font;
import java.util.Scanner;

import javax.swing.JTextArea;

public class App {
    
    private Font font;

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }
    
    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 

     // code below comes from https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    
    public class Colors {

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    }

    public void printInstructions() {
        System.out.println("Welcome to my " + "\u001B[41m" + "EVIL" + "\u001B[0m" + " and " + "\u001B[41m" + "FREAKY" + "\u001B[0m" + " Madlibs... Its name shall be... Emilibs");
        System.out.println("To play the game you must fill in all blanks");

    }
    
    public String getUserName ()  {
        System.out.println("\u001B[41m" + "ENTER YOUR NAME BELOW" + "\u001B[0m");
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        return name; 

    }

    public void printGreeting ( String userName)  {
           System.out.println ( "Hello " + "\u001B[46m" + userName + "\u001B[0m" + " ITS TIME TO PLAY THE GAMMEEE"); 
    }
    public void doMadlib () {
        Scanner blank = new Scanner (System.in);

        System.out.print ("\u001B[31m" + "Past tense Verb " + "\u001B[0m");
        String verb = blank.nextLine();
        System.out.print ("\u001B[34m" + "Adjetive " + "\u001B[0m");
        String adjetive = blank.nextLine();
        System.out.print ("\u001B[35m" + "Location " + "\u001B[0m");
        String location = blank.nextLine();
        System.out.print ("\u001B[36m" + "Celebrity " + "\u001B[0m");
        String celebrity = blank.nextLine();
        System.out.print ("\u001B[32m" + "Fruit in plural " + "\u001B[0m");
        String fruitInPlural = blank.nextLine();
        System.out.print ("\u001B[35m" + "Another Location " + "\u001B[0m");
        String anotherLocation = blank.nextLine();
        System.out.print ("\u001B[33m" + "Object " + "\u001B[0m");
        String object = blank.nextLine();
        System.out.print ("\u001B[31m" + "Restaurant " + "\u001B[0m");
        String restaurant = blank.nextLine();
        System.out.print ("\u001B[34m" + "Food " + "\u001B[0m");
        String food = blank.nextLine();
        System.out.print ("\u001B[35m" + "Car Brand " + "\u001B[0m");
        String carBrand = blank.nextLine();

        System.out.print ("Today I woke up and immediately " + "\u001B[31m" + verb + "\u001B[0m" + " all the way to my kitchen. After that I saw my mom and decided to tell her she is " + "\u001B[34m" + adjetive + "\u001B[0m" + ". After that, I went to " + "\u001B[35m" + location  + "\u001B[0m" + " and saw " + "\u001B[36m" + celebrity + "\u001B[0m" + ". I walked up to " + "\u001B[36m" + celebrity + "\u001B[0m" + " and asked, do you prefer dragon fruits or " + "\u001B[32m" + fruitInPlural + "\u001B[0m" + ", " + "\u001B[36m" + celebrity + "\u001B[0m" + " said " + "\u001B[32m" + fruitInPlural + "\u001B[0m" + ". Then the " + "\u001B[36m" + celebrity + "\u001B[0m" + " invited me to go to " + "\u001B[35m" + anotherLocation + "\u001B[0m" + " and we went to sleep on his " + "\u001B[33m" + object + "\u001B[0m" + " cuddled together. Th next day I woke up and went to eat at " + "\u001B[31m" + restaurant + "\u001B[0m" + ", when I got there I ordered " + "\u001B[34m" + food + "\u001B[0m" + " and ate it. After that I got into my car which is a " + "\u001B[35m" + carBrand + "\u001B[0m" + " and drove home.");
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
