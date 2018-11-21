//Programming Ex 5

import java.util.Scanner;
public class exFive{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double number,temp;
char letter;

System.out.println("Enter F to calculate temp in Fahrenheit and C to calculate temp in Celsius: ");
letter=input.next().charAt(0);
System.out.println("Enter number: ");
number=input.nextInt();


if((letter=='c')||(letter=='C')){



temp=(number-32)*0.56;
System.out.println("Temp in C = "+temp);

}

else if((letter=='f')||(letter=='F')){
temp=(number*1.8)+32;
System.out.println("Temp in F = "+temp);
}

}


}