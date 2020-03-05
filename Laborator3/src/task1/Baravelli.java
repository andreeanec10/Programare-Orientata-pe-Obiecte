package task1;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {}

    public Baravelli(float r, float h, String f, String o) {
        radius = r;
        height = h;
        setFlavor(f);
        setOrigin(o);
    }

    public float getVolume() {
        float pi = (float)3.14;
        return this.radius * pi * this.height;
    }

    public String toString() {
        String flavor = getFlavor();
        String origin = getOrigin();
        float volume = getVolume();
        return "The " + origin + " " + flavor + " has volume " + volume;
    }

    public boolean equals(Object c2) {
        if(c2 instanceof Baravelli)
            return true;
        return false;
    }

    public void printDim() {
        System.out.println("Raza " + this.radius + " inaltimea " + this.height);
    }
}
