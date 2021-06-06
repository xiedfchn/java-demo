package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class GenericResearch {
    public static void main(String[] args) {
    }

}

class GenericMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(4,5));

        List<String> sl = new ArrayList<>(Arrays.asList("A"));
        Collection<String> sc = new ArrayList<>(Arrays.asList("B"));
        fromArrayToCollection(sl, sc);
    }

    public static <T> void fromArrayToCollection(List<T> a, Collection<T> c) {
        for (T o: a) {
            c.add(o);
        }
        System.out.print(c);
    }
}

class WildCard {

    public static void main(String[] args) {
        List<Circle> list = Arrays.asList(new Circle(), new Circle());
        printCollection(list);
        drawAll(list);
    }

    public static void  drawAll(List<? extends Shape> shapes) {
        for(Shape shape: shapes) {
            shape.draw();
        }
    }

    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
}

interface Shape {
    public  void draw();
}

class Circle implements Shape {
    public void draw() {

    }
}

class Rectangle  implements Shape {
    public void draw() {

    }
}

