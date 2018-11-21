//Program 5.29

import java.util.Scanner;
public class Divi{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int n;



System.out.println("Enter number: ");


n = input.nextInt();

System.out.println((n%3==0 ?) + "Divisible by 3" : "Not divisible by 3" );

}


}