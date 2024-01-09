import java.util.Scanner;

public class Waitlist {

    Number_Of_People noPeople = new Number_Of_People();
    Date_And_Time dateAndTime = new Date_And_Time();
    Availability availability = new Availability();

    String[] names = {"Slot 1","Slot 2", "Slot 3", "Slot 4", "Slot 5"};
    int[] numbers = new int[5];
    int index = 0;

    Scanner scan = new Scanner(System.in);

    public void setNumberOfPeople(int numberOP){
        numbers[index] = numberOP;
    }

    public void setNameOfPeople(String NameOP){
        names[index] = NameOP;
        index++;
    }


    public void waitList() {
        System.out.println("Would you like to be added into the waitlist? You will be notified as soon as the table is available.");
        System.out.println("Yes (1) | No (2)");
        int waitlistApproval = scan.nextInt();
        if (waitlistApproval == 1) {
            System.out.println("You will be notified as soon as the table is available!");
            adminWaitlistCheck();
        } else {
            System.out.println("Would you like to select a different time or date?");
            System.out.println("Yes (1) | No (2)");
            int reselectionTimeAndDate = scan.nextInt();

            if (reselectionTimeAndDate == 1) {
                dateAndTime.date();
                dateAndTime.time();

            } else {
                System.out.println("Sorry for the inconvenience. GO TO HELL!");
            }
        }
    }

        public void adminWaitlistCheck() {
            System.out.println("Check waitlist!");
            System.out.println("Yes (1) | No (2)");
            int checkWaitlist = scan.nextInt();
            if (checkWaitlist == 1) {
                for (int i = 0; i < names.length; i++) {
                    System.out.println("Following names are in the waitlist : " + names[i]);
                    System.out.println("These are the number of people waiting: " + numbers[i]);
                }
            }
            else if (numbers[5] > numbers[5]) {
                System.out.println("Your waitlist is too full! Please check it!");
            }
    }
}
