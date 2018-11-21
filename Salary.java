//Program 5.10

import java.util.Scanner;
public class Salary{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double salary, bonus, grade;


System.out.println("Enter Salary: ");


salary = input.nextDouble();


System.out.println("Enter Grade: ");


grade = input.nextDouble();

if( grade>15 )
bonus=salary*50/100;
 
else
bonus=salary*25/100;

salary = salary+bonus;

System.out.println("Your total Salary is " + salary);

}




}