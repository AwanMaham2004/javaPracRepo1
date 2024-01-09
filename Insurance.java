import java.util.Scanner;

public class Insurance {

    Scanner scan = new Scanner (System.in);

    public double insuranceCheck(){
        double insuranceAmount = 0;
        System.out.println("Do you have an insurance?");
        System.out.println("Yes (1) | No (2)");
        int insuranceQuestion = scan.nextInt();
        if (insuranceQuestion == 1){
            System.out.println("Your bill will be paid by the insurance");
        }
        else {
            System.out.println("Do you want an insurance provided by us? ");
            System.out.println("Yes (1) | No (2)");
            insuranceQuestion = scan.nextInt();
            if (insuranceQuestion==1){
                System.out.println("(1) Daily Insurance $10 | (2) Weekly insurance $55 | (3) Monthly insurance $250");
                insuranceQuestion = scan.nextInt();
                if (insuranceQuestion==1){
                    insuranceAmount = 10;
                    System.out.println("You have picked our daily insurance option. It will be a cost of 10 $ per day.");
                }
                else if (insuranceQuestion==2) {
                    insuranceAmount = 55;
                    System.out.println("You have picked our weekly insurance option. It will be a cost of 55 $ per week.");
                }
                else if (insuranceQuestion == 3) {
                    insuranceAmount = 250;
                    System.out.println("You have picked our monthly insurance option. It will be a cost of 250 $ per month.");
                }
            }
        }
        return insuranceAmount;
    }
}
