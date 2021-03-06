// Use a return value.

class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;       // fuel consumption in miles per gallon

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }
}
/**
 * RetMeth
 */
public class RetMeth {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

       int  range1, range2;

        // assighn values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assighn values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // get the ranges
            range1 = minivan.range();
            range2 = sportscar.range();
       

            System.out.println(" Minivan can carry " + minivan.passengers + " with range of " + range1 + " Miles");
            System.out.println(" Minivan can carry " + sportscar.passengers + " with range of " + range2 + " Miles");
    }
}