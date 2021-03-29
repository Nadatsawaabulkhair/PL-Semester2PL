package CourseSoloLearn.MoreOnClasses;
enum Color{
    RED,BLUE,GREEN
        }
public class PrintColor {
    public static void main ( String[] args ) {
        Color color = Color.RED;
        switch (color){
            case BLUE:
                System.out.println ("1");
                break;
            default :
                System.out.println ("0");
                break ;
        }
    }
}
