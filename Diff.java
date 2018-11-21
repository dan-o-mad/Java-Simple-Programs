//Program 5.17

import java.util.Scanner;
public class Diff{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a,b,c;

System.out.println("Enter three numbers: ");


a = input.nextInt();

b = input.nextInt();

c = input.nextInt();



if(a==b)
if(a==c)
System.out.println("All numbers are equal");
else
System.out.println("Numbers are different");

else 
System.out.println("Numbers are different");




}



}