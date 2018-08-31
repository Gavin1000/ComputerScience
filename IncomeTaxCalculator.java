
/**
 * Gavin Dooley
 * Block 3
 * 
 * This program calculates a person's income tax.
 */
import java.util.Scanner;

public class IncomeTaxCalculator
{
    public static void main(String [] args){
        //Here, constants are created.
        final double TAX_RATE = 0.20;
        final double STANDARD_DEDUCTION = 10000.0;
        final double DEPENDENT_DEDUCTION = 2000.0;
        
        Scanner reader = new Scanner(System.in);
        
        double grossIncome;
        int numDependents;
        double taxableIncome;
        double incomeTax;
        
        //Numbers are inputted.
        System.out.print("Enter the gross income: ");
        grossIncome = reader.nextDouble();
        System.out.print("Enter the number of dependents: ");
        numDependents = reader.nextInt();
        
        //Values are calculated and printed.
        taxableIncome = grossIncome - STANDARD_DEDUCTION -
                        DEPENDENT_DEDUCTION * numDependents;
        incomeTax = taxableIncome * TAX_RATE;
        
        System.out.println("The income tax is $" + incomeTax);
        
        System.out.println("The gross income is $" + grossIncome);
        System.out.println("The number of dependents is $" + numDependents);
        System.out.println("The taxable income is $" + taxableIncome);
    }
}

