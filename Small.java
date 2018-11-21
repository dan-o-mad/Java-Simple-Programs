//Program 5.16

import java.util.Scanner;
public class Small{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a,b,c;


System.out.println("Enter three numbers: ");


a = input.nextInt();

b = input.nextInt();

c = input.nextInt();



if(a<b)
if(a<c)
System.out.println(a + " is smallest");
else
System.out.println(c + " is smallest");

else if(b<c)
System.out.println(b + " is smallest");
else
System.out.println(c + " is smallest");





}




}