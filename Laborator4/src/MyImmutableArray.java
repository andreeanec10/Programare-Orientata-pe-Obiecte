import java.util.ArrayList;

public class MyImmutableArray {
    private ArrayList<Integer> immutableArray;

    public MyImmutableArray( ArrayList<Integer> c) {
        for(int i = 0; i < c.size(); i++)
            immutableArray.add(c.get(i));
    }

    public void getArray() {

    }
}
