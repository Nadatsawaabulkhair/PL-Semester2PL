package CourseSoloLearn.ExceptionsListThreadsFiles;

public class H extends Thread{
    public void run(){
        System.out.println ("Hello");
    }

    public static void main ( String[] args ) {
        H object = new H();
        object.start ();
    }
}
