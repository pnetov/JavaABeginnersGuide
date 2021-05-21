//This program finds all of prime numbers between 2 and 100.
/**
 * SelfTest10PrimeNumbers
 */
public class SelfTest10PrimeNumbers {

    public static void main(String[] args) {
        int index = 1;
        int sum = 0;
       for(int i = 2; i <= 100; i++) {
           boolean isPrime = true;
            for (int j = i -1; j >= 2; j--) {
                if (i % j == 0) {
                    isPrime = false;
                }

            }
            if (isPrime) {
                System.out.println(index + " " + i);
                index++;
                sum = sum +i;
            }
       }
       System.out.println("Sum of all prime numbers from 2 to 100 is: " + sum);

    }
}