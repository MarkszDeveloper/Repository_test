import java.util.ArrayList;

public class Generics <T> {
    private T things;

    public Generics(T things) {
        this.things = things;
    }
    public static void printArrayList(ArrayList<?> list) {
        System.out.println(list);
    }
    public T getThings() {
        return things;
    }
    public void setThings(T things) {
        this.things = things;
    }
}
