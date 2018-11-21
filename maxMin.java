import java.util.Scanner;
public class maxMin{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a,b,c,d,e,max,min;


System.out.println("Enter five integers: ");


a = input.nextInt();

b = input.nextInt();

c = input.nextInt();

d = input.nextInt();

e = input.nextInt();

min=max=a;

if( b<min )
min = b;

if( c<min )
min = c;

if( d<min )
min = d;

if( e<min )
min = e;






if( b>max )
max = b;

if( c>max )
max = c;

if( d>max )
max = d;

if( e>max )
max = e;


System.out.println("The Largest number is " + max);

System.out.println("The smallest number is " + min);
}




}