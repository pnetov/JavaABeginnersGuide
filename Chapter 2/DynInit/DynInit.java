// Demonstrate dynamic initialization.
/**
 * DynInit
 */
public class DynInit {

    public static void main(String[] args) {
        double radius = 4, height = 5;

        // dynamically initialize value
        double valume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + valume);
    }
}