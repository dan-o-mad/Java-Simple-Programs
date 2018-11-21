//Programming Ex 14

import java.util.Scanner;
public class exFourteen{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double salary;



System.out.println("Enter Salary: ");


salary = input.nextInt();

if(salary>30000){
System.out.println("Total salary = "+ salary);
double d=0.20*salary;
System.out.println("Income Tax = "+ d);
double t=salary-d;
System.out.println("Total salary after deduction = "+ t);
}


else if((salary>=20000)&&(salary<=30000)){
System.out.println("Total salary = "+ salary);
double d=0.10*salary;
System.out.println("Income Tax = "+ d);
double t=salary-d;
System.out.println("Total salary after deduction = "+ t);
}


if(salary<20000){
System.out.println("Total salary = "+ salary);
double d=0.10*salary;
System.out.println("Income Tax = "+ d);
double t=salary-d;
System.out.println("Total salary after deduction = "+ t);
}


}


}