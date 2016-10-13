package cartester;

/**
 *
 * @author mangu3804
 */
public class Car {
    private String carMake, carModel, carColour;
    private int carYear, carAge, carPrice;

    //constructors
    public Car() {
        carMake = "Toyota";
        carModel = "Camry";
        carColour = "Black";
        carYear = 2000;
        carAge = 16;
        carPrice = 20000;
    }

    public Car(String crMake, String crModel, String crColour, int crAge,
               int crYear, int crPrice) {
        carMake = crMake;
        carModel = crModel;
        carYear = crYear;
        carAge = crAge;
        carPrice = crPrice;
    }

    //Alternate constructor
    public Car(String crMake, String crModel) {
        //This constructor only uses the make and model
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
        output += "Year: " + carYear;
        //output string is complete, return it
        return output;
    }
}
