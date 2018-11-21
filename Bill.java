//Program 5.13

import java.util.Scanner;
public class Bill{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int units;
double bill;


System.out.println("Enter units consumed: ");


units = input.nextInt();


if( units>500 )
bill = units*7;


else if( units>300 )
bill = units*5;

else
bill=units*2;

bill=bill+150;

if(bill>2000)
bill=bill+(bill*5/100);



System.out.println("Total bill= " + bill);
}




}