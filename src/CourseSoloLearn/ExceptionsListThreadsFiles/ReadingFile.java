package CourseSoloLearn.ExceptionsListThreadsFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main ( String[] args ) {
        try {
            File x = new File ( "c://sololearn//txt" );
            Scanner sc = new Scanner ( (java.io.File) x );
            while (sc.hasNext ()) {
                System.out.println ( sc.next () );
            }
                sc.close ();
        } catch (FileNotFoundException e) {
            System.out.println ( "Error" );
        }
    }
}
