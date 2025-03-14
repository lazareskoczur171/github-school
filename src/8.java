import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(10);
    System.out.println("Number: " + num);
  }
}
