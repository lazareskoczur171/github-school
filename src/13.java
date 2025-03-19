import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 5) + 1) + 5;
        System.out.println("A random number between 5 and 10: " + randomNum);
    }
}
