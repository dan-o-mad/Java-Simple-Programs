//Program 5.11

import java.util.Scanner;
public class Multiple{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int num1,num2;


System.out.println("Enter first Integer: ");


num1 = input.nextInt();

System.out.println("Enter 2nd Integer: ");


num2 = input.nextInt();




if( num1%num2==0 )
System.out.println("The first num is a multiple of 2nd ");




 
else


System.out.println("The first num is not a multiple of 2nd ");

}




}