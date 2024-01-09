import java.util.Scanner;
import java.util.Date;

public class Code {

    Scanner scan = new Scanner(System.in);


    Car_Type carType = new Car_Type();
    Vehicle_Models VehicleModels = new Vehicle_Models();
    Availability availability = new Availability();
    Login login = new Login();
    Insurance insurance = new Insurance();
    Duration duration = new Duration();
    Payment payment = new Payment();


    public void code(){
        int reselectionOption = 1;
            System.out.println("Welcome to Awan Car Rental Website where you can rent cars stress free");
            login.Login();
            System.out.println("Enter your name, age and gender accordingly: ");
            User user1 = new User(scan.next(), scan.nextInt(), scan.next());
            System.out.println("Thank you for entering the details. We will lead you to the next page in short...");
            System.out.println("Loading...");
            System.out.println("________________________________ Awan Car Rental _____________________________________");

        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();

        }

            while(reselectionOption == 1) {
                String CarType = carType.carType();
                String vehicleModels = VehicleModels.ModelSelection(CarType);
                String[] durationDate = duration.selectDate();
                Boolean available = availability.modelAvailability();
                available=true;


                if (available) {
                    double totalDurationAmount=0;
                    double vehicleAmount = VehicleModels.rentalAmount;
                    int days = duration.weeklySum();
                    if (days>5){
                        totalDurationAmount = days * vehicleAmount;
                        totalDurationAmount = totalDurationAmount - vehicleAmount;
                        System.out.println("You got the discount of " + vehicleAmount);
                    }
                    else {
                        totalDurationAmount = days * vehicleAmount;
                    }
                    double insuranceAmount = insurance.insuranceCheck();
                    double total = insuranceAmount+totalDurationAmount;
                    payment.paymentMethod();

                    reselectionOption = 0;


                    System.out.println("____________________________________Invoice_________________________________________");
                    user1.userDetails();
                    System.out.println("Vehicle Type:           " + CarType);
                    System.out.println("Vehicle Model:          " + vehicleModels);
                    System.out.println("Pick Up date:           " + durationDate[0]);
                    System.out.println("Returning date:         " + durationDate[1]);
                    System.out.println("Vehicle rental days:    " + days);
                    System.out.println("Vehicle Amount:         " + vehicleAmount);
                    System.out.println("Total Duration Amount:  " + totalDurationAmount);
                    if (insuranceAmount==0){
                    String message = "No insurance bought";
                    System.out.println("Insurance:              " + message);
                    }
                    else {
                    System.out.println("Insurance Amount:       " + insuranceAmount);
                    }
                    System.out.println("Total Amount:           " + total);
                    System.out.println("________________________________ Awan Car Rental _____________________________________");



                } else {
                    System.out.println("Your selected vehicle choice is not available right now. ");
                    System.out.println("Do you want to reselect?");
                    System.out.println("Yes (1) | No (2)");
                    reselectionOption = scan.nextInt();
                    if (reselectionOption == 1) {
                        System.out.println(" Please select again: ");
                    } else {
                        System.out.println("Sorry for the inconvenience now go away!:)");
                    }
                }

            }
    }
}
