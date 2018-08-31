
/**
 * Gavin Dooley
 * Block 3
 */
import java.util.Scanner;
public class CriticalThinking
{
    public static void main(String [] args){
        //Creates variables.
        Scanner stringReader =new Scanner(System.in);
        Scanner intReader = new Scanner(System.in);
        String lastName;
        String firstName;
        int classYear;
        String campusPhone;
        
        
        //Gets input.
        System.out.println("Enter your last name.");
        lastName = stringReader.nextLine();
        System.out.println("Enter your first name.");
        firstName = stringReader.nextLine();
        System.out.println("Enter your class year.");
        classYear = intReader.nextInt();
        System.out.println("Enter your campus phone.");
        campusPhone = stringReader.nextLine();
        
        //Displays output.
        System.out.println("Your last name is "+lastName);
        System.out.println("Your first name is "+firstName);
        System.out.println("Your class year is "+classYear);
        System.out.println("Your campus phone is "+campusPhone);
    }
}
