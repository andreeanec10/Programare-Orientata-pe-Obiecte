package first;

import java.util.Random;

public class RandomOutTask implements Task {
    public RandomOutTask() {
        Random rand = new Random();
        int a = rand.nextInt(100);
        System.out.println(a);
    }
    public void execute() {
        System.out.println("Ceva");
    }
}