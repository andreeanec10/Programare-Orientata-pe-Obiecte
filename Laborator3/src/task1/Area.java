package task1;

public class Area {
    public CandyBag bag;
    public int number;
    public String street;

    public Area() {}

    public Area(CandyBag b, int n, String s) {
        this.bag = b;
        this.number = n;
        this.street = s;
    }

    public void getBirthdayCard() {
        System.out.println(street + " " + number);
        System.out.println("La multi ani!");
    }
    Lindt l = new Lindt(0,0,0,"","");
    Baravelli ba = new Baravelli(0,0,"","");
    ChocAmor c = new ChocAmor(0,"","");

    public void toString(CandyBag b) {
        String string = "";
        for(int i = 0; i < 4; i++) {
                b.array[i].printDim();
                System.out.println("\n");
            }
        //return string;
    }
}
