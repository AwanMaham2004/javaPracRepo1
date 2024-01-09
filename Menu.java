import java.util.Scanner;

public class Menu {


    Scanner scan = new Scanner(System.in);

    double[] prices = new double[30];
    String[] namesOfOrder = new String[30];
    int index = -1;


    public void menu(){
        System.out.println("____________________________________Menu Awan Restaurant____________________________________");
        System.out.println("");
        System.out.println("...........(1) APPETIZER (1)...........");
        System.out.println("(1) GUACAMOLE (Avocado, Lime, Olive Oil, Tomato, Green pepper, Onion              | 7   $");
        System.out.println("(2) BRUSCHETTA TOMATO AND MOZZARELLA                                              | 6   $");
        System.out.println("(3) BRUSCHETTA TOMATO, GARLIC AND OLIVES                                          | 6   $");
        System.out.println("(4) MIXED BRUSCHETTA                                                              | 8   $");
        System.out.println("(5) GARLIC BREAD (Bread slices with garlic butter                                 | 5   $");
        System.out.println("(6) MINI PIZZAS ( Tomato and mozzarella cheese                                    | 6   $");
        System.out.println("(7) VEGETABLE SAMOSA                                                              | 6   $");
        System.out.println("(8) BEEF SAMOSA                                                                   | 6   $");
        System.out.println("(9) KACHORI (Typical zanzibar potatoball with lime                                | 6   $");
        System.out.println("(10) KATLESI (Typical zanzibar potatoball with beef                               | 6   $");
        System.out.println("(11) SHRIMPS CANAPE’ (Lettuce, shrimps, mayonnaise                                | 8   $");
        System.out.println("(12) EGGS CANAPE’ (Eggs, mayonnaise, mustard                                      | 6   $");
        System.out.println("(13) VEGETABLES-TUNA CANAPE’ (Mix fresh vegetables, mayonnaise, tuna              | 10  $");
        System.out.println("(14) TOMATO CANAPE’ (Baked tomato with mozzarella and garlic                      | 6   $");
        System.out.println("(15) MIXED CANAPE’                                                                | 8   $");
        System.out.println("");
        System.out.println("...........(2) SANDWICHES (2)...........");
        System.out.println("(16) HOT DOG                                                                      | 7   $");
        System.out.println("(17) CHICKEN SANDWICH                                                             | 8   $");
        System.out.println("(18) VEGETABLE SANDWICH                                                           | 9   $");
        System.out.println("(19) FRESH TUNA SANDWICH                                                          | 10  $");
        System.out.println("(20) TOMATO AND MOZZARELLA CHEESE SANDWICH                                        | 9   $");
        System.out.println("");
        System.out.println("...........(3) BURGER SANDWICHES (3)...........");
        System.out.println("(21) CHEESE BURGER                                                                | 9   $");
        System.out.println("(22) BEEF BURGER                                                                  | 9   $");
        System.out.println("(23) CHICKEN BURGER                                                               | 9   $");
        System.out.println("(24) VEGETABLE BURGER                                                             | 8   $");
        System.out.println("(25) FISH BURGER                                                                  | 10  $");
        System.out.println("* All served with french fries and fresh salad");
        System.out.println("");
        System.out.println("...........(4) SALADS (4)...........");
        System.out.println("(26) RUSSIAN SALAD (Boiled carrots, boiled potatoes, peas and mayonnaise)         | 8   $");
        System.out.println("(27) SHAMBA SALAD (Fresh mixed vegetables)                                        | 7   $");
        System.out.println("(28) SEAFOOD SALAD (Fresh fish on shamba salad in vinaigrette dressing)           | 12  $");
        System.out.println("(29) AVOCADO SALAD (Garden salad with avocado and raisin in vinegar dressing)     | 8   $");
        System.out.println("(30) CHICKENS SALAD (Chicken fillet on fresh salad with mayonnaise)               | 9   $");
        System.out.println("(31) TUNA CARPACCIO SALAD (Fresh raw tuna marinated in lime juice)                | 10  $");
        System.out.println("(32) GREEK SALAD (Cucumber, tomato and black olives with feta cheese              | 7   $");
        System.out.println("(33) CAPRESE SALAD (Fresh tomato slices, basil leaves and mozzarella)             | 8   $");
        System.out.println("(34) COCKTAIL CALAMARI SALAD                                                      | 10  $");
        System.out.println("(35) OCTOPUS POTATOES SALAD (Boiled potatoes cubes with octopus)                  | 10  $");
        System.out.println("");
        System.out.println("...........VEGETARIAN DISHES...........");
        System.out.println("(36) EGGPLANT LASAGNA (eggplant, tomato, mozzarella and parmesan)                 | 10  $");
        System.out.println("(37) GRATIN VEGETABLES (mixed roasted vegetables with bread crumb)                | 8   $");
        System.out.println("(38) FRIED VEGETABLE TEMPURA                                                      | 10  $");
        System.out.println("(39) VEGETABLE CURRY                                                              | 9   $");
        System.out.println("(40) PLAIN CHIPS (French Fries)                                                   | 5   $");
        System.out.println("");
        System.out.println("...........MAIN DISHES...........");
        System.out.println("(41) GRILLED FISH OF THE DAY                                                      | 12  $");
        System.out.println("(42) FISH FINGER (Breaded fish sticks)                                            | 12  $");
        System.out.println("(43) COCONUT CRUSTED CALAMARI RINGS                                               | 10  $");
        System.out.println("(44) SEAFOOD CURRY                                                                | 12  $");
        System.out.println("(45) CHICKEN PILIPILI                                                             | 10  $");
        System.out.println("(46) FRITTO MISTO (Mixed seafood tempura)                                         | 18  $");
        System.out.println("(47) BEEF OR CHICKEN COTOLETTA (Fried breaded steak)                              | 10  $");
        System.out.println("(48) AMERICAN PEPPER BEEF STEAK                                                   | 12  $");
        System.out.println("(49) BEEF SKEWERS                                                                 | 9   $");
        System.out.println("(50) CHICKEN SKEWERS                                                              | 9   $");
        System.out.println("(51) SEAFOOD SKEWERS                                                              | 12  $");
        System.out.println("(52) GRILLED JUMBO PRAWNS                                                         | 18  $");
        System.out.println("(53) OCTOPUS CURRY                                                                | 12  $");
        System.out.println("(54) CHICKEN CURRY                                                                | 10  $");
        System.out.println("(55) GRILLED LOBSTER                                                              | 25  $");
        System.out.println("(56) GRILLED CIGALS                                                               | 18  $");
        System.out.println("(57) MIXED SEAFOOD PLATTER (For two pax)                                          | 40  $");
        System.out.println("");
        System.out.println("...........PASTA...........");
        System.out.println("(58) PLAIN PASTA (Olive Oil and Parmesan cheese)                                  | 6   $");
        System.out.println("(59) PASTA AL POMODORO (Tomato sauce)                                             | 8   $");
        System.out.println("(60) TUNA SPAGHETTI                                                               | 8   $");
        System.out.println("(61) VEGETABLE PASTA (Mixed vegetable sauce)                                      | 9   $");
        System.out.println("(62) PASTA BOLOGNESE (Minced beef Sauce)                                          | 14  $");
        System.out.println("(63) SEAFOOD LINGUINE                                                             | 12  $");
        System.out.println("(64) PASTA PRAWNS AND ZUCCHINI                                                    | 9   $");
        System.out.println("(65) PASTA AL PESTO (Basil, cashewnut and Parmesan sauce                          | 12  $");
        System.out.println("(66) BEEF LASAGNA (Homemade lasagne)                                              | 12  $");
        System.out.println("(67) TUNA RAVIOLI (Homemade filled pasta)                                         | 12  $");
        System.out.println("(68) GNOCCHI AL POMODORO (Homemade Potatoes gnocchi in tomato sauce)              | 10  $");
        System.out.println("(69) STROZZAPRETI ALLE MELANZANE (Homemade special pasta in aubergine sauce)      | 10  $");
        System.out.println("");
        System.out.println("...........SOUPS...........");
        System.out.println("(70) PUMPKIN SOUP                                                                 | 8   $");
        System.out.println("(71) POTATOES AND LEAKS SOUP                                                      | 8   $");
        System.out.println("(72) ZUCCHINI CREAM SOUP                                                          | 8   $");
        System.out.println("(73) VEGETABLE CREAM SOUP                                                         | 8   $");
        System.out.println("(74) COCONUT BROCCOLI SOUP                                                        | 8   $");
        System.out.println("(75) CHICKPEAS SOUP                                                               | 8   $");
        System.out.println("");
        System.out.println("...........PIZZA...........");
        System.out.println("(76) FOCACCIA (Plain pizza with olive oil and rosemary)                           | 7   $");
        System.out.println("(77) MARINARA (Tomato, garlic and olive oil)                                      | 7   $");
        System.out.println("(78) MARGHERITA (Tomato and mozzarella)                                           | 8   $");
        System.out.println("(79) HAWAII (Tomato, mozzarella, pineapple and chicken)                           | 10  $");
        System.out.println("(80) TRE FORMAGGI (Tomato, mozzarella, cheddar, parmisan)                         | 12  $");
        System.out.println("(81) QUATTRO STAGIONI (Tomato, mozzarella, sausage, green pepper)                 | 10  $");
        System.out.println("(82) VEGETABLE PIZZA (Tomato, mozzarella, mixed fresh vegetable)                  | 10  $");
        System.out.println("(83) NAPOLI (Tomato, mozzarella, anchoives, cappers)                              | 10  $");
        System.out.println("(84) SEAFOOD PIZZA (Tomato, mozzarella, mixed seafood)                            | 14  $");
        System.out.println("(85) UJAMAA (Tomato, mozzarella, onion and tuna)                                  | 10  $");
        System.out.println("");
        System.out.println("...........DESSERT...........");
        System.out.println("(86) ICE CREAM (chocolate, mango, passion fruits, vanilla)                        | 4   $");
        System.out.println("(87) FRUIT SALAD                                                                  | 5   $");
        System.out.println("(88) FRUIT SALAD WITH ICE CREAM (one ball)                                        | 7   $");
        System.out.println("(89) CAKE OF THE DAY (ask waiter)                                                 | 7   $");
        System.out.println("");
        System.out.println("...........COCKTAILS...........");
        System.out.println("(90) LADY GAGA MARACUYA (Passion fruit, orange juice, vodka)                      |  8  $");
        System.out.println("(91) LADY GAGA BANANA (Banana fruit, pineapple juice, vodka)                      |  8  $");
        System.out.println("(92) LADY GAGA PINEAPPLE (Pineapple frui and juice, banana fruit, vodka)          |  8  $");
        System.out.println("(93) KARIBU ZANZIBAR (Campari, triple sec, lime, orange juice, ice)               |  8  $");
        System.out.println("(94) PINACOLADA (Malibu, White Bacardi, pineapple juice,coconut milk, ice)        |  8  $");
        System.out.println("(95) UJAMAA TONIC (Gin, konyagi, lime, tonic soda, ice)                           |  8  $");
        System.out.println("(96) CUBALIBRE (Jamaica Rum, Cocacola, lime, ice)                                 |  8  $");
        System.out.println("(97) POLE POLE (Malibu, Vanilla vodka, pineapple juice, ice)                      |  8  $");
        System.out.println("(98) MOJITO (Fresh mint leaf, White bacardi, lime, sugar, crushed ice)            |  8  $");
        System.out.println("(99) HAKUNA MATATA (Amarula, Afrikoko, Banana, Coconut milk, ice)                 |  8  $");
        System.out.println("(100) LALA SALAMA (Brandy, vodka, pineapple juice, orange juice, ice)             |  8  $");
        System.out.println("(101) BLUE LAGOON (Blue curassao, vodka, lime, ice                                |  8  $");
        System.out.println("(102) SPRITZ (Prosecco, sparkling water, orange, ice, aperol)                     |  8  $");
        System.out.println("(103) GIN TONIC SINGLE                                                            |  5  $");
        System.out.println("(104) GIN TONIC DOUBLE                                                            |  8  $");
        System.out.println("");
        System.out.println("...........DRINKS...........");
        System.out.println("(105) MINERAL WATER 1,5 LT                                                        |  1  $");
        System.out.println("(106) MINERAL WATER 0,5 LT                                                        |  1  $");
        System.out.println("(107) SODA (Coca cola, Fanta, Sprite, coca light, tonic water, bitter lemon)      |  2  $");
        System.out.println("(108) REDBULL                                                                     |  2  $");
        System.out.println("(109) FRESH FRUIT JUICE (Ask for fruits of the day)                               |  3  $");
        System.out.println("(110) FRESH COCONUT JUICE                                                         |  3  $");
        System.out.println("(111) SMOOTHIES (Ask for flavour of the day)                                      |  4  $");
        System.out.println("(112) CHOCOLATE MILKSHAKES                                                        |  4  $");
        System.out.println("(113) FRUITS MILKSHAKES (Ask for fruits of the day)                               |  4  $");
        System.out.println("(114) BEERS (Safari, Kilimanjaro, Tusker, Ndovu, Castle, Heineken, Serengeti)     |  3  $");
        System.out.println("(115) SAVANNA                                                                     |  4  $");
        System.out.println("");
        System.out.println("...........COFFEE...........");
        System.out.println("(116) ESPRESSO                                                                    |  2  $");
        System.out.println("(117) MACCHIATO (Espresso with milk foam)                                         |  2  $");
        System.out.println("(118) CAPPUCCINO                                                                  |  3  $");
        System.out.println("(119) AMERICANO (Long Coffee)                                                     |  2  $");
        System.out.println("(120) ICE COFFEE (Shaken Espresso with Ice)                                       |  4  $");
        System.out.println("(121) UJAMAA COFFEE (Espresso with milk foam and whisky cream)                    |  5  $");
        System.out.println("");
        System.out.println("                          FRESH FOOD - KITCHEN");
        System.out.println("                            AWAN RESTAURANT");
        System.out.println("To ensure the quality and goodness of our recipes we have chosen to use");
        System.out.println("                  only fresh and seasonal products.");
        System.out.println("With the true rhythm of life our cooks transform these gifts of nature, with respect and delicacy,");
        System.out.println("            giving shape and flavor to delicious dishes");
        System.out.println("Following this philosophy we can spend a few more minutes preparing the dishes but");
        System.out.println("you could take advantage of being together and sharing the emotions of your vacation.");
        System.out.println("                    OUR FOOD IS MADE WITH LOVE!:)");
        System.out.println("");
    }

