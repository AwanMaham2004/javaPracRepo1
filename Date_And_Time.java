import java.util.Scanner;

public class Date_And_Time {

    Scanner scan = new Scanner(System.in);

    Menu menu = new Menu();

    public String date(){
        System.out.println("Please enter the date on which you want to book your table: ");
        String dateEntry = scan.next();
        return dateEntry;
    }
    public int time(){
        System.out.println("Please enter the approximate time of your arrival: ");
        int timeEntry = scan.nextInt();
        return timeEntry;
    }

    public void buffet(){
        int timeEntry = 0;
        if (timeEntry>=12 && timeEntry<=16){
            System.out.println("Would you like to take the buffet menu?");
            System.out.println("Yes (1) | No (2)");
            int buffetSelection = scan.nextInt();
            if (buffetSelection==1){
                System.out.println("Buffet will take place from 12 pm - 4 pm. ");
            }
            else {
                System.out.println("Please select from the menu ");
                menu.menu();
            }
        }
    }

}
