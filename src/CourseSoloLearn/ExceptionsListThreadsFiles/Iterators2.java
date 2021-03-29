package CourseSoloLearn.ExceptionsListThreadsFiles;
import java.util.Iterator;
import java.util.ArrayList;

public class Iterators2 {
    public static void main ( String[] args ) {
        ArrayList<String> list = new ArrayList<> ();
        list.add ( "10" );
        list.add ( "20" );
        list.add ( "30" );

        Iterator<String> it = list.iterator ();
        it.next();
        System.out.println (it.next ());
    }
}
