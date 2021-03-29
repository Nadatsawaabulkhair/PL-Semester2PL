package CourseSoloLearn.ExceptionsListThreadsFiles;

public class K implements Runnable {
    public void run () {
        System.out.println ( "Bye" );
    }
}
     class App{
        public static void main ( String[] args ) {
            Thread ob = new Thread( new K());
            ob.start ();
        }
    }

