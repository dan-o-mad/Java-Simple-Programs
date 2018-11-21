//Program 5.18

import java.util.Scanner;
public class Maxium{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a,b,c;

System.out.println("Enter three numbers: ");


a = input.nextInt();

b = input.nextInt();

c = input.nextInt();



if(a>b&&a>c)
System.out.println("Maximum number is " + a);

else if(b>a&&b>c)
System.out.println("Maximum number is " + b);

else 
System.out.println("Maximum number is " + c);




}



}