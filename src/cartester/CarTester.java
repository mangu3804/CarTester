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
        Car[] cars = new Car [3];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            if (true) {
                System.out.println("--------------------------");
                System.out.println("Car " + (i + 1));
                System.out.println("--------------------------");
                System.out.print("Enter the make of the car: "); //Necessary
                carMake = input.nextLine();
                System.out.print("Enter the model of the car: "); //Necessary
                carModel = input.nextLine();
                System.out.print("Enter the colour of the car: "); //Necessary
                carColour = input.nextLine();
                System.out.print("Enter the year of the car: "); //Necessary
                //carYear = input.nextInt();
                    carYear = 0;
                try {
                    carYear = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                System.out.print("Enter the age of the car: ");
                //carAge = input.nextInt();
                    carAge = 0;
                try {
                    carAge = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                System.out.print("Enter the price of the car: ");
                //carPrice = input.nextInt();
                carPrice = 0;
                try {                    
                    carPrice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                //input.nextLine();  // Consume newline left-over
                cars[i] = new Car(carMake, carModel, carColour, carYear, carAge,
                        carPrice);
            } else {
                
            }
            
        }
        
        //Car car1 = new Car(carMake, carModel, carColour, carYear, carAge, carPrice);
        //Car car2 = new Car("Honda", "Civic");
        //Car car3 = new Car();

        //Print the details of each car
        System.out.println(cars[1].toString());
        System.out.println("--------------------------");

        //System.out.println(car2.toString());
        System.out.println("--------------------------");

        //toString() is called by default, no need to write it!
        //System.out.println(car3);
        System.out.println("--------------------------");

        //car1 honks friendly, car2 honks angry
        cars[1].tapHonk();
        //car2.holdHonk();
    }
    
}
