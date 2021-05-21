// Add range to Vehicle.
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity of gallons
    int mpg;        // fuel consumption in miles per gallon

    //Dispaly the range;
    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

/**
 * AddMeth
 */
public class AddMeth {

    public static void main(String[] args) {
        Vehicle  minivan = new Vehicle();
        Vehicle  sportscar = new Vehicle();
        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ".");
        minivan.range(); //tisplay range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + ".");
        sportscar.range(); //tisplay range of sportscar



    }
}