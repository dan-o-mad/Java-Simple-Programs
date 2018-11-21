//Programming Ex 3

import java.util.Scanner;
public class Divisor{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a,b,c;




System.out.println("Enter three numbers: ");


a = input.nextInt();


b = input.nextInt();


c = input.nextInt();



if( a!=0 )

{

if((a/b==0)&&(a/c==0))
System.out.println(a+" Is a Common divisor of "+ b +" and "+c);

else
System.out.println( a+" Is not a Common divisor of " + b + " and " + c );

}


else
System.out.println("a is zero");

}




}