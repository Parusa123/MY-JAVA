import java.util.*;

public class collections1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(7);
    numbers.add(3);
    numbers.add(9);

    System.out.println("Max: " + Collections.max(numbers));
    System.out.println("Min: " + Collections.min(numbers));
  }
}