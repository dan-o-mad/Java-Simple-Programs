//Program 5.23

import java.util.Scanner;
public class Week{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int n;



System.out.println("Enter number of a Weekday: ");


n = input.nextInt();

switch(n){


case 1:
System.out.println("Friday");
break;


case 2:
System.out.println("Saturday");
break;


case 3:
System.out.println("Sunday");
break;


case 4:
System.out.println("Monday");
break;


case 5:
System.out.println("Tuesday");
break;


case 6:
System.out.println("Wednesday");
break;


case 7:
System.out.println("Thursday");
break;


default:
System.out.println("Invalid Number!");


}

}


}