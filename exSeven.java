//Programming Ex 7

import java.util.Scanner;
public class exSeven{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int n;
char op;

System.out.println("Enter: \n A for Adventure Movies \n C for Comedy Movies \n F for Family Movies \n H for Horror Movies \n S for Science Fiction Movies ");

op=input.next().charAt(0);


switch(op){


case 'A':
case 'a':
System.out.println("Adventure Movies");
break;


case 'C':
case 'c':
System.out.println("Comedy Movies");
break;


case 'F':
case 'f':
System.out.println("Family Movies");
break;


case 'H':
case 'h':
System.out.println("Horror Movies");
break;


case 'S':
case 's':
System.out.println("Science Fiction Movies");
break;


}

}


}