// Side effects can be important.
/**
 * SideEffects
 */
public class SideEffects {

    public static void main(String[] args) {
        int i;

        i = 0;

        /* Here, i is still icremented even though
           the if statement fails. */
           if(false & (++i < 100))
           System.out.println("this won't be displayed");
        System.out.println("if statemend  executed: " + i); // displays 1

        /* In this case, i is not incremented because
           the short-circuit operator skips the increment. */

           if(false && (++i < 100))
           System.out.println("this won't be displayed");
        System.out.println("if statemend  executed: " + i); // displays 1
    }
}