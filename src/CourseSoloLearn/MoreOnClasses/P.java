package CourseSoloLearn.MoreOnClasses;

public class P {
    private void print(){
        System.out.println ("p");
    }
private void print (String str){
    System.out.println ("q");
}
private void print (int x){
    System.out.println ("r");
}

    public static void main ( String[] args ) {
        P object = new P();
        object.print (12);
    }
}