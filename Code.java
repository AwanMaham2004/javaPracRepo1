import java.util.Scanner;

public class Code {

    Scanner scan = new Scanner(System.in);


    Number_Of_People numPeople = new Number_Of_People();
    Date_And_Time dateTime = new Date_And_Time();
    Menu menu = new Menu();
    Feedback feedback = new Feedback();
    Availability availability = new Availability();
    Waitlist waitlist = new Waitlist();

        public void code(){
            System.out.println("Welcome to Awan Restaurant.");
            System.out.println("__________Deals and Offers of the season___________");
            System.out.println("- For more than 15 people a party table can be organized in a separate room");
            System.out.println("- Buy 2 pizzas & get 3 toppings for free");
            System.out.println("- Buffett possibility after 12 pm till 4 pm");
            System.out.println("- Free refill of drinks for just $1.99 if buffet is taken");
            System.out.println("");
            int repetition = 1;
            while (repetition==1){
                repetition=3;
            String date = dateTime.date();
            int time = dateTime.time();
            String name = numPeople.name();
            int noOfPeople = numPeople.numberOfPeople();


            if (availability.availability()) {
                System.out.println("Please choose from the given menu: ");
                menu.menu();
                menu.menuOrder();
                String[] orderName = menu.getOrder();
                double[] orderPrice = menu.getPrice();
                double total = 0;
                System.out.println("______________________________Awan Restaurant______________________________");
                noOfPeople = noOfPeople-1;
                System.out.println("Table reserved for " + name + " and " + noOfPeople + " people");
                System.out.println("Number of items: ");
                System.out.println("____________________________________________________________________________");
                for (int i = 0; i < menu.index; i++) {
                    total += orderPrice[i];
                    System.out.println(orderName[i] + " $ " + orderPrice[i]);
                }
                System.out.println("____________________________________________________________________________");
                System.out.println("Service charges: 20 ");
                total = total + 20;
                System.out.println("Your total bill is: $ " + total);
                System.out.println("____________________________________________________________________________");
                feedback.rate();

            }
            else {
                System.out.println("Sorry, the table is not available right now! Do you want to select again?");
                System.out.println("Yes (1) | No (2)");
                repetition = scan.nextInt();
                if (repetition==1){
                    System.out.println("Try again!");
                }
                else {
                    waitlist.setNameOfPeople(name);
                    waitlist.setNumberOfPeople(noOfPeople);
                    waitlist.waitList();
                }
            }
        }
    }
}
