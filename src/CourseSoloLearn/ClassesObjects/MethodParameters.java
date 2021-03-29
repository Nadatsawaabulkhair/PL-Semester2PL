package CourseSoloLearn.ClassesObjects;

public class MethodParameters {
    static void sayHello(String name){
        System.out.println ("Hello " + name);
    }

    public static void main ( String[] args ) {
        sayHello ( "David" );
        sayHello ( "Amy" );
    }
}
