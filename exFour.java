//Programming Ex 4

import java.util.Scanner;
public class exFour{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double area,side,base,height;
char op;

System.out.println("Enter S to calculate area of square and T to calculate area of Triangle: ");
op=input.next().charAt(0);

if((op=='s')||(op=='S')){

System.out.println("Enter value for side of Square: ");
side = input.nextDouble();
area=side*side;
System.out.println("Area of a Square = "+area);

}

else if((op=='t')||(op=='T')){

System.out.println("Enter values of Base & Height of a Triangle: ");
base = input.nextDouble();
height = input.nextDouble();

area=0.5*base*height;


System.out.println("Area of a Triangle = "+area);
}

}


}