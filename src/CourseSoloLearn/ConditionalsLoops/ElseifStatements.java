package CourseSoloLearn.ConditionalsLoops;

public class ElseifStatements {
    public static void main ( String[] args ) {
        int age = 25;

        if ( age <= 0 ){
            System.out.println ("Errors");
        }else if ( age <= 16 ){
            System.out.println ("Too Young");
        }else if ( age < 100 ){
            System.out.println ("Welcome!");
        }else{
            System.out.println ("really?");
        }
    }
}
