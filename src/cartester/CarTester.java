package cartester;

import java.util.Scanner;

/**
 *
 * @author mangu3804
 */
public class CarTester {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String carMake, carModel, carColour;
        int carYear, carAge, carPrice;
        Car[] cars = new Car [4];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------------");
            System.out.println("Car " + (i + 1));
            System.out.println("--------------------------");
            System.out.print("Enter the make of the car (0 if unknown): ");
            carMake = input.nextLine();
            System.out.print("Enter the model of the car (0 if unknown): ");
            carModel = input.nextLine();
            System.out.print("Enter the colour of the car (0 if unknown): ");
            carColour = input.nextLine();
            System.out.print("Enter the year of the car (0 if unknown): ");
            //carYear = input.nextInt();
                carYear = 0;
            try {
                carYear = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.print("Enter the age of the car (0 if unknown): ");
            carAge = 0;
            //carAge = input.nextInt();
            //input.nextLine();  // Consume newline left-over
            try {
                carAge = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.print("Enter the price of the car (0 if unknown): ");
            //carPrice = input.nextInt();
            carPrice = 0;
            try {                    
                carPrice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            //input.nextLine();  // Consume newline left-over
            if (carMake.equals("0") || carModel.equals("0") ||
                    carColour.equals("0") || carYear == 0) { //Cheese skipcode
                cars[i] = new Car();
            } else if (carAge == 0 || carPrice == 0) {
                cars[i] = new Car(carMake, carModel, carColour, carYear);
            } else {
                cars[i] = new Car(carMake, carModel, carColour, carYear, carAge,
                        carPrice);
            }
            
        }
        
        //Car car1 = new Car(carMake, carModel, carColour, carYear, carAge, carPrice);
        //Car car2 = new Car("Honda", "Civic");
        //Car car3 = new Car();

        //Print the details of each car
        System.out.println("--------------------------");
        System.out.println("Car 1");
        System.out.println(cars[1].toString());
        System.out.println("--------------------------");

        System.out.println("Car 2");
        System.out.println(cars[2].toString());
        System.out.println("--------------------------");

        //toString() is called by default, no need to write it!
        System.out.println("Car 3");
        System.out.println(cars[3].toString());
        System.out.println("--------------------------");

        //car1 honks friendly, car2 honks angry
        cars[1].tapHonk();
        cars[2].holdHonk();
    }
    
}
