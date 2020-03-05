package lab2.task2;

public class Polygon {
    public Point[] points;

    public Polygon(int n){
        int i;
        this.points = new Point[n];
        for(i = 0; i < n; i++)
            this.points[i] = new Point(1,2);
    }

    public Polygon(float v[], int n){
        int i = 0;
        this.points = new Point[n];
        for(i = 0; i < n; i++)
            this.points[i] = new Point(1,2);
        int j = 0;
        for(i = 0; i < 2 * n; i += 2){
            this.points[j].changeCoords(v[i],v[i+1]);
            j++;

       }
    }
}
