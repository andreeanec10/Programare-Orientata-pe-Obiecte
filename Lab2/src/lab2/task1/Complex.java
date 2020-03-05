package lab2.task1;
public class Complex {
    private int real;
    private int imaginary;

    public void con1(int x, int y){
        this.real = x;
        this.imaginary = y;
    }
    public void con2(){
        con1(0,0);
    }

    public void Comp(Complex c){
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public void setReal(int x){ real = x; }

    public void setImaginary(int y){ imaginary = y; }

    public int getReal(){return real; }

    public int getImaginary(){ return imaginary; }

    public void addWithComplex(Complex comp){
        this.real += comp.real;
        this.imaginary += comp.imaginary;
    }

    public void showNumber(){
        System.out.println(real + " + " + imaginary + "i");
    }

}
