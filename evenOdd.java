//Program 5.8

import java.util.Scanner;
public class evenOdd{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a;


System.out.println("Enter number: ");


a = input.nextInt();


if( a%2==0 ) 
System.out.println(a + " is Even ");

else
System.out.println(a + " is Odd ");

}




}