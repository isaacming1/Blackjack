public class Card {

    public String suit;

    public String name;

    public int cardValue;

    public Card(int suitNum, int cardNum){
        if (suitNum == 0) {
            suit = "Spades";
        } else if (suitNum == 1) {
            suit = "Hearts";
        } else if (suitNum == 2) {
            suit = "Diamonds";
        } else if (suitNum == 3) {
            suit = "Clubs";
        }

        if (cardNum == 1) {
            name = "Ace";
            cardValue = 11;
        } else if (cardNum >= 2 && cardNum <= 10) {
            name = String.valueOf(cardNum);
            cardValue = cardNum;
        } else if (cardNum == 11) {
            name = "Jack";
            cardValue = 10;
        } else if (cardNum == 12) {
            name = "Queen";
            cardValue = 10;
        } else if (cardNum == 13) {
            name = "King";
            cardValue = 10;
        }
    }

        }




