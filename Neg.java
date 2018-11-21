import java.util.Scanner;
public class Neg{

public static void main( String []args ){

Scanner input = new Scanner( System.in );

int num1;


System.out.println("Enter a number: ");


num1 = input.nextInt();


if( num1>0 )
System.out.println("The number is positive");


if( num1<0 )
System.out.println("The number is negative");

if( num1==0 )
System.out.println("The number is zero ");


}




}