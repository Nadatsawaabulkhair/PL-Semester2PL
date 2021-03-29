package CourseSoloLearn.MoreOnClasses;

public class Z {
    public void print(){
        System.out.println ("Z");
    }
}
    class X {
        public static void main ( String[] args ) {
            Z object = new Z () {
                @Override
                public void print () {
                    System.out.println ( "Hello" );
                }
            };
            object.print ();
        }
    }