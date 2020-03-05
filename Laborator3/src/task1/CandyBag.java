package task1;

public class CandyBag {

    CandyBox[] array = new CandyBox[4];
    int i = 0;
    public void add(CandyBox c) {
        if(c instanceof Lindt) {
            array[i++] = new Lindt(1,2,3,"f","o");
        }
        if(c instanceof Baravelli) {
            array[i++] = new Baravelli(1,2,"f","o");
        }
        if(c instanceof ChocAmor) {
            array[i++] = new ChocAmor(3,"f","o");
        }
    }
    /*public CandyBag() {
        for (int i = 0; i < 5; i++) {
            this.array[i] = new Lindt(1, 3, 4, "fl", "or");
        }

        for (int i = 5; i < 8; i++) {
            this.array[i] = new Baravelli(1, 3, "fl", "or");
        }

        for (int i = 8; i < 10; i++) {
            this.array[i] = new ChocAmor(6,"fl", "or");
        }
    }*/
}
