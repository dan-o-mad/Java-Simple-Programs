//Program 5.26

import java.util.Scanner;
public class Cha{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int choice,months;
double charges=0;



System.out.println("Health club membership menu \n");

System.out.println("1. Standard adult membership ");
System.out.println("2. Child membership ");
System.out.println("3. Senior citizen membership ");

System.out.println("4. Quit the program \n");


System.out.println("Enter your choice: ");


choice = input.nextInt();

if(choice>=1&&choice<=3){
System.out.println("For how many months?");
months = input.nextInt();


switch(choice){


case 1:
charges=months*50.0;
break;


case 2:
charges=months*20.0;
break;


case 3:
charges=months*30.0;
break;

default:
System.out.println("Invalid Number!");


}


System.out.println("The total charges are Rs " + charges);
}

else if(choice!=4){
System.out.println("The valid choices are 1 to 4 ");
System.out.println("Run the program again and select one of these ");

}

}


}