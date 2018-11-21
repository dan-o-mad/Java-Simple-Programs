//Program 5.20

import java.util.Scanner;
public class Det{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

char ch;

System.out.println("Enter any character: ");


ch = input.next().charAt(0);

if(( ch>='A') && (ch<='Z')){ 
System.out.println("The character " + ch + " is a capital letter");}

else if(( ch>='a') && (ch<='z')) {
System.out.println("The character " + ch + " is a small case letter");}

else if(( ch>='0') && (ch<='9')) {
System.out.println("The character " + ch + " is a Digit");}

else  
System.out.println("The character " + ch + " is a symbol");



}



}