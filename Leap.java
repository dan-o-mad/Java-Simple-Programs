//Program 5.9

import java.util.Scanner;
public class Leap{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a;


System.out.println("Enter a year: ");


a = input.nextInt();


if( a%4==0 ) 
System.out.println(a + " is a leap year ");

else
System.out.println(a + " is a not leap year ");

}




}