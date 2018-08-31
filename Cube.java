
/**
 * Gavin Dooley
 * Block 3
 * This calculates the surface area of a cube.
*/
import java.util.Scanner;

public class Cube
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        int edgeLength;
        //Gets input.
        System.out.println("Enter the cube's edge length.");
        edgeLength = reader.nextInt();
        //Calculates and prints.
        int area = 6*(edgeLength*edgeLength);
        System.out.println("The cube's surface area is "+area);
    }
}
