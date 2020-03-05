package lab2.task1;

public class Test {
    public static void main(String[] args){
        Complex c1 = new Complex();
        c1.con1(1,1);
        c1.showNumber();

        Complex c2 = new Complex();
        c2.con2();
        c2.showNumber();

        c2.Comp(c1);
        c2.showNumber();

        c1.addWithComplex(c2);
        c1.showNumber();
    }
}
