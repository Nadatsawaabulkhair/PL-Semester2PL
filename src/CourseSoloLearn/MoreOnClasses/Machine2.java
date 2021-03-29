package CourseSoloLearn.MoreOnClasses;

public class Machine2 {
    public static void main ( String[] args ) {
        Machine m1 = new Machine(){
            @Override public void start () {
                System.out.println ("Woooo");
            }
    };
}
            public void start() {
                System.out.println ( "Starting..." );

                Machine m2 = new Machine ();
                m2.start ();
            }
}