package CourseSoloLearn.ExceptionsListThreadsFiles;

import java.util.Formatter;

public class Creating {
    public static void main ( String[] args ) {
        try{
            Formatter f = new
                    Formatter ("C.//sololearn//test.txt");
        }catch (Exception e){
            System.out.println ("Error");
        }
    }
}
