//Programming Ex 1


import java.util.Scanner;
public class exOne{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

char ch;

System.out.println("Enter any character: ");


ch = input.next().charAt(0);


if(( ch>='a') && (ch<='z')) {
System.out.println("Entered character is a lowercase letter");}



else  {
System.out.println("Entered character is not a lowercase letter");}



}



}