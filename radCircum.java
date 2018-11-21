//Program 5.14

import java.util.Scanner;
public class radCircum{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int choice;
double a,c,r;


System.out.println("Enter Radius: ");


r = input.nextInt();

System.out.println("Enter 1 for Area and 2 for Circumference: ");


choice = input.nextInt();


if( choice==1 ){
a = r*r*3.14;
System.out.println("Area: " + a);

}
else if( choice==2 ){
c=2*3.14*r;
System.out.println("Circumference: " + c);}

else
System.out.println("Invalid choice!");
}




}