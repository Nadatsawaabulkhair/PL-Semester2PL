package CourseSoloLearn.MoreOnClasses;

public class T {
    private int x;

    public static void main ( String[] args ) {
        T t = new T();
        t.x = 5;
        T b = new T();
        b.x = 5;
        System.out.println (t==b);
    }
}
