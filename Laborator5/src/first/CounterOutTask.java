package first;

public class CounterOutTask implements Task {
    public static int contor;
    public CounterOutTask() {
        System.out.println(contor++);
    }

    public void execute() {
        System.out.println("Ceva");
    }
}
