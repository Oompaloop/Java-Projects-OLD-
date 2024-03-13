import java.util.concurrent.ThreadLocalRandom;

public class blackJackMethods {

    //These methods are pretty much useless
    public int generateCard(){
        return ThreadLocalRandom.current().nextInt(1, 14);
    }

    public String generateSuit(){
        String str = "";
        int x = ThreadLocalRandom.current().nextInt(1, 5);
        switch(x){
            case 1 -> str = "CLUBS";
            case 2 -> str = "SPADES";
            case 3 -> str = "HEARTS";
            case 4 -> str = "DIAMONDS";
        }

        return str;
    }

    //Work on ace-handling method tomorrow

    public void throwError() throws NullPointerException{
        try {
            throw new NullPointerException();
        }
        catch(NullPointerException e) {
            System.out.println("Invalid input.");
        }
    }
}