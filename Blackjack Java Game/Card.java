class Card {
    private String suit;
    private String color;
    private String name;
    private int value;

    //Code by Samuel Lane 
    public Card(String suit, int inputNum) {
        this.suit = suit;
        if (suit.equalsIgnoreCase("CLUBS")) {
            color = "BLACK";
            switch (inputNum) {
                case 1 -> name = "Ace of Clubs";
                case 2 -> name = "2 of Clubs";
                case 3 -> name = "3 of Clubs";
                case 4 -> name = "4 of Clubs";
                case 5 -> name = "5 of Clubs";
                case 6 -> name = "6 of Clubs";
                case 7 -> name = "7 of Clubs";
                case 8 -> name = "8 of Clubs";
                case 9 -> name = "9 of Clubs";
                case 10 -> name = "10 of Clubs";
                case 11 -> name = "Jack of Clubs";
                case 12 -> name = "Queen of Clubs";
                case 13 -> name = "King of Clubs";
            }
            switch (inputNum) {
                case 1 -> value = 1;
                case 2 -> value = 2;
                case 3 -> value = 3;
                case 4 -> value = 4;
                case 5 -> value = 5;
                case 6 -> value = 6;
                case 7 -> value = 7;
                case 8 -> value = 8;
                case 9 -> value = 9;
                case 10, 11, 12, 13 -> value = 10;
            }
        }

        if (suit.equalsIgnoreCase("SPADES")) {
            color = "BLACK";
            switch (inputNum) {
                case 1 -> name = "Ace of Spades";
                case 2 -> name = "2 of Spades";
                case 3 -> name = "3 of Spades";
                case 4 -> name = "4 of Spades";
                case 5 -> name = "5 of Spades";
                case 6 -> name = "6 of Spades";
                case 7 -> name = "7 of Spades";
                case 8 -> name = "8 of Spades";
                case 9 -> name = "9 of Spades";
                case 10 -> name = "10 of Spades";
                case 11 -> name = "Jack of Spades";
                case 12 -> name = "Queen of Spades";
                case 13 -> name = "King of Spades";
            }

            switch (inputNum) {
                case 1 -> value = 1;
                case 2 -> value = 2;
                case 3 -> value = 3;
                case 4 -> value = 4;
                case 5 -> value = 5;
                case 6 -> value = 6;
                case 7 -> value = 7;
                case 8 -> value = 8;
                case 9 -> value = 9;
                case 10, 11, 12, 13 -> value = 10;
            }
        }

        if (suit.equalsIgnoreCase("HEARTS")) {
            color = "RED";
            switch (inputNum) {
                case 1 -> name = "Ace of Hearts";
                case 2 -> name = "2 of Hearts";
                case 3 -> name = "3 of Hearts";
                case 4 -> name = "4 of Hearts";
                case 5 -> name = "5 of Hearts";
                case 6 -> name = "6 of Hearts";
                case 7 -> name = "7 of Hearts";
                case 8 -> name = "8 of Hearts";
                case 9 -> name = "9 of Hearts";
                case 10 -> name = "10 of Hearts";
                case 11 -> name = "Jack of Hearts";
                case 12 -> name = "Queen of Hearts";
                case 13 -> name = "King of Hearts";
            }

            switch (inputNum) {
                case 1 -> value = 1;
                case 2 -> value = 2;
                case 3 -> value = 3;
                case 4 -> value = 4;
                case 5 -> value = 5;
                case 6 -> value = 6;
                case 7 -> value = 7;
                case 8 -> value = 8;
                case 9 -> value = 9;
                case 10, 11, 12, 13 -> value = 10;
            }
        }

        if (suit.equalsIgnoreCase("DIAMONDS")) {
            color = "RED";
            switch (inputNum) {
                case 1 -> name = "Ace of Diamonds";
                case 2 -> name = "2 of Diamonds";
                case 3 -> name = "3 of Diamonds";
                case 4 -> name = "4 of Diamonds";
                case 5 -> name = "5 of Diamonds";
                case 6 -> name = "6 of Diamonds";
                case 7 -> name = "7 of Diamonds";
                case 8 -> name = "8 of Diamonds";
                case 9 -> name = "9 of Diamonds";
                case 10 -> name = "10 of Diamonds";
                case 11 -> name = "Jack of Diamonds";
                case 12 -> name = "Queen of Diamonds";
                case 13 -> name = "King of Diamonds";
            }

            switch (inputNum) {
                case 1 -> value = 1;
                case 2 -> value = 2;
                case 3 -> value = 3;
                case 4 -> value = 4;
                case 5 -> value = 5;
                case 6 -> value = 6;
                case 7 -> value = 7;
                case 8 -> value = 8;
                case 9 -> value = 9;
                case 10, 11, 12, 13 -> value = 10;
            }
        }

    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return name;
    }
}
