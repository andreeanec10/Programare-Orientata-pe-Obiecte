import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class NumerePare extends HashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if (integer % 2 == 0) {
            return super.add(integer);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        HashSet<Integer> par = new HashSet<>();
        for (Integer o : c) {
            if (o % 2 == 0) {
                par.add(o);
            }
        }
        return super.addAll(par);
    }
}
