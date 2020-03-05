package task1;

public class Lindt extends CandyBox {
    private float lenght;
    private float width;
    private float height;

    public Lindt() {}

    public Lindt(float l,float w,float h, String f,String o) {
        lenght = l;
        width = w;
        height = h;
        setFlavor(f);
        setOrigin(o);
    }

    public Lindt(Lindt c) {
        this.lenght = c.lenght;
        this.width = c.width;
        this.height = c.height;
        setFlavor(c.getFlavor());
        setOrigin(c.getOrigin());
    }



    public float getVolume(int l, int h, int w) {
        return this.lenght * this.height * this.width;
    }

    public String toString() {
        String flavor = getFlavor();
        String origin = getOrigin();
        float volume = getVolume();
        return "The " + origin + " " + flavor + " has volume " + volume;
    }

    public void printDim() {
        System.out.println("Lungime " + lenght + " latime " + width + " inaltime " + height);
    }
}
