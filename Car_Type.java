import java.util.Scanner;

public class Car_Type {

    Scanner scan = new Scanner(System.in);

    Vehicle_Models vehicleModels = new Vehicle_Models();

    String CarType;

    public String carType() {
        System.out.println("In Awan Car Rental the following cars are available: ");
        System.out.println("Car (1) | Motorcycle (2) | Small Truck (3) | Big Truck (4) | Bus (5)");
        System.out.println("Choose your rental wish: ");
        int vehicleChoice = scan.nextInt();
        if (vehicleChoice == 1) {
            CarType = "Car";


        } else if (vehicleChoice == 2) {
            CarType = "Motorcycle";
            System.out.println("Loading.... Thank you for your patience!");
            System.out.println("Choose one of the following motorcycle models: ");



        } else if (vehicleChoice == 3) {
            CarType = "Small Truck";
            System.out.println("Loading.... Thank you for your patience!");
            System.out.println("Choose one of the following Small Truck models: ");




        } else if (vehicleChoice == 4) {
            CarType = "Big Truck";
            System.out.println("Loading.... Thank you for your patience!");
            System.out.println("Choose one of the following Big Truck models: ");




        } else if (vehicleChoice == 5) {
            CarType = "Bus";
            System.out.println("Loading.... Thank you for your patience!");
            System.out.println("Choose one of the following Bus models: ");


        }
        return CarType;
    }
}
