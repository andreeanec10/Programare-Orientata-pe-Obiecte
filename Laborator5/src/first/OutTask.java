package first;

public class OutTask implements Task {
    public OutTask(String s) {
        System.out.println(s);
    }
    public void execute(){
        System.out.println("Ceva");
    }
}