//Program 5.12

import java.util.Scanner;
public class Grade{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int score;


System.out.println("Enter your test score: ");


score = input.nextInt();

if( score>=90 ){
System.out.println("Your grade is A ");
}
else if( score>=80 ){
System.out.println("Your grade is B ");
}
else if( score>=70 )
System.out.println("Your grade is C ");

else if( score>=60 )
System.out.println("Your grade is D ");

else
System.out.println("Your grade is F ");



}




}