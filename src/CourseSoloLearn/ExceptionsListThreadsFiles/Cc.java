package CourseSoloLearn.ExceptionsListThreadsFiles;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cc {
    public static void main ( String[] args ) {
        LinkedList<String> c = new LinkedList<String> ();
        c.add ( "Red" );
        c.add ( "Blue" );
        c.add ( "Green" );
        c.add ( "Orange" );
        c.remove ( "Green" );
        for (String s : c) {
            System.out.println ( s );
        }
    }
}
