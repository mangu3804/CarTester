package cartester;

/**
 *
 * @author mangu3804
 */
public class Car {
    private String carMake, carModel, carColour;
    private int carYear, carAge, carPrice;

    //constructors
    //Default constructor
    public Car() {
        carMake = "Toyota";
        carModel = "Camry";
        carColour = "Black";
        carYear = 2000;
        carAge = 16;
        carPrice = 20000;
    }

    //All constructor
    public Car(String crMake, String crModel, String crColour, int crYear,
               int crAge, int crPrice) {
        //This constructor uses all properties
        carMake = crMake;
        carModel = crModel;
        carColour = crColour;
        carYear = crYear;
        carAge = crAge;
        carPrice = crPrice;
    }

    //Alternate constructor
    public Car(String crMake, String crModel, String crColour, int crYear) {
        //This constructor doesn't include the age or price
        carMake = crMake;
        carModel = crModel;
        carColour = "Black";
        carYear = (int) (Math.random() * 66) + 1950;
        carAge = 2016 - carYear;
        carPrice = (int) (Math.random() * 49000) + 1000;
    }

    public void tapHonk() {
        System.out.println("Honk!");
    }

    public void holdHonk() {
        System.out.println("Hooooooooonk!");
    }

    //method to display all info of the Car
    public String toString() {
        String output = "Make: " + carMake + "\n";
        output += "Model: " + carModel + "\n";
        output += "Price: " + carPrice + "\n";
        output += "Year: " + carYear + "\n";
        output += "Age: " + carAge + "\n";
        output += "Price: " + carAge + "\n";
        //output string is complete, return it
        return output;
    }
}
