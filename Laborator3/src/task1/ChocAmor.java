package task1;

public class ChocAmor extends CandyBox {
    private float lenght;

    public ChocAmor() {}

    public ChocAmor(float l, String f, String o) {
        lenght = l;
        setFlavor(f);
        setOrigin(o);
    }

    public float getVolume() {
        return this.lenght * this.lenght * this.lenght;
    }

    public String toString() {
        String flavor = getFlavor();
        String origin = getOrigin();
        float volume = getVolume();
        return "The " + origin + " " + flavor + " has volume " + volume;

    }

    public boolean equals(Object c2) {
        if(c2 instanceof ChocAmor)
            return true;
        return false;
    }

    public void printDim() {
        System.out.println("Lungimea " + this.lenght);
    }
}
