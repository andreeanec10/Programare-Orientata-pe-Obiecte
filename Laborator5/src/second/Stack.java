package second;
import first.Task;

import java.util.ArrayList
public class Stack implements Container {
    public ArrayList<Task> stack = new ArrayList<Task>();

    public Task pop() {
        int dim = stack.size();

        if(dim == 0)
            return null;

        if(dim != 0) {
            Task t = stack.get(dim-1);
            
        }

    }

    public void push(Task task) {
        stack.add(task);
    }

    public int size() { return stack.size(); }

    public boolean isEmpty() {
        int a = stack.size();
        if(a == 1) { return true; }
        else { return false; }

    }
}
