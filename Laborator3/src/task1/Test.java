package task1;

public class Test {
    public static void main(String[] args) {
        CandyBox candy = new CandyBox();

        Lindt candy1 = new Lindt(1,2,3,"fl1","or1");
        Baravelli candy2 = new Baravelli(2,3,"fl2","or2");
        ChocAmor candy3 = new ChocAmor(4,"fl3","or3");
        Lindt candy4 = new Lindt(1,2,3,"fl1","or1");
        Integer x = 5;

        //System.out.println(candy1.toString());
        //System.out.println(candy2.toString());
        //System.out.println(candy3.toString());
        //System.out.println(candy1.equals(candy2));
        //System.out.println(candy1.equals(x));


        CandyBag bag = new CandyBag();
        bag.add(candy1);
        bag.add(candy2);
        bag.add(candy3);
        bag.add(candy4);
        Area a = new Area(bag,24,"Strada");
        System.out.println(candy1.equals(bag));

        candy1.printDim();
        candy2.printDim();
        candy3.printDim();

        a.getBirthdayCard();
        a.toString(a.bag);
    }
}
