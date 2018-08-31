
/**
 * Gavin Dooley
 * Block 3
 * 
 * This program calcultaes an employee's total weekly pay.
 */
import java.util.Scanner;
public class Pay
{
    public static void main(String [] args){
        Scanner reader=new Scanner(System.in);
        //Creates variables.
        double hourlyWage;
        double totalRegularHours;
        double totalOvertimeHours;
        double totalWeeklyPay;
        
        //Gets input.
        System.out.println("Enter the hourly wage.");
        hourlyWage = reader.nextDouble();
        System.out.println("Enter the total regular hours worked this week.");
        totalRegularHours = reader.nextDouble();
        System.out.println("Enter the total overtime hours worked this week.");
        totalOvertimeHours = reader.nextDouble();
        
        //Calculates and prints.
        totalWeeklyPay =  totalRegularHours*hourlyWage + 
            1.5*totalOvertimeHours*hourlyWage;
        System.out.println("You get $"+totalWeeklyPay+"!");
    }
}
