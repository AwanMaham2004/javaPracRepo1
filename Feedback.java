import java.util.Scanner;

public class Feedback {

    Scanner scan = new Scanner(System.in);

    public void rate(){
        System.out.println("Would you like to give us a feedback?");
        System.out.println("Yes (1) | No (2)");
        int feedbackSelection = scan.nextInt();
        if (feedbackSelection==1){
            System.out.println("* (1) | ** (2)| *** (3)| **** (4)| ***** (5)");
            int rating = scan.nextInt();
            System.out.println("Thank you for your feedback. Have a good day! Bye!");
        }
        else{
            System.out.println("Thank you for visiting Awan Restaurant. Have a great day! Bye Bye!:)");
        }

    }

}
