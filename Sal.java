//Program 5.15

import java.util.Scanner;
public class Sal{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int salary;

double net;

System.out.println("Enter Salary: ");


salary = input.nextInt();



if( salary>=20000 )
net=salary-(salary*7/100);

else if(salary>=10000)
net=salary-1000;

else
net=salary;

System.out.println("Your net Salary is: " + net);


}




}