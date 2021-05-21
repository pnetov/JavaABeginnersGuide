// Demonstrate the while loop.
/**
 * WhileDemo
 */
public class WhileDemo {

    public static void main(String[] args) {
        char ch;
        int counter = 0;
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
            counter++;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
    }
}