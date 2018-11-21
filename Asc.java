//Program 5.27

import java.util.Scanner;
public class Asc{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int num,option;
char letter;



System.out.println("1. Convert ASCII value to character ");
System.out.println("2. Convert character to ASCII value ");
System.out.println("Enter your choice: ");

option = input.nextInt();

switch(option){


case 1:
System.out.println("Enter a number: ");
num = input.nextInt();
System.out.println("The corresponding character is " + char(num) );
break;


case 2:
System.out.println("Enter a letter: ");
letter = input.next().charAt(0);
System.out.println("ASCII value of the letter is " + int(letter) );
break;


default:
System.out.println("Invalid Number!");
break;


}

}


}