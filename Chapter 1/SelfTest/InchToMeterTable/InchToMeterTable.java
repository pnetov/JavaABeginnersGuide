/**
 * InchToMeterTable
 */
public class InchToMeterTable {

    public static void main(String[] args) {
        double  inch;
        double meter = 0.0;
        int counter = 0;

        for(inch = 1; meter <= 1; inch++) {
            meter = inch / 39.37;
            System.out.println(inch + "in is " + meter + "m" );
            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}