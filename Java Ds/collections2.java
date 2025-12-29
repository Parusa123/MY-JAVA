import java.util.*;

public class collections2 {
  public static void main(String[] args) {
    ArrayList<String> cards = new ArrayList<>();
    cards.add("Ace");
    cards.add("King");
    cards.add("Queen");
    cards.add("Jack");

    Collections.shuffle(cards);
    System.out.println(cards);
  }
}