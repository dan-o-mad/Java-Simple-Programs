//Programming Ex 9

import java.util.Scanner;
public class exNine{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int n;



System.out.println("Enter a year: ");


n = input.nextInt();

if(n/4==0)
{
if(n/100==0)
if(n/400==0)
System.out.println("Leap Year");

}

else
System.out.println("Not a Leap Year");



}


}