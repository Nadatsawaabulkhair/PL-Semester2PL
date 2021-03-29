package CourseSoloLearn.MoreOnClasses;

public class O {
    private int x ;
    public boolean equals ( Object a){
        return ((O)a).x  == this.x;
    }

    public static void main ( String[] args ) {
        O o = new O();
        o.x = 9 ;
        O b = new O ();
        b.x = 5;
        System.out.println (o.equals(b));
    }
}
