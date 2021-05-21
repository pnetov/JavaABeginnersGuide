// Guess the letter game.
/**
 * Guess
 */
public class Guess {

    public static void main(String[] args) 
    throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter teween A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char)System.in.read(); //  read a char from the keybord

        if(ch == answer) System.out.println("***Right***");

        
    }
}