package hu.nyirszikszi.haromszog;

public class Haromszog {
    private int a;
    private int b;
    private int c;

    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isHaromszog() {
        if (this.b + this.c > this.a && this.a + this.c > this.b && this.a + this.b > this.c) {
            return true;
        }
        else {
            return  false;
        }
    }
}