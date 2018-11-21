//Programming Ex 6

import java.util.Scanner;
public class exSix{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int n;



System.out.println("Enter number for Drive Manufacturer: ");


n = input.nextInt();

switch(n){


case 1:
System.out.println("Western Digital");
break;


case 2:
System.out.println("3M corp.");
break;


case 3:
System.out.println("Maxell corp.");
break;


case 4:
System.out.println("Sony corp.");
break;


case 5:
System.out.println("Verbatim corp. ");
break;


}

}


}