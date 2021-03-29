package CourseSoloLearn.ExceptionsListThreadsFiles;

import java.util.Formatter;

public class Writing {
    public static void main ( String[] args ) {
        try{
            Formatter f = new
                    Formatter ("C://sololearn//test.txt");
            f.format("%s %s %s", "1","Jhon","Smith \r\n");
            f.format("%s %s %s ", "2", "Amy", "Brown");
            f.close();
        }catch (Exception e){
            System.out.println ("Error");
        }
    }
}
