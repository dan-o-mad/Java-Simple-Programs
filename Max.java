//program 5.5

import java.util.Scanner;
public class Max{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int num1,num2,num3;

int max;


System.out.println("Enter first number: ");


num1 = input.nextInt();

System.out.println("Enter 2nd number: ");

num2 = input.nextInt();

System.out.println("Enter 3rd number: ");

num3 = input.nextInt();

max=num1;

if( num2>max )
max = num2;


if( num3>max )
max = num3;

System.out.println("The maximum number is " + max);
}




}