//Programming Ex 2


import java.util.Scanner;
public class exTwo{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int sen=400;
int jun=275;
char status;

System.out.println("Enter Status Character: ");


status = input.next().charAt(0);


if(( status=='s') || (status=='S')) {
System.out.println("Salary: " + sen);}



else if (( status=='j') || (status=='J'))  {
System.out.println("Salary: " + jun);}

else
System.out.println("Invalid character! ");



}



}