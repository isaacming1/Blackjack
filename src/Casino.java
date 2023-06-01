
import java.util.ArrayList;
public class Casino {

    ArrayList<Card> deck = new ArrayList<>();

    public static void main(String[] args){
        Casino table = new Casino();
    }

    public Casino(){
        for (int i=0;i < 4; i++){

            deck.add(new Card(i, 1));
        }


    }

    public void printDeck(){

    }

    public void shuffle(){

        for(int x = 0; x < 52; x++) {


            Card temp = deck.get(x);
            int r = (int) (Math.random() * 4);
            deck.set(x, deck.get(r));
            deck.set(r, temp);

        }
    }



    public void deal(){

        }

        }

