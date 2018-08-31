/**
 * Gavin Dooley
 * Block 3
 * 
 * This program calcultaes an employee's total weekly pay.
 */
import java.util.Scanner;
public class Overtime
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
        
        System.out.println("Enter the regular hours worked on Monday.");
        totalRegularHours = reader.nextDouble();
        System.out.println("Enter the overtime hours worked on Monday.");
        totalOvertimeHours = reader.nextDouble();
        
        System.out.println("Enter the regular hours worked on Tuesday.");
        totalRegularHours = reader.nextDouble() + totalRegularHours;
        System.out.println("Enter the overtime hours worked on Tuesday.");
        totalOvertimeHours = reader.nextDouble() + totalOvertimeHours;
        
        System.out.println("Enter the regular hours worked on Wednesday.");
        totalRegularHours = reader.nextDouble() + totalRegularHours;
        System.out.println("Enter the overtime hours worked on Monday.");
        totalOvertimeHours = reader.nextDouble() + totalOvertimeHours;
        
        System.out.println("Enter the regular hours worked on Thursday.");
        totalRegularHours = reader.nextDouble() + totalRegularHours;
        System.out.println("Enter the overtime hours worked on Thursday.");
        totalOvertimeHours = reader.nextDouble() + totalOvertimeHours;
        
        System.out.println("Enter the regular hours worked on Friday.");
        totalRegularHours = reader.nextDouble() + totalRegularHours;
        System.out.println("Enter the overtime hours worked on Friday.");
        totalOvertimeHours = reader.nextDouble() + totalOvertimeHours;

        //Calculates and prints.
        totalWeeklyPay =  totalRegularHours*hourlyWage + 
            1.5*totalOvertimeHours*hourlyWage;
        System.out.println("You get $"+totalWeeklyPay+"!");
    }
}