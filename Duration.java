import java.util.Scanner;

public class Duration {

    String[] Date = new String[2];
    String pickUpDate = "17/08/2023";
    String returnDate = "20/08/2023";

    Scanner scan = new Scanner(System.in);

    public String[] selectDate(){
        System.out.println("Select pick up date: ");
        pickUpDate = scan.next();

        System.out.println("Select returning date: ");
        returnDate = scan.next();

        // Date = "Pick up date: " + pickUpDate + "Return Date: " + returnDate;
        Date[0] = pickUpDate;
        Date[1] = returnDate;
        return Date;
    }

    public int weeklySum(){
        int picking = Integer.parseInt(pickUpDate.substring(0, 2));
        int returning = Integer.parseInt(returnDate.substring(0, 2));
        int subtraction = returning - picking;
        System.out.println("You are taking the vehicle for " + subtraction + " days");
        if (subtraction>5){
            System.out.println("You are taking the vehicle for above 5 days. Therefore you will have a discount for 1 day less:)");
        }
        return subtraction;
    }



}


