import java.util.*;

public class collections3 {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Mango");

    int count = Collections.frequency(fruits, "Banana");
    System.out.println("Banana appears: " + count + " times");
  }
}