import java.util.Scanner;

public class Payment {

    Scanner scan = new Scanner(System.in);

    public void paymentMethod(){
        System.out.println("Do you want to pay cash or card?");
        System.out.println("(1) Cash | (2) Card");
        int paymentMethodSelection = scan.nextInt();
        if (paymentMethodSelection == 1){
            System.out.println("Thank you for your selection. We will lead you to the next step in short...");
        }
        else {
            System.out.println("Enter your card details: ");
            System.out.println("Please enter your credit card details:  XXXX XXXX XXXX XXXX");
            String CardDetails = scan.next();
            System.out.println("Please enter your card validation: MM/YY");
            String CardValidation = scan.next();
            System.out.println("Please enter your CVC code: XXX");
            String CVCCode = scan.next();
            System.out.println("Name holder: ");
            String NameHolder = scan.next();
        }
    }
}