    public void menuOrder(){


        int order = 1000;

        System.out.println("Press '0' to stop ordering!");
        System.out.println("Start ordering: ");

        while(order != 0) {
            index++;

            order = scan.nextInt();

            switch (order){
                case 0:
                    System.out.println("Thanks for ordering!");
                    break;
                case 1:
                    namesOfOrder[index] = "GUACAMOLE (Avocado, Lime, Olive Oil, Tomato, Green pepper, Onion)";
                    prices[index] = 7.0;
                    break;
                case 2:
                    namesOfOrder[index] = "BRUSCHETTA TOMATO AND MOZZARELLA";
                    prices[index] = 6.0;
                    break;
                case 3:
                    namesOfOrder[index] = "BRUSCHETTA TOMATO, GARLIC AND OLIVES";
                    prices[index] = 6.0;
                    break;
                case 4:
                    namesOfOrder[index] = "MIXED BRUSCHETTA";
                    prices[index] = 8.0;
                    break;
                case 5:
                    namesOfOrder[index] = "GARLIC BREAD (Bread slices with garlic butter";
                    prices[index] = 5.0;
                    break;
                case 6:
                    namesOfOrder[index] = "MINI PIZZAS (Tomato and mozzarella cheese";
                    prices[index] = 6.0;
                    break;
                case 7:
                    namesOfOrder[index] = "VEGETABLE SAMOSA";
                    prices[index] = 6.0;
                    break;
                case 8:
                    namesOfOrder[index] = "BEEF SAMOSA";
                    prices[index] = 6.0;
                    break;
                case 9:
                    namesOfOrder[index] = "KACHORI (Typical zanzibar potatoball with lime";
                    prices[index] = 6.0;
                    break;
                case 10:
                    namesOfOrder[index] = "KATLESI (Typical zanzibar potatoball with beef";
                    prices[index] = 6.0;
                    break;
                case 11:
                    namesOfOrder[index] = "SHRIMPS CANAPE’ (Lettuce, shrimps, mayonnaise";
                    prices[index] = 8.0;
                    break;
                case 12:
                    namesOfOrder[index] = "EGGS CANAPE’ (Eggs, mayonnaise, mustard";
                    prices[index] = 6.0;
                    break;
                case 13:
                    namesOfOrder[index] = "VEGETABLES-TUNA CANAPE’ (Mix fresh vegetables, mayonnaise, tuna";
                    prices[index] = 10.0;
                    break;
                case 14:
                    namesOfOrder[index] = "TOMATO CANAPE’ (Baked tomato with mozzarella and garlic";
                    prices[index] = 6.0;
                    break;
                case 15:
                    namesOfOrder[index] = "MIXED CANAPE’";
                    prices[index] = 6.0;
                    break;
                case 16:
                    namesOfOrder[index] = "HOTDOG";
                    prices[index] = 7.0;
                    break;
                case 17:
                    namesOfOrder[index] = "CHICKEN SANDWICH";
                    prices[index] = 8.0;
                    break;
                case 18:
                    namesOfOrder[index] = "VEGETABLE SANDWICH";
                    prices[index] = 9.0;
                    break;
                case 19:
                    namesOfOrder[index] = "FRESH TUNA SANDWICH";
                    prices[index] = 10.0;
                    break;
                case 20:
                    namesOfOrder[index] = "TOMATO AND MOZZARELLA CHEESE SANDWICH";
                    prices[index] = 9.0;
                    break;
                case 21:
                    namesOfOrder[index] = "CHEESE BURGER";
                    prices[index] = 9.0;
                    break;
                case 22:
                    namesOfOrder[index] = "BEEF BURGER";
                    prices[index] = 9.0;
                    break;
                case 23:
                    namesOfOrder[index] = "CHICKEN BURGER";
                    prices[index] = 9.0;
                    break;
                case 24:
                    namesOfOrder[index] = "VEGETABLE BURGER";
                    prices[index] = 8.0;
                    break;
                case 25:
                    namesOfOrder[index] = "FISH BURGER";
                    prices[index] = 10.0;
                    break;
                case 26:
                    namesOfOrder[index] = "RUSSIAN SALAD (Boiled carrots, boiled potatoes, peas and mayonnaise)";
                    prices[index] = 8.0;
                    break;
                case 27:
                    namesOfOrder[index] = "SHAMBA SALAD (Fresh mixed vegetables)";
                    prices[index] = 7.0;
                    break;
                case 28:
                    namesOfOrder[index] = "SEAFOOD SALAD (Fresh fish on shamba salad in vinaigrette dressing)";
                    prices[index] = 12.0;
                    break;
                case 29:
                    namesOfOrder[index] = "AVOCADO SALAD (Garden salad with avocado and raisin in vinegar dressing)";
                    prices[index] = 8.0;
                    break;
                case 30:
                    namesOfOrder[index] = "CHICKEN SALAD (Chicken fillet on fresh salad with mayonnaise)";
                    prices[index] = 9.0;
                    break;
                case 31:
                    namesOfOrder[index] = "TUNA CARPACCIO SALAD (Fresh raw tuna marinated in lime juice)";
                    prices[index] = 10.0;
                    break;
                case 32:
                    namesOfOrder[index] = "GREEK SALAD (Cucumber, tomato and black olives with feta cheese";
                    prices[index] = 7.0;
                    break;
                case 33:
                    namesOfOrder[index] = "CAPRESE SALAD (Fresh tomato slices, basil leaves and mozzarella)";
                    prices[index] = 8.0;
                    break;
                case 34:
                    namesOfOrder[index] = "COCKTAIL CALAMARI SALAD";
                    prices[index] = 10.0;
                    break;
                case 35:
                    namesOfOrder[index] = "OCTOPUS POTATOES SALAD (Boiled potatoes cubes with octopus)";
                    prices[index] = 10.0;
                    break;
                case 36:
                    namesOfOrder[index] = "EGGPLANT LASAGNA (eggplant, tomato, mozzarella and parmesan)";
                    prices[index] = 10.0;
                    break;
                case 37:
                    namesOfOrder[index] = "GRATIN VEGETABLES (mixed roasted vegetables with bread crumb)";
                    prices[index] = 8.0;
                    break;
                case 38:
                    namesOfOrder[index] = "FRIED VEGETABLE TEMPURA";
                    prices[index] = 10.0;
                    break;
                case 39:
                    namesOfOrder[index] = "VEGETABLE CURRY";
                    prices[index] = 9.0;
                    break;
                case 40:
                    namesOfOrder[index] = "PLAIN CHIPS (French Fries)";
                    prices[index] = 5.0;
                    break;
                case 41:
                    namesOfOrder[index] = "GRILLED FISH OF THE DAY";
                    prices[index] = 12.0;
                    break;
                case 42:
                    namesOfOrder[index] = "FISH FINGER (Breaded fish sticks)";
                    prices[index] = 12.0;
                    break;
                case 43:
                    namesOfOrder[index] = "COCONUT CRUSTED CALAMARI RINGS";
                    prices[index] = 10.0;
                    break;
                case 44:
                    namesOfOrder[index] = "SEAFOOD CURRY";
                    prices[index] = 12.0;
                    break;
                case 45:
                    namesOfOrder[index] = "CHICKEN PILIPILI";
                    prices[index] = 10.0;
                    break;
                case 46:
                    namesOfOrder[index] = "FRITTO MISTO (Mixed seafood tempura)";
                    prices[index] = 18.0;
                    break;
                case 47:
                    namesOfOrder[index] = "BEEF OR CHICKEN COTOLETTA (Fried breaded steak)";
                    prices[index] = 10.0;
                    break;
                case 48:
                    namesOfOrder[index] = "AMERICAN PEPPER BEEF STEAK";
                    prices[index] = 12.0;
                    break;
                case 49:
                    namesOfOrder[index] = "BEEF SKEWERS";
                    prices[index] = 9.0;
                    break;
                case 50:
                    namesOfOrder[index] = "CHICKEN SKEWERS";
                    prices[index] = 9.0;
                    break;
                case 51:
                    namesOfOrder[index] = "SEAFOOD SKEWERS";
                    prices[index] = 12.0;
                    break;
                case 52:
                    namesOfOrder[index] = "GRILLED JUMBO PRAWNS";
                    prices[index] = 18.0;
                    break;
                case 53:
                    namesOfOrder[index] = "OCTOPUS CURRY";
                    prices[index] = 12.0;
                    break;
                case 54:
                    namesOfOrder[index] = "CHICKEN CURRY";
                    prices[index] = 19.0;
                    break;
                case 55:
                    namesOfOrder[index] = "GRILLED LOBSTER";
                    prices[index] = 25.0;
                    break;
                case 56:
                    namesOfOrder[index] = "GRILLED CIGALS";
                    prices[index] = 18.0;
                    break;
                case 57:
                    namesOfOrder[index] = "MIXED SEAFOOD PLATTER (For two pax)";
                    prices[index] = 40.0;
                    break;
                case 58:
                    namesOfOrder[index] = "PLAIN PASTA (Olive Oil and Parmesan cheese)";
                    prices[index] = 6.0;
                    break;
                case 59:
                    namesOfOrder[index] = "PASTA AL POMODORO (Tomato sauce)";
                    prices[index] = 8.0;
                    break;
                case 60:
                    namesOfOrder[index] = "TUNA SPAGHETTI";
                    prices[index] = 8.0;
                    break;
                case 61:
                    namesOfOrder[index] = "VEGETABLE PASTA (Mixed vegetable sauce)";
                    prices[index] = 9.0;
                    break;
                case 62:
                    namesOfOrder[index] = "PASTA BOLOGNESE (Minced beef Sauce)";
                    prices[index] = 14.0;
                    break;
                case 63:
                    namesOfOrder[index] = "SEAFOOD LINGUINE";
                    prices[index] = 12.0;
                    break;
                case 64:
                    namesOfOrder[index] = "'PASTA PRAWNS AND ZUCCHINI";
                    prices[index] = 9.0;
                    break;
                case 65:
                    namesOfOrder[index] = "PASTA AL PESTO (Basil, cashewnut and Parmesan sauce";
                    prices[index] = 12.0;
                    break;
                case 66:
                    namesOfOrder[index] = "BEEF LASAGNA (Homemade lasagne)";
                    prices[index] = 12.0;
                    break;
                case 67:
                    namesOfOrder[index] = "TUNA RAVIOLI (Homemade filled pasta)";
                    prices[index] = 12.0;
                    break;
                case 68:
                    namesOfOrder[index] = "GNOCCHI AL POMODORO (Homemade Potatoes gnocchi in tomato sauce)";
                    prices[index] = 10.0;
                    break;
                case 69:
                    namesOfOrder[index] = "STROZZAPRETI ALLE MELANZANE (Homemade special pasta in aubergine sauce)";
                    prices[index] = 10.0;
                    break;
                case 70:
                    namesOfOrder[index] = "PUMPKIN SOUP";
                    prices[index] = 8.0;
                    break;
                case 71:
                    namesOfOrder[index] = "POTATOES AND LEAKS SOUP";
                    prices[index] = 8.0;
                    break;
                case 72:
                    namesOfOrder[index] = "ZUCCHINI CREAM SOUP";
                    prices[index] = 8.0;
                    break;
                case 73:
                    namesOfOrder[index] = "VEGETABLE CREAM SOUP";
                    prices[index] = 8.0;
                    break;
                case 74:
                    namesOfOrder[index] = "COCONUT BROCCOLI SOUP";
                    prices[index] = 8.0;
                    break;
                case 75:
                    namesOfOrder[index] = "CHICKPEAS SOUP";
                    prices[index] = 8.0;
                    break;
                case 76:
                    namesOfOrder[index] = "FOCACCIA (Plain pizza with olive oil and rosemary)";
                    prices[index] = 7.0;
                    break;
                case 77:
                    namesOfOrder[index] = "MARINARA (Tomato, garlic and olive oil)";
                    prices[index] = 7.0;
                    break;
                case 78:
                    namesOfOrder[index] = "MARGHERITA (Tomato and mozzarella)";
                    prices[index] = 8.0;
                    break;
                case 79:
                    namesOfOrder[index] = "HAWAII (Tomato, mozzarella, pineapple and chicken)";
                    prices[index] = 10.0;
                    break;
                case 80:
                    namesOfOrder[index] = "#TRE FORMAGGI (Tomato, mozzarella, cheddar, parmisan)";
                    prices[index] = 12.0;
                    break;
                case 81:
                    namesOfOrder[index] = "QUATTRO STAGIONI (Tomato, mozzarella, sausage, green pepper)";
                    prices[index] = 10.0;
                    break;
                case 82:
                    namesOfOrder[index] = "VEGETABLE PIZZA (Tomato, mozzarella, mixed fresh vegetable)";
                    prices[index] = 10.0;
                    break;
                case 83:
                    namesOfOrder[index] = "NAPOLI (Tomato, mozzarella, anchoives, cappers)";
                    prices[index] = 10.0;
                    break;
                case 84:
                    namesOfOrder[index] = "SEAFOOD PIZZA (Tomato, mozzarella, mixed seafood)";
                    prices[index] = 14.0;
                    break;
                case 85:
                    namesOfOrder[index] = "UJAMAA (Tomato, mozzarella, onion and tuna)";
                    prices[index] = 10.0;
                    break;
                case 86:
                    namesOfOrder[index] = "ICE CREAM (chocolate, mango, passion fruits, vanilla)";
                    prices[index] = 4.0;
                    break;
                case 87:
                    namesOfOrder[index] = "FRUIT SALAD";
                    prices[index] = 5.0;
                    break;
                case 88:
                    namesOfOrder[index] = "FRUIT SALAD WITH ICE CREAM (one ball)";
                    prices[index] = 7.0;
                    break;
                case 89:
                    namesOfOrder[index] = "CAKE OF THE DAY (ask waiter)";
                    prices[index] = 7.0;
                    break;
                case 90:
                    namesOfOrder[index] = "LADY GAGA MARACUYA (Passion fruit, orange juice, vodka)";
                    prices[index] = 8.0;
                    break;
                case 91:
                    namesOfOrder[index] = "LADY GAGA BANANA (Banana fruit, pineapple juice, vodka)";
                    prices[index] = 8.0;
                    break;
                case 92:
                    namesOfOrder[index] = "LADY GAGA PINEAPPLE (Pineapple fruit and juice, banana fruit, vodka)";
                    prices[index] = 8.0;
                    break;
                case 93:
                    namesOfOrder[index] = "KARIBU ZANZIBAR (Campari, triple sec, lime, orange juice, ice)";
                    prices[index] = 8.0;
                    break;
                case 94:
                    namesOfOrder[index] = "PINACOLADA (Malibu, White Bacardi, pineapple juice,coconut milk, ice)";
                    prices[index] = 8.0;
                    break;
                case 95:
                    namesOfOrder[index] = "UJAMAA TONIC (Gin, konyagi, lime, tonic soda, ice)";
                    prices[index] = 8.0;
                    break;
                case 96:
                    namesOfOrder[index] = "CUBALIBRE (Jamaica Rum, CocaCola, lime, ice)";
                    prices[index] = 8.0;
                    break;
                case 97:
                    namesOfOrder[index] = "POLE POLE (Malibu, Vanilla vodka, pineapple juice, ice)";
                    prices[index] = 8.0;
                    break;
                case 98:
                    namesOfOrder[index] = "MOJITO (Fresh mint leaf, White bacardi, lime, sugar, crushed ice)";
                    prices[index] = 8.0;
                    break;
                case 99:
                    namesOfOrder[index] = "HAKUNA MATATA (Amarula, Afrikoko, Banana, Coconut milk, ice)";
                    prices[index] = 5.0;
                    break;
                case 100:
                    namesOfOrder[index] = "LALA SALAMA (Brandy, vodka, pineapple juice, orange juice, ice)";
                    prices[index] = 8.0;
                    break;
                case 101:
                    namesOfOrder[index] = "BLUE LAGOON (Blue curassao, vodka, lime, ice)";
                    prices[index] = 1.0;
                    break;
                case 102:
                    namesOfOrder[index] = " SPRITZ (Prosecco, sparkling water, orange, ice, aperol)";
                    prices[index] = 8.0;
                    break;
                case 103:
                    namesOfOrder[index] = "GIN TONIC SINGLE";
                    prices[index] = 5.0;
                    break;
                case 104:
                    namesOfOrder[index] = "GIN TONIC DOUBLE";
                    prices[index] = 8.0;
                    break;
                case 105:
                    namesOfOrder[index] = "MINERAL WATER 1,5 LT";
                    prices[index] = 1.0;
                    break;
                case 106:
                    namesOfOrder[index] = "MINERAL WATER 0,5 LT";
                    prices[index] = 1.0;
                    break;
                case 107:
                    namesOfOrder[index] = "SODA (Coca cola, Fanta, Sprite, coca light, tonic water, bitter lemon)";
                    prices[index] = 2.0;
                    break;
                case 108:
                    namesOfOrder[index] = "REDBULL";
                    prices[index] = 2.0;
                    break;
                case 109:
                    namesOfOrder[index] = "FRESH FRUIT JUICE (Ask for fruits of the day)";
                    prices[index] = 3.0;
                    break;
                case 110:
                    namesOfOrder[index] = "FRESH COCONUT JUICE";
                    prices[index] = 3.0;
                    break;
                case 111:
                    namesOfOrder[index] = "SMOOTHIES (Ask for flavour of the day)";
                    prices[index] = 4.0;
                    break;
                case 112:
                    namesOfOrder[index] = "CHOCOLATE MILKSHAKES";
                    prices[index] = 4.0;
                    break;
                case 113:
                    namesOfOrder[index] = "FRUITS MILKSHAKES (Ask for fruits of the day)";
                    prices[index] = 4.0;
                    break;
                case 114:
                    namesOfOrder[index] = "BEERS (Safari, Kilimanjaro, Tusker, Ndovu, Castle, Heineken, Serengeti)";
                    prices[index] = 3.0;
                    break;
                case 115:
                    namesOfOrder[index] = "SAVANNA";
                    prices[index] = 4.0;
                    break;
                case 116:
                    namesOfOrder[index] = "ESPRESSO";
                    prices[index] = 2.0;
                    break;
                case 117:
                    namesOfOrder[index] = "MACCHIATO (Espresso with milk foam)";
                    prices[index] = 2.0;
                    break;
                case 118:
                    namesOfOrder[index] = "CAPPUCCINO";
                    prices[index] = 3.0;
                    break;
                case 119:
                    namesOfOrder[index] = "AMERICANO (Long Coffee)";
                    prices[index] = 2.0;
                    break;
                case 120:
                    namesOfOrder[index] = "ICE COFFEE (Shaken Espresso with Ice)";
                    prices[index] = 4.0;
                    break;
                case 121:
                    namesOfOrder[index] = "UJAMAA COFFEE (Espresso with milk foam and whisky cream)";
                    prices[index] = 5.0;
                    break;
                default:
                    System.out.println("Sorry, the entered dish is not available at this time");
                    break;
            }
        }
    }

    public String[] getOrder(){

        return namesOfOrder;
    }
    public double[] getPrice(){

        return prices;
    }
}
