package lab2.task2;

public class Point {
    public float x;
    public float y;

    public Point(){
        this.x = 2;
        this.y = 2;
    }
    public Point(float a, float b){
        this.x = a;
        this.y = b;
    }

    public void changeCoords(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void print(float x, float y){
        System.out.println("(" + x + "," + y + ")");
    }
}
