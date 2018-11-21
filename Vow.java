//Program 5.19

import java.util.Scanner;
public class Vow{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

char ch;

System.out.println("Enter any character: ");


ch = input.next().charAt(0);

if( ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
System.out.println("You entered a vowel: " + ch);
}

else
System.out.println("You did not enter a vowel: " + ch);

}



}