import java.util.Scanner;
import java.util.Date;

public class Number_Of_People {

    Scanner scan = new Scanner(System.in);

    Availability availability = new Availability();


    public String name(){

        System.out.println("Enter a name for reservation: ");
        String nameEntry = scan.next();
        return nameEntry;

    }

    public int numberOfPeople(){

        System.out.println("Please enter the number of people: ");
        int numOfPeople = scan.nextInt();
        if (numOfPeople>15) {
            System.out.println("Would you like a party table in a separate room?");
            System.out.println("(1) Yes | (2) No");
            int PartyTableSelection = scan.nextInt();
            if (PartyTableSelection == 1) {
                System.out.println("Thank you for your entry. Please wait for the availability of the table. Awan Restaurant will be back with you in short.");


                try
                {
                    Thread.sleep(4000);
                }
                catch(InterruptedException ex)
                {
                    ex.printStackTrace();
                }



                if (availability.availability()){
                    System.out.println("Your party table is reserved. Proceed to menu!");
                }
                else {
                    System.out.println("Sorry, the party table is not available yet. Go away!");
                }

            }
            else if (PartyTableSelection == 2){
                System.out.println("The table will be arranged:)");

            }
        }
        return numOfPeople;
    }
}
