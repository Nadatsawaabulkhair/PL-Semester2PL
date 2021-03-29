package CourseSoloLearn.MoreOnClasses;

 class N {
    public void doSomething () {
        System.out.println ( "N" );
    }

    public void doSomething ( String str ) {
        System.out.println ( str );

    }
}
 class R {
     public static void main ( String[] args ) {
         N object = new N ();
         object.doSomething ("R");
     }
}