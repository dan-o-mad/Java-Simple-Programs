//Programming Ex 8

import java.util.Scanner;
public class exEight{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double n;
int op;
double c , l , k , ki;





System.out.println("Enter type of conversion: \n \n 1. Inch to Centimeter \n 2. Gallon to litters \n 3. Mile to Kilometers \n 4. Pound to Kilograms  ");
op=input.nextInt();

System.out.println("Enter value: ");
n=input.nextDouble();

switch(op){

case 1:
c=n*2.54;
System.out.println(c+"Cms");
break;


case 2:
l=n*3.785;
System.out.println(l+"litters");
break;


case 3:
k=n*1.609;
System.out.println(k+"kms");
break;


case 4:
ki=n*0.4536;
System.out.println(ki+"kgs");
break;


default:
System.out.println("Invalid Choice!");


}

}


}