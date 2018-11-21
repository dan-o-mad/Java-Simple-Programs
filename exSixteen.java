//Programming Ex 16

import java.util.Scanner;
public class exSixteen{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double n;
char t;
double charges;



System.out.println(" M      = Motorcycle \n C      = Car \n B      = Bus \n ");

System.out.println("Enter Type of vehicle: ");
t = input.next().charAt(0);
System.out.println("Number of days to park: ?");
n = input.nextDouble();

switch(t){


case 'M':
case 'm':
charges=n*10;
System.out.println("Charges: "+ charges);
break;

case 'C':
case 'c':
charges=n*20;
System.out.println("Charges: "+ charges);
break;


case 'B':
case 'b':
charges=n*30;
System.out.println("Charges: "+ charges);
break;



}

}


}