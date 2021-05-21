// Using break with nested loops.
/**
 * Break3
 */
public class Break3 {

    public static void main(String[] args) {
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.err.print("      Inner loop count: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) {
                    break; // terminate loop if t is 10
                }
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}