// Read a character from the keybord.
/**
 * Kbin
 */
public class Kbin {

    public static void main(String[] args) 
        throws java.io.IOException {

            char ch;

            System.out.println("Press a key fallowed by ENTER: ");

            ch = (char) System.in.read(); // get a char

            System.out.println("Your key is: " + ch);
        }
    
}