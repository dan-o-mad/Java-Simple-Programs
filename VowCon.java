//Program 5.24

import java.util.Scanner;
public class VowCon{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

char ch;

System.out.println("Enter any Alphabet: ");


ch = input.next().charAt(0);

switch(ch){

case 'a':
case 'A':
System.out.println("You entered a vowel ");
break;

case 'e':
case 'E':
System.out.println("You entered a vowel ");
break;

case 'i':
case 'I':
System.out.println("You entered a vowel ");
break;

case 'o':
case 'O':
System.out.println("You entered a vowel ");
break;

case 'u':
case 'U':
System.out.println("You entered a vowel ");
break;

default:
System.out.println("Not vowel");

}


}



}