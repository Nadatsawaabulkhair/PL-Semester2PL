package CourseSoloLearn.ExceptionsListThreadsFiles;
import java.io.File;
public class Working {
    public static void main ( String[] args ) {
        File x = new File ("C://sololearn//test.txt");
        if (x.exists ()){
            System.out.println (x. getName ()+ "exists!");
        }
        else{
            System.out.println ("The file does not exist");
        }
    }
}
