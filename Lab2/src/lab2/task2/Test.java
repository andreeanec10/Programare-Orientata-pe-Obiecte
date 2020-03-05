package lab2.task2;

public class Test {
    public static void main(String[] args) {
        Polygon p = new Polygon(3);
        float[] v = {2, 2, 4, 9, 10, 2};
         p = new Polygon(v,3);
        for (int i = 0; i < 3; i++) {
            p.points[i].print(p.points[i].x, p.points[i].y);
        }
    }


    }

