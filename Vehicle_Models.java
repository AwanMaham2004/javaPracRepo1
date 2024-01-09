import java.util.Scanner;
import java.util.Date;

public class Vehicle_Models {

    Scanner scan = new Scanner(System.in);

    String ModelType;

    double rentalAmount = 0;

    public String ModelSelection(String vehicleChoice){

        if (vehicleChoice.equalsIgnoreCase("Car")){
            System.out.println("Choose one of the following car models: ");

            System.out.println("(1) Mercedes       $250");
            System.out.println("(2) BMW            $200");
            System.out.println("(3) Audi           $200");
            System.out.println("(4) Porsche        $250");
            System.out.println("(5) Lamborghini    $250");
            System.out.println("(6) Volkswagen     $100");
            System.out.println("(7) Hyundai        $150");
            System.out.println("(8) Honda          $100");

            int modelChoice  = scan.nextInt();

            if (modelChoice == 1){
                ModelType = "Mercedes";
                rentalAmount = 250;
            }
            else if (modelChoice==2) {
                ModelType = "BMW";
                rentalAmount = 200;
            }
            else if (modelChoice==3) {
                ModelType = "Audi";
                rentalAmount = 200;
            }
            else if (modelChoice==4) {
                ModelType = "Porsche";
                rentalAmount = 250;
            }
            else if (modelChoice==5) {
                ModelType = "Lamborghini";
                rentalAmount = 250;
            }
            else if (modelChoice==6) {
                ModelType = "VW";
                rentalAmount = 100;
            }
            else if (modelChoice==7) {
                ModelType = "Hyundai";
                rentalAmount = 150;
            }
            else if (modelChoice==8) {
                ModelType = "Honda";
                rentalAmount = 100;
            }
            else {
                System.out.println("Invalid input! Please select again!");
            }

            System.out.println("Thank you for interacting with Awan Car Rental. We will lead you to the next step in short!");


            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();

            }

        }
        else if (vehicleChoice.equalsIgnoreCase("Motorcycle")) {
            System.out.println("Choose one of the following motorcycle models: ");
            System.out.println("(1) Aprilia     $150");
            System.out.println("(2) BMW         $250");
            System.out.println("(3) Ducati      $200");
            System.out.println("(4) Honda       $100");

            int modelChoice = scan.nextInt();

            if (modelChoice==1){
                ModelType = "Aprilia";
                rentalAmount = 150;
            }
            else if (modelChoice==2) {
                ModelType = "BMW";
                rentalAmount = 250;
            }
            else if (modelChoice==3) {
                ModelType = "Ducati";
                rentalAmount = 200;
            }
            else if (modelChoice==4) {
                ModelType = "Honda";
                rentalAmount = 100;
            }
            else {
                System.out.println("Invalid input! Please select again!");
            }

            System.out.println("Thank you for interacting with Awan Car Rental. We will lead you to the next step in short!");
        }
        else if (vehicleChoice.equalsIgnoreCase("Small Truck")) {
            System.out.println("(1) VW          $150");
            System.out.println("(2) Mercedes    $200");
            System.out.println("(3) Ford        $100");

            int modelChoice = scan.nextInt();

            if (modelChoice==1){
                ModelType = "VW";
                rentalAmount = 150;
            }
            else if (modelChoice==2) {
                ModelType = "Mercedes";
                rentalAmount = 200;
            }
            else if (modelChoice==3) {
                ModelType = "Ford";
                rentalAmount = 100;
            }
            else {
                System.out.println("Invalid input! Please select again!");
            }

            System.out.println("Thank you for interacting with Awan Car Rental. We will lead you to the next step in short!");

        }
        else if (vehicleChoice.equalsIgnoreCase("Big Truck")) {
            System.out.println("(1) Mercedes    $250");
            System.out.println("(2) VW          $200");

            int modelChoice = scan.nextInt();

            if (modelChoice==1){
                ModelType = "Mercedes";
                rentalAmount = 250;
            }
            else if (modelChoice==2) {
                ModelType = "VW";
                rentalAmount = 200;
            }
            else{
                System.out.println("Invalid input! Please select again!");
            }

            System.out.println("Thank you for interacting with Awan Car Rental. We will lead you to the next step in short!");

        }
        else if (vehicleChoice.equalsIgnoreCase("Bus")) {
            System.out.println("(1) Mercedes      $350");
            System.out.println("(2) VW            $300");

            int modelChoice = scan.nextInt();

            if (modelChoice==1){
                ModelType = "Mercedes";
                rentalAmount = 350;
            }
            else if (modelChoice==2) {
                ModelType = "VW";
                rentalAmount = 300;
            }
            else{
                System.out.println("Invalid input! Please select again!");
            }

            System.out.println("Thank you for interacting with Awan Car Rental. We will lead you to the next step in short!");
        }

        return ModelType;
    }

}
