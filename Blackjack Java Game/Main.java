import java.util.Scanner;
import java.util.ArrayList;
//import java.util.concurrent.ThreadLocalRandom;

//Code by Samuel Lane 
public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            blackJackMethods mthd = new blackJackMethods();
            Deck deck = new Deck();

            int x = 0;
            while (x == 0) {
                System.out.println("Welcome to Blackjack!");
                ArrayList<Card> playerHand = new ArrayList<>();
                int playerValue = 0;
                ArrayList<Card> houseHand = new ArrayList<>();
                int houseValue = 0;

                // draw first 2 cards
                // draw 1 real card and 1 "other card" (other card is drawn at the end to
                // simulate hidden card mechanic)
                playerHand.add(deck.drawCard());
                playerValue += playerHand.get(0).getValue();
                System.out.println(playerHand.get(0).getName());
                System.out.println(playerValue);

                int y = 0;
                int count = 0;
                int count2 = 1;
                while (y == 0) {
                    System.out.println("Would you like to hit or stand?");
                    String str = input.nextLine();

                    if (str.equalsIgnoreCase("hit")) {
                        count++;
                        playerHand.add(deck.drawCard());
                        playerValue += playerHand.get(count).getValue();
                        System.out.println(playerHand.get(count).getName());
                        System.out.println(playerValue);
                    }

                    if (str.equalsIgnoreCase("stand")) {
                        break;
                    }
                }

                // house reveals 1st card
                System.out.println("House reveals their cards...");
                houseHand.add(deck.drawCard());
                houseValue += houseHand.get(0).getValue();
                System.out.println(houseHand.get(0).getName());
                System.out.println(houseValue);

                // house reveals 2nd card
                houseHand.add(deck.drawCard());
                houseValue += houseHand.get(1).getValue();
                System.out.println(houseHand.get(1).getName());
                System.out.println(houseValue);

                System.out.println("Player reveals their card...");
                // player reveals their card
                playerHand.add(deck.drawCard());
                playerValue += playerHand.get(count + 1).getValue();
                System.out.println(playerHand.get(count + 1).getName());
                System.out.println(playerValue);

                if (houseValue > playerValue) {
                    if (houseValue > 21) {
                        System.out.println("House busts!");
                        System.out.println("Player wins!");

                        if (playerValue > 21) {
                            System.out.println("Player busts!");
                        } else {
                            System.out.println("Player wins!");
                        }
                    } else {
                        System.out.println("House wins!");
                    }
                }

                if (houseValue == playerValue) {
                    if (houseValue > 21 && playerValue > 21) {
                        System.out.println("House and Player bust!");
                    } else {
                        System.out.println("It's a push!");
                    }
                }

                if (playerValue > houseValue) {
                    if (playerValue > 21) {
                        System.out.println("Player busts!");

                        if (houseValue > 21) {
                            System.out.println("House busts!");
                        }

                        else {
                            System.out.println("House wins!");
                        }
                    }

                    else {
                        int n = 0;
                        while (n == 0) {
                            System.out.println("House draws...");
                            count2++;
                            houseHand.add(deck.drawCard());
                            houseValue += houseHand.get(count2).getValue();
                            System.out.println(houseHand.get(count2).getName());
                            System.out.println(houseValue);

                            if (houseValue > playerValue) {
                                if (houseValue > 21) {
                                    System.out.println("House busts!");
                                    break;
                                } else {
                                    System.out.println("House wins!");
                                    break;
                                }
                            }
                        }
                    }
                }

                System.out.println("Play again?");
                String cont = input.nextLine();

                if (cont.equalsIgnoreCase("yes")) {
                    x = 0;
                } else if (cont.equalsIgnoreCase("no")) {
                    x = 1;
                } else {
                    try {
                        mthd.throwError();
                    } catch (NullPointerException e) {
                        break;
                    }
                }

                count = 0;
                count2 = 1;
            }
        }
    }
}
