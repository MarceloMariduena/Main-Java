/**********  @author: mmariduena  *******/

import java.util.Scanner;
class Main {

  public static void calculateGrossPay(int hours){
    System.out.println("Your gross pay is $" + hours*8.75 + ".");
  }

  public static void calculateDeduction(double grossSalary){
    if (grossSalary < 50){
      System.out.println("Your deduction amount is $" + grossSalary*0.01 + ".");
      }
    else if (grossSalary < 200) {
      System.out.println("Your deduction amount is $" + grossSalary*0.05 + ".");
    }
    else {
      System.out.println("Your deduction amount is $" + grossSalary*0.08 + ".");
    }
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double hourlyWage = 8.25;


 
    while (true){
      System.out.println("What is your employee number? Enter 0 if you wish to stop.");
      int employeeNumber = input.nextInt();
      if (employeeNumber == 0){
        break;
      }

      System.out.println("How many hours have you worked this week?");
      int hoursWorked = input.nextInt();

      double gross = hoursWorked * 8.75;

      System.out.println("Your employee ID is " + employeeNumber + ".");

      System.out.println("You have worked a total number of " + hoursWorked + " hours.");

      // Prints out gross pay
      calculateGrossPay(hoursWorked);

      // Prints out deduction amount in dollars
      calculateDeduction(gross);

      // Spacing
      System.out.println("");

    }
    
  

    System.out.println("Thank you!");
  }
}
