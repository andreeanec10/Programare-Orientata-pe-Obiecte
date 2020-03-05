package task1;

public class CandyBox {
    private String flavor;
    private String origin;

    //CandyBox c1 = new CandyBox();
    //CandyBox c2 = new CandyBox();

    public CandyBox() {}

    public CandyBox(String flavor,String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
    }

    public float getVolume() {
        return 0;
    }
    public boolean equals(CandyBox c) {
        return true;
    }
    public boolean equals(Object c2) {
        return false;
    }

    public String toString() {
        return "Flavorul este" + this.flavor + " si" +
                "originea este" + this.origin;
    }
    public void printDim(){}
}
