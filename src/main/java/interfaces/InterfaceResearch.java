package interfaces;

import java.awt.*;

public class InterfaceResearch {
    public static void main(String[] args) {

    }
}

interface DoIt {
    void doSomething(int i, double x);
    int doSomethingElse(String s);
}

interface DoitPlust extends DoIt {
    default boolean didItWork(int i, double x, String s) {
        return false;
    }
}

class RectanglePlus implements Relatable {

    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }

    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect
                = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }
}

interface Relatable {
    public int isLargerThan(Relatable other);
}