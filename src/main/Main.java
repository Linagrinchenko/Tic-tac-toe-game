package main;

/**
 * Created by Xotabu4 on 05.05.14.
 * <p/>
 * Main app class.
 * Contains basic launch logic, and console output.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello player!!");
        System.out.println("Welcome to Tic-tac-toe GAME!!");
        System.out.println("In this game you should place X or O 3 at row to win.");
        System.out.println("Creating game field...");

        int[] anArray = {0, 0, 0,
                0, 0, 0,
                0, 0, 0};


        System.out.println("___|___|___");
        System.out.println("___|___|___");
        System.out.println("___|___|___");

        //just to look at.
        System.out.println(anArray[8]);
    }
}
