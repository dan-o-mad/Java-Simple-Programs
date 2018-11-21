//Programming Ex 17

import java.util.Scanner;
public class exSeventeen{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double n;
int op;
double c , l , k , ki;





System.out.println("Enter type of conversion: \n \n 1. Centimeter to Inches  \n 2. litter to Gallons \n 3. Kms to Miles \n 4. Kgs to Pounds  ");
op=input.nextInt();

System.out.println("Enter value: ");
n=input.nextDouble();

switch(op){

case 1:
c=n*0.394;
System.out.println(c+"Inches");
break;


case 2:
l=n*0.264;
System.out.println(l+"gallons");
break;


case 3:
k=n*0.622;
System.out.println(k+"miles");
break;


case 4:
ki=n*2.2;
System.out.println(ki+"pounds");
break;


default:
System.out.println("Invalid Choice!");


}

}


}