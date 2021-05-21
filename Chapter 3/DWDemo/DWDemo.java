// Demonstrate the do-while loop.
/**
 * DWDemo
 */
public class DWDemo {

    public static void main(String[] args)
    throws java.io.IOException {
        char ch;
        do {
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // get a char
        } while(ch != 'q');
    }
}